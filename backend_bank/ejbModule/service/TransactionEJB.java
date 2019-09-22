package service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.TransactionEntity;
import model.Transaction;

/**
 * Session Bean implementation class TransactionEJB
 */
@Stateless
@LocalBean
public class TransactionEJB<Transaction> {

    @PersistenceContext(name="banku")
    private EntityManager em;
    
    public TransactionEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void addnew(TransactionEntity transactionentity)
    {
    	em.persist(transactionentity);
    	System.out.println("Account NUmber : "+ transactionentity.getAccountNumber());
    }

	@SuppressWarnings("unchecked")
	public List<Transaction> ViewAllTransactions() {
		
		List<Transaction> results = null;
		
		Query query = em.createQuery("Select e from transaction_tbl e");
		results = query.getResultList();
		
		return results;
	}

}
