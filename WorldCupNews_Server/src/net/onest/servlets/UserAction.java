package net.onest.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jdk.nashorn.internal.runtime.JSONFunctions;
import net.onest.bean.User;
import net.onest.service.UserService;

@Controller
public class UserAction {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/userlogin")
	@ResponseBody
	private String userLogin(Model model,String username,String password,HttpSession session) {
		User user=userService.findUser(username, password);
		session.setAttribute("username", user);
		if(user!=null) {
			return "loginsuccess";
		}
		return "loginfail";
	}
	
	@RequestMapping("/register")
	@ResponseBody
	public String register(User user) {
		if(user.getUsername().equals("") || user.getPassword().equals("") || user.getEmail().equals("")) {
			return "null";
		}else {
			boolean result = userService.register(user);
			if(result) {
					String re = "registersuccess";
					return re;
			}else {
				return "registered";
			}
		}
	}
	
	@RequestMapping("/finduser")
	public String selectuser(Model model) {
		List<User> list=userService.find();
		model.addAttribute("userlist",list);
		System.out.println();
		return "admin/userlist";
	}
}
