package com.jsp.customer_crud_with_prepare.service;

import com.jsp.customer_crud_with_prepare.dao.CustomerDao;

public class CustomerService {
	CustomerDao customerDao = new CustomerDao();

	/*
	 * insertion of data
	 * 
	 */
	public Customer insertCustomerService(Customer customer) {
		System.out.println("insert service method start");

		if (customer.getCustomerId() <= 999999999) {
			Customer customer2 = customerDao.saveCustomer(customer);
			System.out.println("insert service method ended");
			return customer2;
		} else {
			System.err.println("Please Pass the id Between 4 Digits");
		}

		return null;
	}/*
	
	*
	*update data method 
	*
	*/
	
	public int updateCustomerName(int customerid, String customername) {
		  return customerDao.updateCustomerName(customerid, customername);
		
	}
	public int updateCustomerEmail(int customerid, String customeremail) {
		return customerDao.updateCustomerEmail(customerid, customeremail);
	}
	
	public long updateCustomerPhone(int customerid, Long customerphone) {
		return customerDao.updateCustomerPhone(customerid, customerphone);
	}
        public int updateCustomerAddress(int customerid, String customeraddress) {
		return customerDao.updateCustomerAddress(customerid, customeraddress);
	}
	/*
	 * This is for Display method which will display all the student data
	 * */
	public void displayCustomerDetails() {
		customerDao.displayCustomerQuery();
	}
	/*
	 * this is for delete the data
	 * */
	public int deleteCustomerById(int customerid) {
		return customerDao.deleteCustomerById(customerid);
	}
}
