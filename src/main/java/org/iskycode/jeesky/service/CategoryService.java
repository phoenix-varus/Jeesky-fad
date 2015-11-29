package org.iskycode.jeesky.service;

import java.util.List;

import org.iskycode.jeesky.dao.CategoryDao;
import org.iskycode.jeesky.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoryService {
	@Autowired
	private CategoryDao categoryDao;

	public Category get(String id) {
		return categoryDao.get(id);
	}

	public List<Category> getAll() {
		return categoryDao.getAll();
	}

	public void add(Category category) {
		categoryDao.save(category);
	}

	public List<Category> getListByPartId(String partId) {
		return categoryDao.getListByPartId(partId);
	}
}
