package Dao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbConnection {

	public static void main(String[] args) {
		System.out.println(DbConnection.getDb());

	}
	
	public static EntityManager getDb() {
		/*EntityManagerFactory有「連線connection」的意思，負責建立與gjun的資料庫連線*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gjun");
		EntityManager em = emf.createEntityManager();
		return em;
	}

}
