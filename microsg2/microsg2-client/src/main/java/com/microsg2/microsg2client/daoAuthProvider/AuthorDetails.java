package com.microsg2.microsg2client.daoAuthProvider;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User.UserBuilder;
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
        String getAuthorUrl = props.getApiUrl() + "/authors/username/" + username;
        ResponseEntity<YAuthor> response = restTemplate.exchange(
				getAuthorUrl, 
				HttpMethod.GET, 
				null, 
				YAuthor.class);
        YAuthor author = response.getBody();
        UserBuilder builder = null;
        if ( author != null) {
        	builder = org.springframework.security.core.userdetails.User.withUsername(author.getUsername());
            builder.password(author.getPassword());
            builder.roles(author.getRole());
            builder.username(author.getId().toString());
        }
        else {
        	throw new UsernameNotFoundException("Author not found.");
        }
        return builder.build();
    }

}
