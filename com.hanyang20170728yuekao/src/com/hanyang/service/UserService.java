package com.hanyang.service;

import java.util.List;

import com.hanyang.pojo.Dept;
import com.hanyang.pojo.Employee;

public interface UserService {
	public List<Dept> selectType();
	public void insert(Employee employee);
	public Employee Exisit(Employee employee);
	public List<Employee> selectAll();
	public List<Employee> selectIf(Employee employee);
	public Employee login(Employee employee);
}
