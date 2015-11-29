package org.iskycode.jeesky.service;

import java.util.List;

import org.iskycode.jeesky.dao.UserDao;
import org.iskycode.jeesky.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	@Autowired
	private UserDao userDao;

	public User get(String id) {
		return userDao.get(id);
	}

	public void addUser(User user) {
		userDao.save(user);
	}

	public List<User> getAll() {
		return userDao.getAll();
	}
}
