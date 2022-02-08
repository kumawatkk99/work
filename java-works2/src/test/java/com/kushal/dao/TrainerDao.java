package com.kushal.dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import com.kushal.beans.Trainer;
import com.kushal.trainerModule.TrDashboard;
import com.kushal.trainerModule.TrMainPage;

import org.hibernate.query.Query;

/**
 *
 * @author Kushal
 *
 */
public class TrainerDao implements ITrainerDao {

	@Override
	public void saveTrainer(Session session, Trainer trainer) {
		session.save(trainer);
		session.getTransaction().commit();
		System.out.println("registration Done");

	}

	@Override
	public void getTrainer(Session session, String username, String password) {
		TrDashboard dash = new TrDashboard();
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Trainer> query = criteriaBuilder.createQuery(Trainer.class);
		Root<Trainer> root = query.from(Trainer.class);
		query.select(root).where(criteriaBuilder.equal(root.get("username"), username),
				criteriaBuilder.equal(root.get("password"), password));

		Query<Trainer> employeeQuery = session.createQuery(query);
		Trainer tr = employeeQuery.getSingleResult();
		dash.dashBoard(tr);

	}

	@Override
	public void updateTrainer(Trainer trainer, Session session) {
		session.merge(trainer);
		session.getTransaction().commit();
		System.out.println("Updation successfull..");
		TrMainPage tmp=new TrMainPage();
		tmp.trainer();

	}

	public void changePassword(Session session, String username, String password) {
		String query = "UPDATE Trainer1 SET password = '" + password + "' WHERE username = '" + username + "'";
		try {
			session.createSQLQuery(query).executeUpdate();
			session.getTransaction().commit();
			System.out.println("password Changed....");
		} catch (HibernateException e) {
			session.getTransaction().rollback();
		}

	}

}
