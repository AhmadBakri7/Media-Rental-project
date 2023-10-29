package application;

import java.util.ArrayList;
import java.security.PrivateKey;
import java.util.*;

public class Customer implements Comparable <Customer>{

	protected ArrayList<Media> intrested=new ArrayList<>();
	protected ArrayList<Media> rented=new ArrayList<>();

	private String ID;
	private String MobileNumber;
	private String name;
	private String address;
	private String plan;	
	private static int value;

	public Customer() {
		super();
	}
	
	

	public Customer(String ID, String name, String address,String mobileNumber, String plan) {
		super();
		this.ID = ID;
		this.MobileNumber = mobileNumber;
		this.name = name;
		this.address = address;
		this.plan = plan;
	}



	public Customer(String name, String address, String plan) {
		
		this.name = name;
		this.address = address;
		this.plan = plan;
		this.setValue(2);
		System.out.println(toString());
	}

	
	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}
	
	public void setValue(int value)
	{
		if (value>0)
	    this.value=value;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Customer [intrested=" + intrested + ", rented=" + rented + ", name=" + name + ", address=" + address
				+ ", plan=" + plan + "]"+"\n";
	}

	@Override
	public int compareTo(Customer o) {
		
		if (this.getName().compareTo(o.getName())>0)
			return 1;
		else if (this.getName().compareTo(o.getName())<0)
			return -1;
		else 
			return 0;
	}
	
	public ArrayList<Media> getIntrested() {
		return intrested;
	}

	public void setIntrested(ArrayList<Media> intrested) {
		this.intrested = intrested;
	}

	public ArrayList<Media> getRented() {
		return rented;
	}

	public void setRented(ArrayList<Media> rented) {
		this.rented = rented;
	}
	
	
	
	
	
	
	
	
}
