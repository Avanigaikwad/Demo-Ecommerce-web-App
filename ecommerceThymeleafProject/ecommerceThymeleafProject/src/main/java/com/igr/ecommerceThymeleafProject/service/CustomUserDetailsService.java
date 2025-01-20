package com.igr.ecommerceThymeleafProject.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.igr.ecommerceThymeleafProject.model.CustomUserDetail;
import com.igr.ecommerceThymeleafProject.model.User;
import com.igr.ecommerceThymeleafProject.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<User> user = userRepository.findUserByEmail(email);
		user.orElseThrow( ()->new UsernameNotFoundException("User Not found with specified email"));
		return user.map(CustomUserDetail::new).get();
	}

}
