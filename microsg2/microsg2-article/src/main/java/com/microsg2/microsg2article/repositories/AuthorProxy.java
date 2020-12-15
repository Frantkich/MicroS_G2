package com.microsg2.microsg2article.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.microsg2.microsg2article.config.CustomProperties;
import com.microsg2.microsg2article.model.YAuthor;

@Repository
public class AuthorProxy {

	@Autowired
	public RestTemplate restTemplate;
	
	@Autowired
	private CustomProperties props;
	
	public YAuthor getAuthor(int id) {
		
		String getAuthorUrl = props.getApiUrl() + "/author/" + id;
		ResponseEntity<YAuthor> response = restTemplate.exchange(getAuthorUrl, HttpMethod.GET, null, YAuthor.class);
		
		return response.getBody();
	}
}
