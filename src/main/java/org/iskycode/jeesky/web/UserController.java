package org.iskycode.jeesky.web;

import org.iskycode.jeesky.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping(value = "/login")
	public String login(Model mod) {
		User user = new User();
		user.setName("varus");
		// 向页面传参
		mod.addAttribute(user);
		return "index";
	}
}
