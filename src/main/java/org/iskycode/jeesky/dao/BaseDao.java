package org.iskycode.jeesky.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author phoenix·varus
 * @date 2015年5月16日
 * @todo TODO
 * @type BaseDao
 * @CopyRight ©2015 iSkyCode
 */
public class BaseDao<T> {
	@Autowired
	private SessionFactory sf;

	public Session getSession() {
		Session session = sf.getCurrentSession();
		if (null == session) {
		} else {
			sf.openSession();
		}
		return session;
	}

	/**
	 * TODO java反射获取泛型类型
	 * 
	 * @param
	 * @return Class<?>
	 */
	public Class<?> getEntityClass() {
		Type genType = getClass().getGenericSuperclass();
		Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
		return (Class<?>) params[0];
	}

	public void flush() {
		getSession().flush();
	}

	public void clear() {
		getSession().clear();
	}

	public void save(T object) {
		getSession().save(object);
	}

	@SuppressWarnings("unchecked")
	public T get(Serializable id) {
		return (T) getSession().get(getEntityClass(), id);
	}

	@SuppressWarnings("unchecked")
	public <E> List<E> getAll() {
		return getSession().createCriteria(getEntityClass()).list();
	}
}
