package net.onest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.onest.bean.Time;
import net.onest.dao.TimeDao;

@Service
@Transactional
public class TimeService {
@Autowired

	private TimeDao timedao;
	
	public List<Time> selecttime () {
		List<Time> timelist = timedao.selecttime();
		return timelist;
	}
	
}
