package com.project;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;

// pour utiliser la memoire cache pour répertorier des référentiels en cache
// @EnableCaching
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	// dependance ModelMapper dans le pom.xml
	@Bean
	public ModelMapper mapper() {
		return new ModelMapper();
	}
	
	@Bean
	public CacheManager createSimpleCacheManager() {
		SimpleCacheManager simpleCacheManager = new SimpleCacheManager();
		List<Cache> caches = new ArrayList<>();
		// ConcurrentCacheManager pour gérer les demandes identiques en parallèle
		caches.add(new ConcurrentMapCache("subjects"));
		simpleCacheManager.setCaches(caches);
		return simpleCacheManager;
	}

}
