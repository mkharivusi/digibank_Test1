package controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Transaction;
import service.TransactionEJB;

@ManagedBean(name = "transactioncontroller")
@SessionScoped
public class TransactionController {

	@EJB
	private TransactionEJB<Transaction> transactionEJB;
	
	@ManagedProperty(value="#{transaction}")
	private Transaction transaction;
	
	private List<Transaction> transactionList = new ArrayList<>();
	
	public String addnewTransaction()
	{	
		transactionEJB.addnew(transaction.getentity());
		transactionList = transactionEJB.ViewAllTransactions();
		return "transactionList.xhtml";
	}
	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public List<Transaction> getTransactionList() {
		transactionList = transactionEJB.ViewAllTransactions();
		return transactionList;
	}

	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}
	
}
