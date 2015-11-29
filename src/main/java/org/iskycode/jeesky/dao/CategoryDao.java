package org.iskycode.jeesky.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.iskycode.jeesky.entity.Category;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class CategoryDao extends BaseDao<Category> {
	@SuppressWarnings("unchecked")
	public List<Category> getListByPartId(String partId) {
		List<Category> list = new ArrayList<Category>();
		Criteria dc = this.getSession().createCriteria(Category.class);
		list = dc.add(Restrictions.eq("pid", partId)).list();
		return list;
	}

	@SuppressWarnings("unchecked")
	public List<Category> getListByPartIdAndType(String partId, String typeId) {
		List<Category> list = new ArrayList<Category>();
		Criteria dc = this.getSession().createCriteria(Category.class);
		dc.add(Restrictions.eq("value", typeId));
		if (!StringUtils.isEmpty(partId)) {
			dc.add(Restrictions.eq("pid", partId));
		}
		list = dc.list();
		return list;
	}
}
