package org.iskycode.jeesky.service;

import org.iskycode.jeesky.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	@Autowired
	private UserDao userDao;
}