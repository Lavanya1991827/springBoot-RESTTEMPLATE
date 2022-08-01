package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

@Service
public class RestClientInformation {

	@Autowired
	private RestTemplate restTemplate;
	
	String url = "http://localhost:8080/welcome";
	
	public void getMessage() {
		try {
			ResponseEntity<String> forEntity = restTemplate.getForEntity(url, String.class);
			if(forEntity.getStatusCode().value()==200) {
				System.out.println(forEntity.getBody());
			}
			
		}
		catch(HttpClientErrorException e) {
			System.out.println(e.getMessage());
		}catch(ResourceAccessException e) {
			System.out.println(e.getLocalizedMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
			
		}
	}
	
	
