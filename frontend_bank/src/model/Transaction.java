package model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.TransactionEntity;

@ManagedBean(name = "transaction")
@SessionScoped
public class Transaction implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String sourcePassport;
	private String destinationPasport;
	private String destinationBank;
	private String destinationCountry;
	private String accountNumber;
	private double amount;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourcePassport() {
		return sourcePassport;
	}
	public void setSourcePassport(String sourcePassport) {
		this.sourcePassport = sourcePassport;
	}
	public String getDestinationPasport() {
		return destinationPasport;
	}
	public void setDestinationPasport(String destinationPasport) {
		this.destinationPasport = destinationPasport;
	}
	public String getDestinationBank() {
		return destinationBank;
	}
	public void setDestinationBank(String destinationBank) {
		this.destinationBank = destinationBank;
	}
	public String getDestinationCountry() {
		return destinationCountry;
	}
	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public TransactionEntity getentity()
	{
		TransactionEntity transactionEntity = new TransactionEntity();
		
		transactionEntity.setAccountNumber(accountNumber);
		transactionEntity.setAmount(amount);
		transactionEntity.setDestinationBank(destinationBank);
		transactionEntity.setDestinationCountry(destinationCountry);
		transactionEntity.setDestinationPasport(destinationPasport);
		transactionEntity.setName(name);
		transactionEntity.setSourcePassport(sourcePassport);
				
		return transactionEntity;
	}

}
