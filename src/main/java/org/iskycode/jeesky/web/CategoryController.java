package org.iskycode.jeesky.web;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.iskycode.jeesky.entity.Category;
import org.iskycode.jeesky.service.CategoryService;
import org.iskycode.jeesky.util.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

/**
 * Created by 俊峰 on 2015/6/1.
 */
@Controller
@RequestMapping(value = "/category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "/addCategory")
	public String addCategory() {
		return "/category/addCategory";
	}

	@RequestMapping(value = "/addCategoryAction")
	@ResponseBody
	public String addCategoryAction(
			@RequestParam(required = true, value = "name") String name,
			@RequestParam(required = true, value = "title") String title) {
		// 添加新的站点区域
		Category part = new Category();
		String id = UUID.randomUUID().toString();
		part.setId(id);
		part.setName(name);
		part.setTitle(title);
		part.setPid("0");
		categoryService.add(part);
		// 站点区域的附属
		String[] hlist = Const.HEIGHT_LIST;
		String[] hids = new String[hlist.length];
		for (int i = 0; i < hlist.length; i++) {
			Category height = new Category();
			String hid = UUID.randomUUID().toString();
			hids[i] = hid;
			height.setId(hid);
			height.setName(hlist[i]);
			height.setTitle(hlist[i]);
			height.setPid(id);
			categoryService.add(height);
		}
		// 天气类型信息
		String[] tlist = Const.TYPE_LIST;
		for (int i = 0; i < hlist.length; i++) {
			for (int j = 0; j < tlist.length; j++) {
				Category type = new Category();
				String tid = UUID.randomUUID().toString();
				type.setId(tid);
				type.setName(tlist[i]);
				type.setTitle(tlist[i]);
				type.setPid(hlist[i]);
				categoryService.add(type);
			}
		}
		return "success";
	}

	/**
	 * @todo ztree数据源
	 * @param partId
	 * @return
	 */
	@RequestMapping(value = "/categoryListString")
	public String getListAsString(
			@RequestParam(required = false, value = "partId") String partId) {
		List<Category> clist = new ArrayList<Category>();
		if (StringUtils.isEmpty(partId)) {

		} else {
			clist = categoryService.getAll();
		}
		return JSON.toJSONString(clist);
	}

	/**
	 * @todo 列表展示数据
	 * @param partId
	 * @return
	 */
	@RequestMapping(value = "/categoryList")
	public List<Category> getList(
			@RequestParam(required = false, value = "partId") String partId) {
		List<Category> clist = new ArrayList<Category>();
		if (StringUtils.isEmpty(partId)) {

		} else {
			clist = categoryService.getAll();
		}
		return clist;
	}
}
