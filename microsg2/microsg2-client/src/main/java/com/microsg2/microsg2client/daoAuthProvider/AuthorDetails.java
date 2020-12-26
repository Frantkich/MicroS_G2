package com.microsg2.microsg2client.daoAuthProvider;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.microsg2.microsg2client.model.YAuthor;
import com.microsg2.microsg2client.repository.GenericProxy;

@Service
public class AuthorDetails extends GenericProxy implements UserDetailsService {
	
	
	@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
        String getAuthorUrl = props.getApiUrl() + "/author/authorByUsername/" + username;
        
        ResponseEntity<YAuthor> response = restTemplate.exchange(
				getAuthorUrl, 
				HttpMethod.GET, 
				null, 
				YAuthor.class);
        YAuthor author = response.getBody();
        if ( author == null) {
        	throw new UsernameNotFoundException("Author not found");
        }
        
		return new org.springframework.security.core.userdetails.User(author.getUsername(), author.getPassword(), author.getAuthorities());
    }
}
