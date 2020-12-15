package com.microsg2.microsg2article.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.microsg2.microsg2article.config.CustomProperties;
import com.microsg2.microsg2article.model.YCategory;

@Repository
public class CategoryProxy {

	@Autowired
	public RestTemplate restTemplate;
	
	@Autowired
	private CustomProperties props;
	
	public YCategory getCategory(int id) {
		String getCategoryUrl = "http://localhost:9004/category/" + id;
		ResponseEntity<YCategory> response = restTemplate.exchange(getCategoryUrl, HttpMethod.GET, null, YCategory.class);
		
		return response.getBody();
	}
}
