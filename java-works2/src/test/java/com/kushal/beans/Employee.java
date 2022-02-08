package com.kushal.beans;

import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.persistence.UniqueConstraint;

	/**
	 *
	 * @author Kushal
	 *
	 */
	@Entity
	@Table(name = "employee1")
	public class Employee {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int empId;
		private String empName;
		private String empEmail;
		private String username;
		private String password;
		private String stream;
		private int yoj;
		
		public Employee(){}

		public Employee(int empId, String empName, String empEmail, String username, String password, String stream,
				int yoj) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empEmail = empEmail;
			this.username = username;
			this.password = password;
			this.stream = stream;
			this.yoj = yoj;
		}

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public String getEmpEmail() {
			return empEmail;
		}

		public void setEmpEmail(String empEmail) {
			this.empEmail = empEmail;
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

		public String getStream() {
			return stream;
		}

		public void setStream(String stream) {
			this.stream = stream;
		}

		public int getYoj() {
			return yoj;
		}

		public void setYoj(int yoj) {
			this.yoj = yoj;
		}

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", username="
					+ username + ", password=" + password + ", stream=" + stream + ", Yoj=" + yoj + "]";
		}
		
		


}
