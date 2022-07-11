package com.bank;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class BankDetails {
	@Id
	private int account_num;
	private String bank_name;
	private String acc_holder;
	public int getAccount_num() {
		return account_num;
	}
	public void setAccount_num(int account_num) {
		this.account_num = account_num;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getAcc_holder() {
		return acc_holder;
	}
	public void setAcc_holder(String acc_holder) {
		this.acc_holder = acc_holder;
	}
	public BankDetails() {
		
	}
	public BankDetails(int account_num, String bank_name, String acc_holder) {
			super();
			this.account_num = account_num;
			this.bank_name = bank_name;
			this.acc_holder = acc_holder;
		}
	
	
}
