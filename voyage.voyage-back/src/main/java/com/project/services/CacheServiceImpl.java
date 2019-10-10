package com.project.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

@Service
public class CacheServiceImpl implements CacheService {

	@Autowired
    CacheManager cacheManager;

    protected CacheServiceImpl(){

    }

    @Override
    public void clearCacheRegion(String region) {
        cacheManager.getCache(region).clear();
    }

    @Override
    public void clearCacheRegions() {

    	Collection<String> regionNames = cacheManager.getCacheNames();
    	for(String regionName : regionNames) {
    		cacheManager.getCache(regionName).clear();
    	}
    }
	
}
