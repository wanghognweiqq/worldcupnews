package net.onest.servlets;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.onest.bean.Time;
import net.onest.service.TimeService;

@Controller
public class TimeAction {
@Autowired
	private TimeService timeservice;

	@RequestMapping("/selecttime")
	@ResponseBody
	public List<Time> selecttime () {
		List<Time> timelist = timeservice.selecttime();
		return timelist;
	}

}
