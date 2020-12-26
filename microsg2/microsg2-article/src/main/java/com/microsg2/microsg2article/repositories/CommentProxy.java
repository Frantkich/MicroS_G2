package com.microsg2.microsg2article.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.microsg2.microsg2article.config.CustomProperties;
//import com.microsg2.microsg2article.config.CustomProperties;
import com.microsg2.microsg2article.model.YComment;

@Repository
public class CommentProxy {

	@Autowired
	public RestTemplate restTemplate;
	
	@Autowired
	private CustomProperties props;
	
	public YComment[] getComments(int id) {
		String getCommentUrl = props.getApiUrl() +  "/comment/article/" + id;
		ResponseEntity<YComment[]> response = restTemplate.exchange(getCommentUrl, HttpMethod.GET, null, YComment[].class);
		return response.getBody();
	}
	
}
