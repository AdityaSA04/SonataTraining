package com.bank;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
@PrimaryKeyJoinColumn(name="account_num")
public class SavingsAccountCurrentAccount extends BankDetails {
	private String account_type;
	private long phone_num;
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public long getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(long phone_num) {
		this.phone_num = phone_num;
	}
	public SavingsAccountCurrentAccount() {
		
	}
	public SavingsAccountCurrentAccount(int account_num, String bank_name, String acc_holder, String account_type, long phone_num) {
		super(account_num, bank_name, acc_holder);
		this.account_type = account_type;
		this.phone_num = phone_num;
	}
	
}
