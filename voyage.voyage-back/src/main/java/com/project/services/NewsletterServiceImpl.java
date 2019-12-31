package com.project.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dtos.user.NewsletterDto;
import com.project.entities.Newsletter;
import com.project.repositories.NewsletterRepo;

@Service
public class NewsletterServiceImpl implements NewsletterService {
	
	private final NewsletterRepo repo;
	
	@Autowired
	private ModelMapper mapper;
	
	protected NewsletterServiceImpl (NewsletterRepo repo) {
		this.repo = repo;
	}

	@Override
	public void create(NewsletterDto newsletter) {
		Newsletter entity = mapper.map(newsletter, Newsletter.class);
		repo.save(entity);
	}
}
