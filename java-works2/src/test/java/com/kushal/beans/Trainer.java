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
 	@Table(name = "trainer1")
 	public class Trainer {
 		@Id
 		@GeneratedValue(strategy = GenerationType.AUTO)
 		private int trainerId;
 		private String trainerName;
 		private String trainerEmail;
 		private String username;
 		private String password;
 		private int yearOfExperience;

 		public Trainer() {}

	public Trainer(int trainerId, String trainerName, String trainerEmail, String username, String password,
			int yearOfExperience) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.trainerEmail = trainerEmail;
		this.username = username;
		this.password = password;
		this.yearOfExperience = yearOfExperience;
	}

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getTrainerEmail() {
		return trainerEmail;
	}

	public void setTrainerEmail(String trainerEmail) {
		this.trainerEmail = trainerEmail;
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

	public int getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", trainerEmail=" + trainerEmail
				+ ", username=" + username + ", password=" + password + ", yearOfExperience=" + yearOfExperience + "]";
	}
	
 	}
 		