package com.jsp.customer_crud_with_prepare.controller;

import java.util.Scanner;
import com.jsp.customer_crud_with_prepare.dao.CustomerDao;
import com.jsp.customer_crud_with_prepare.service.CustomerService;
import com.jsp.customer_crud_with_prepare.service.Customer;

public class CustomerController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("main method start");
		Customer customer = null;
		CustomerService customerservice = new CustomerService();

		System.out.println("main method ended");
		System.out.println("1.Insert\n2.update\n3.Display\n4.delete");
		System.out.println("enter your option");
		int ch = scanner.nextInt();
		switch (ch) {
		case 1: {
			System.out.println("Enter customer Id :");
			int id = scanner.nextInt();
			System.out.println("Enter customer name :");
			String name = scanner.next();
			System.out.println("Enter customer email :");
			String email = scanner.next();
			System.out.println("Enter customer phone:");
			long phone = scanner.nextLong();
                        System.out.println("Enter customer address :");
			String address = scanner.next();

			customer = new Customer(id, name, email, phone, address);
			customerservice.insertCustomerService(customer);
		}
			break;
		case 2: {
			System.out.println("1.Name\n2.Email\n3.Phone\n4.Address");
			System.out.println("Please choose your option to update your data");
			int ch1 = scanner.nextInt();
			switch (ch1) {
			case 1: {
				System.out.println("Enter customer Id to update :");
				int id = scanner.nextInt();
				System.out.println("Enter customer name to update :");
				String name = scanner.next();

				int id1 = customerservice.updateCustomerName(id, name);
				if (id1 == 1) {
					System.out.println("Name Updated Sucessfully");
				} else {
					System.err.println("id not found  please check it again");
				}
			}
				break;
			case 2: {
				System.out.println("Enter customer Id to update :");
				int id = scanner.nextInt();
				System.out.println("Enter customer email to update :");
				String email = scanner.next();

				int id1 = customerservice.updateCustomerEmail(id, email);
				if (id1 == 1) {
					System.out.println("Email Updated Sucessfully");
				} else {
					System.err.println("id not found  please check it again");
				}
			}
				break;
			case 3: {
				System.out.println("Enter customer Id to update :");
				int id = scanner.nextInt();
				System.out.println("Enter customer phone to update :");
				long phone = scanner.nextLong();

				long id1 = customerservice.updateCustomerPhone(id, phone);
				if (id1 == 1) {
					System.out.println("Phone Updated Sucessfully");
				} else {
					System.err.println("id not found  please check it again");
				}
			}
				break;
				
             case 4: {
				System.out.println("Enter customer Id to update :");
				int id = scanner.nextInt();
				System.out.println("Enter customer address to update :");
				String address = scanner.next();

				int id1 = customerservice.updateCustomerAddress(id, address);
				if (id1 == 1) {
					System.out.println("Address Updated Sucessfully");
				} else {
					System.err.println("id not found  please check it again");
				}
			}
				break;

			}
         break;
		}
		case 3: {

			customerservice.displayCustomerDetails();

		}
			break;
		case 4 :{
			System.out.println("Enter the id to delete");
			int id = scanner.nextInt();
			int id1 = customerservice.deleteCustomerById(id);
			if (id1==1) {
				System.out.println("Data Deleted Successfully");
			}
			else {
				System.err.println("id is not present please check it again");
			}
		}
		}
	}
}