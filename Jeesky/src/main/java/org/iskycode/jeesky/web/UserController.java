package org.iskycode.jeesky.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	@ResponseBody
	@RequestMapping(value = "/login")
	public String login() {
		return "index";
	}
}
