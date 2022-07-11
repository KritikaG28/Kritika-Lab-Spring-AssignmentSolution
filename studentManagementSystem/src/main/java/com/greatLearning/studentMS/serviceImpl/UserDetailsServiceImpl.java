package com.greatLearning.studentMS.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatLearning.studentMS.entity.User;
import com.greatLearning.studentMS.repository.UserRepository;
import com.greatLearning.studentMS.security.MyUserDetails;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.getUserByUsername(username);

		if (user == null) {
			throw new UsernameNotFoundException("could not find user");
		}
		System.out.println("username: " + user.getUsername() + " password: " + user.getPassword());
		return new MyUserDetails(user);
	}

}
