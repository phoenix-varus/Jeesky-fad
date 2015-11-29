package org.iskycode.jeesky.web;

import java.util.List;
import java.util.UUID;

import org.iskycode.jeesky.dao.UserDao;
import org.iskycode.jeesky.entity.User;
import org.iskycode.jeesky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	@Autowired
	public UserService userService;

	@RequestMapping(value = "/login")
	public String login(Model mod) {
		// User user = new User();
		// user.setName("varus");
		// 向页面传参
		// User user = userService.get("0");
		mod.addAttribute("ee");
		return "index";
	}

	public String addUser(@RequestParam(required = true, value = "name") String name,
			@RequestParam(required = true, value = "partId") String partId) {
		User user = new User();
		user.setId(UUID.randomUUID().toString());
		user.setName(name);
		user.setCity_id(partId);
		userService.addUser(user);
		return "success";
	}

	public List<User> getList() {
		return userService.getAll();
	}

}
