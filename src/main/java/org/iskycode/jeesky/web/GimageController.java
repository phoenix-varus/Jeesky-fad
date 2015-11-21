package org.iskycode.jeesky.web;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iskycode.jeesky.entity.Gimage;
import org.iskycode.jeesky.service.GimageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping(value = "/gimage")
public class GimageController {

	@Autowired
	public GimageService gimageSerivce;

	@RequestMapping(value = "addGimage")
	public String addGimage() {
		return "/gimage/addGimage";
	}

	@RequestMapping(value = "/uploadGimage")
	@ResponseBody
	public String uploadGimage(HttpServletRequest request, HttpServletResponse response) {
		String gimage = request.getParameter("gimage");
		System.out.println(gimage);
		String dir = "d:/image/";
		File file = new File(dir);
		if (!file.exists()) {
			file.mkdir();
		}

		return "success";
	}

	@RequestMapping(value = "/showGimageList")
	public String showGimageList() {
		List<Gimage> list = new ArrayList<Gimage>();
		list = gimageSerivce.getAll();
		return JSON.toJSONString(list);
	}
}
