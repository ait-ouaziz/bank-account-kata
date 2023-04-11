package com.devoteam.bankaccountkata.models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String clientId;
	
	private String firstname;

	private String lastname;
	
	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
	private List<Account> listAccounts;

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public List<Account> getListAccounts() {
		return listAccounts;
	}

	public void setListAccounts(List<Account> listAccounts) {
		this.listAccounts = listAccounts;
	}
}