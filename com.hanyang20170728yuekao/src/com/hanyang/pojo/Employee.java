package com.hanyang.pojo;

public class Employee {
	private Integer id;
	private String ename;
	private String username;
	private String password;
	private String starttime;
	private String  entime;
	private Integer salary;
	private Integer did;
	private Dept dept;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEntime() {
		return entime;
	}
	public void setEntime(String entime) {
		this.entime = entime;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Employee(Integer id, String ename, String username, String password,
			String starttime, String entime, Integer salary, Integer did,
			Dept dept) {
		super();
		this.id = id;
		this.ename = ename;
		this.username = username;
		this.password = password;
		this.starttime = starttime;
		this.entime = entime;
		this.salary = salary;
		this.did = did;
		this.dept = dept;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", username="
				+ username + ", password=" + password + ", starttime="
				+ starttime + ", entime=" + entime + ", salary=" + salary
				+ ", did=" + did + ", dept=" + dept + "]";
	}
	
}
