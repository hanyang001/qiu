package com.hanyang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hanyang.dao.UserMapper;
import com.hanyang.pojo.Dept;
import com.hanyang.pojo.Employee;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper um;
	@Override
	public List<Dept> selectType() {
		// TODO Auto-generated method stub
		return um.selectType();
	}
	@Override
	public void insert(Employee employee) {
		// TODO Auto-generated method stub
		um.insert(employee);
	}
	@Override
	public Employee Exisit(Employee employee) {
		// TODO Auto-generated method stub
		return um.Exisit(employee);
	}
	@Override
	public List<Employee> selectAll() {
		// TODO Auto-generated method stub
		return um.selectAll();
	}
	@Override
	public List<Employee> selectIf(Employee employee) {
		// TODO Auto-generated method stub
		return um.selectIf(employee);
	}
	@Override
	public Employee login(Employee employee) {
		// TODO Auto-generated method stub
		return um.login(employee);
	}

}
