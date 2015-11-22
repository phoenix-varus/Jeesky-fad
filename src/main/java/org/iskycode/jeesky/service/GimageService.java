package org.iskycode.jeesky.service;

import java.util.List;

import org.iskycode.jeesky.dao.GimageDao;
import org.iskycode.jeesky.entity.Gimage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GimageService {
	@Autowired
	private GimageDao gimageDao;

	public Gimage get(String id) {
		return gimageDao.get(id);
	}

	public List<Gimage> getAll() {
		return gimageDao.getAll();
	}

	public void save(Gimage gimage) {
		gimageDao.save(gimage);
	}
}
