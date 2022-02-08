package com.kushal.dao;

import java.io.IOException;

import org.hibernate.Session;

import com.kushal.beans.Trainer;

/**
*
*
*
*/
public interface ITrainerDao {

	public void saveTrainer(Session session, Trainer trainer);
	public void getTrainer(Session session, String userName, String password);		
	public void updateTrainer(Trainer trainer, Session session);
	public void changePassword(Session session, String username, String password);
	
}

