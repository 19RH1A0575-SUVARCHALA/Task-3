package Bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Bank")
@Entity

public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "Name")
	private String name;

	@Column(name = "Aadhar")
	private String aadhar;

	@Column(name = "Mobile Number")
	private String mobile_num;
	
	@Column(name = "Amount")
	private String amount;

	public Bank() {
		
	}

	public Bank(int id, String name, String aadhar, String mobile_num, String amount) {
		super();
		this.id = id;
		this.name = name;
		this.aadhar = aadhar;
		this.mobile_num = mobile_num;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getMobile_num() {
		return mobile_num;
	}

	public void setMobile_num(String mobile_num) {
		this.mobile_num = mobile_num;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", aadhar=" + aadhar + ", mobile_num=" + mobile_num
				+ ", Amount=" + amount + "]";
	}
	
	
}