package Dao.porder;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Dao.DbConnection;
import Model.member;
import Model.porder;

public class implPorder implements porderDao {

	public static void main(String[] args) {
		/* 這段是add的測試
		porder p = new porder("ccc",2,2,1);
		 new implPorder().add(p);
		 */
		/* 這段是queryAll的測試
		 List<porder> l =new implPorder().queryAll();
		 for(porder p:l)
		 {
			System.out.println(p.getId()+ "\t" + p.getDesk());
		 }
		 */
		/*這段是querySum的測試
		 System.out.println(new implPorder().querySum(100,700));
		 */
		
		/*這是查出第一筆資料，然後再用update(更新)資料的測試
		porder p=new implPorder().queryPorder(1);
		p.setA(10);
		//這裡加上p.getSum()，是指在show出所有的資料於前端時，先把所有需要「運算的」全部重新run一次
		p.getSum();
		new implPorder().update(p);
		 */
		
		/*這段是delete的測試
		 new implPorder().delete(1);
		 */
		
		
	}

	@Override
	public void add(porder p) {
		EntityManager em = DbConnection.getDb();
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public List<porder> queryAll() {
		EntityManager em = DbConnection.getDb();
		String JPQL = "select p from porder p";
		Query q = em.createQuery(JPQL);
		List<porder> l = q.getResultList();
		return l;
	}

	@Override
	public List<porder> querySum(int start, int end) {
		EntityManager em = DbConnection.getDb();
		String JPQL = "select p from porder p where p.sum>=?1 and p.sum<=?2";
		Query q = em.createQuery(JPQL);
		q.setParameter(1, start);
		q.setParameter(2, end);
		List<porder> l = q.getResultList();
		return l;
	}
	
	@Override
	public porder queryPorder(int id) {
		EntityManager em=DbConnection.getDb();
		String JPQL="select p from porder p where p.id=?1";
		Query q=em.createQuery(JPQL);
		q.setParameter(1, id);
		List<member> l=q.getResultList();
		
		porder[] p=l.toArray(new porder[l.size()]);
		if(l.size()!=0)
		{
			return p[0];
		}
		else
		{
			return null;
		}
	}

	@Override
	public void update(porder p) {
		EntityManager em=DbConnection.getDb();
		em.getTransaction().begin();
		em.merge(p);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public void delete(int id) {
		EntityManager em=DbConnection.getDb();
		porder p=em.find(porder.class, id);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		em.close();
	}



}
