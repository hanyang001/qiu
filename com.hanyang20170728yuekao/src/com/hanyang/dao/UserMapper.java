package com.hanyang.dao;

import java.util.List;

import com.hanyang.pojo.Dept;
import com.hanyang.pojo.Employee;

public interface UserMapper {

	public List<Dept> selectType();
	public void insert(Employee employee);
	public List<Employee> selectAll();
	public Employee Exisit(Employee employee);
	public List<Employee> selectIf(Employee employee);
	public Employee login(Employee employee);
	
}
