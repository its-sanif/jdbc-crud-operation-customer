package com.jsp.customer_crud_with_prepare.service;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String customerEmail;
	private long customerPhone;
        private String customerAddress;
	
	/*
	 * no argument constructor
	 */
	public Customer() {
		super();
	}

	/*
	 * argument constructor
	 */
	public Customer(int customerId, String customerName, String customerEmail, long customerPhone, String customerAddress) {
		super(); 
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
                this.customerAddress = customerAddress;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getcCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public long getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}
        public String getcCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}


	@Override
	public String toString() {
		
		return "";
	}
}