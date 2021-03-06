package com.sachin.userservice.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.sachin.userservice.model.RoleModel;
import com.sachin.userservice.model.UserModel;

public interface UserService extends UserDetailsService 
{
	
	public UserModel saveUser(UserModel usermodel);
	
	public List<UserModel> getAllUsers();
	
	public UserModel getUser(Long userId);
	
	public List<RoleModel> getRolesForUser(Long userId);
	
	public boolean deleteUser(Long userId);
	
	UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException;

}
