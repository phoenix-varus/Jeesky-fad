package org.iskycode.jeesky.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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

    public void flush() {
        getSession().flush();
    }

    public void clear() {
        getSession().clear();
    }

    public void save(Object object) {
        getSession().save(object);
    }
}
