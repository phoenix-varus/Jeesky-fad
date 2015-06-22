package org.iskycode.jeesky.web;

import org.iskycode.jeesky.entity.User;
import org.iskycode.jeesky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@Autowired
	public UserService userService;

	@RequestMapping(value = "/login")
	public String login(Model mod) {
		// User user = new User();
		// user.setName("varus");
		// 向页面传参
		User user = userService.get("0");
		mod.addAttribute(user);
		return "index";
	}
}
