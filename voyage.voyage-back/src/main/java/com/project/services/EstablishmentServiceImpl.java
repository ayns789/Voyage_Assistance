package com.project.services;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.dtos.EstablishmentCreateDto;
import com.project.dtos.EstablishmentViewDto;
import com.project.dtos.LikeEstablishmentDto;
import com.project.entities.Account;
import com.project.entities.Establishment;
import com.project.entities.LikeEstablishment;
import com.project.repositories.AccountJpaRepo;
import com.project.repositories.EstablishmentJpaRepo;
import com.project.repositories.LikeEstablishmentJpaRepo;

@Service
public class EstablishmentServiceImpl implements EstablishmentService {
	
	private final EstablishmentJpaRepo repo;
	
	private final LikeEstablishmentJpaRepo likeRepo;
	
	private final AccountJpaRepo accountRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	protected EstablishmentServiceImpl(EstablishmentJpaRepo repo,
			LikeEstablishmentJpaRepo likeRepo,
			AccountJpaRepo accountRepo) {
		this.repo = repo;
		this.likeRepo = likeRepo;
		this.accountRepo = accountRepo;
	    }
	
	private void populateEntity(EstablishmentCreateDto establishment, Establishment entity) {
		mapper.map(establishment, entity);
	    }
	
	@Override
	public List<EstablishmentViewDto> getAll() {
		return repo.getAllProjectBy();
	}
	
	@Override
	public EstablishmentViewDto getOne(Long id) {
		return repo.getById(id);
		}

	@Override
	public void create(EstablishmentCreateDto establishment) {
		Establishment entity = mapper.map(establishment, Establishment.class);
		repo.save(entity);
		
	}

	@Override
	public EstablishmentCreateDto one(Long id) {
		Establishment entity = repo.findById(id).get();
		EstablishmentCreateDto establishment = new EstablishmentCreateDto();
		establishment.setName(entity.getName());
		establishment.setAddress(entity.getAddress());
		establishment.setCapacity(entity.getCapacity());
		establishment.setCategory(entity.getCategory());
		establishment.setDescriptive(entity.getDescriptive());
		return establishment;
	}

	@Override
	public void update(Long id, EstablishmentCreateDto establishment) {
		// TODO Auto-generated method stub
		Establishment entity = repo.findById(id).get();
		populateEntity(establishment, entity);
		repo.save(entity);
		
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
		
	}
	
	static LikeEstablishment asLikedEsta(Account likerId, Establishment establishmentId) {
		LikeEstablishment entity = new LikeEstablishment();
		entity.setLikerId(likerId);
		entity.setEstablishmentId(establishmentId);
		return entity;
	}
	
	@Override
    public void like(LikeEstablishmentDto dto) {
	Account liker = accountRepo.findById(dto.getLikerId()).get();
	Establishment establishment = repo.findById(dto.getEstablishmentId()).get();
	LikeEstablishment likeEstablishment = asLikedEsta(liker, establishment);
	likeRepo.save(likeEstablishment); // Do not return saved entity
    }

    @Override
    public void unlike(LikeEstablishmentDto dto) {
	Long likerId = dto.getLikerId();
	Long establishmentId = dto.getEstablishmentId();
	likeRepo.deleteByLikerIdAndEstablishmentId(likerId, establishmentId);
    }

}

