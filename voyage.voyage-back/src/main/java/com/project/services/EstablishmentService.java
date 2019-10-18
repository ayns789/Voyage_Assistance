package com.project.services;

import java.util.List;
import com.project.dtos.user.EstablishmentViewDto;

public interface EstablishmentService {
	
	List<EstablishmentViewDto> getAll();

	EstablishmentViewDto getOne(Long id);

}
