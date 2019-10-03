package com.project.services;

import org.springframework.stereotype.Service;

@Service
public interface CacheService {
	
	void clearCacheRegion(String region);

    void clearCacheRegions();

}
