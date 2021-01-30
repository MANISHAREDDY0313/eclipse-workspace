package com.mythri.dao;

import java.util.List;

import com.mythri.dto.Employee;

public class EmployeeListResponse {
	private List<Employee> emps;
	private long count;

	public EmployeeListResponse(List<Employee> emps, long count) {
		super();
		this.emps = emps;
		this.count = count;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

}




