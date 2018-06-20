package net.onest.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.onest.bean.Time;

@Repository
public class TimeDao {
	@Autowired
	private SessionFactory sessionfactory;
	
	public List<Time> selecttime () {
		Session session  = sessionfactory.getCurrentSession();
		Query query = session.createQuery("from Time");
		List<Time> timelist = query.list();
		return timelist;
	}

}
