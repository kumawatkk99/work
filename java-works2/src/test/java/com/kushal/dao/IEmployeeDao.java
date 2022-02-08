package com.kushal.dao;

import java.io.IOException;

import org.hibernate.Session;

import com.kushal.beans.Employee;

/**
*
*
*
*/
public interface IEmployeeDao {

	public void saveEmployee(Session session, Employee emp);
	public void getEmployee(Session session, String userName, String password);		
	public void updateEmployee(Employee emp, Session session);
	public void changePassword(Session session, String username, String password);
	
}
