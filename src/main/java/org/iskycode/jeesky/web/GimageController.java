package org.iskycode.jeesky.web;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import org.iskycode.jeesky.entity.Gimage;
import org.iskycode.jeesky.service.GimageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping(value = "/gimage")
public class GimageController {

	@Autowired
	public GimageService gimageSerivce;

	public Gimage gimage = new Gimage();

	@RequestMapping(value = "addGimage")
	public String addGimage() {
		return "/gimage/addGimage";
	}

	@RequestMapping(value = "/uploadGimage")
	@ResponseBody
	public String uploadGimage(@RequestParam(value = "gimages", required = true) MultipartFile gimages,
			HttpServletRequest request, ModelMap model) {
		String path = request.getSession().getServletContext().getRealPath("upload");
		String fileNameOriginal = gimages.getOriginalFilename();
		String fileName = UUID.randomUUID().toString()
				+ fileNameOriginal.substring(fileNameOriginal.indexOf("."), fileNameOriginal.length());
		File targetFile = new File(path, fileName);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}
		try {
			gimages.transferTo(targetFile);
		} catch (Exception e) {
			e.printStackTrace();
		}

		model.addAttribute("fileUrl", request.getContextPath() + "/upload/" + fileName);
		return fileName;
	}

	@RequestMapping(value = "/showGimageList")
	public String showGimageList() {
		List<Gimage> list = new ArrayList<Gimage>();
		list = gimageSerivce.getAll();
		return JSON.toJSONString(list);
	}
}
