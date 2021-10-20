package com.tcs.authservice.service;

import com.tcs.authservice.model.User;

public interface UserService {
	void save(User user);

	User findByUsername(String username);
}
