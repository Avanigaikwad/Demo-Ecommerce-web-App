package com.igr.ecommerceThymeleafProject.model;

import java.util.ArrayList;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetail extends User implements UserDetails {

	public CustomUserDetail(User user) {
		super(user);
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
		super.getRoles().forEach(role->grantedAuthorityList.add(new SimpleGrantedAuthority(role.getName())));
		return grantedAuthorityList;
	}

	
	
	
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return super.getEmail();
	}
	
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return super.getPassword();
	}
	
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}	

}
