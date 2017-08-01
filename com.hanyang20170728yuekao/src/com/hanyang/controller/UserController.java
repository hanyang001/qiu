package com.hanyang.controller;

import java.util.List;

import javax.mail.Session;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hanyang.pojo.Dept;
import com.hanyang.pojo.Employee;
import com.hanyang.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService us;
	
	@RequestMapping("selectType")
	public String selectType(HttpSession session){
		List<Dept> list = us.selectType();
		session.setAttribute("list", list);
		return "reg";
	}
	@RequestMapping("add")
	public String add(Employee employee){
		us.insert(employee);
		return "forward:selectAll";
	}
	@RequestMapping("selectAll")
	public String selectAll(Model model){
			List<Employee> list = us.selectAll();
			model.addAttribute("allList", list);
			return "ok";
	}
	@RequestMapping("selectIf")
	public String selectIf(Model model,Employee employee){
		List<Employee> list = us.selectIf(employee);
		model.addAttribute("allList", list);
		return "ok";
	}
	@RequestMapping("login")
	public String login(Employee employee,HttpSession session){
		Employee login = us.login(employee);
		session.setAttribute("login", login);
		return "forward:selectAll";
	}
	@RequestMapping("Exisit")
	@ResponseBody
	public String Exisit(Model model,Employee employee,HttpSession session){
			Employee employee2 = null;
			employee2=us.Exisit(employee);
			if(employee2!=null&&employee2.getEname().equals(employee.getEname())){
				return "ok";	
			}
		return "error";
	}
	
}
