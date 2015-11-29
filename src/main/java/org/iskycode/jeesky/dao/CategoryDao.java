package org.iskycode.jeesky.dao;

import java.util.ArrayList;
import java.util.List;

import org.iskycode.jeesky.entity.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryDao extends BaseDao<Category> {
	public List<Category> getListByPartId(String partId) {
		List<Category> list = new ArrayList<Category>();
		this.getSession().createQuery("");
		return list;
	}
}
