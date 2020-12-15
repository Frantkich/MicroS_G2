package com.microsg2.microsg2client.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.microsg2.microsg2client.CustomProperties;

public class GenericProxy {
	@Autowired
	protected RestTemplate restTemplate;
	
	@Autowired
	protected CustomProperties props;
}
