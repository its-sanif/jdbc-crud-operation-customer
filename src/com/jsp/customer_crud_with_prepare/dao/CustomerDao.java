package com.jsp.customer_crud_with_prepare.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.customer_crud_with_prepare.connection.CustomerConnection;
import com.jsp.customer_crud_with_prepare.service.Customer;
import com.jsp.customer_crud_with_prepare.service.CustomerService;

public class CustomerDao {

	Connection connection = CustomerConnection.getCustomerConnection();

	/*
	 * insertMethod for customer
	 */
	public Customer saveCustomer(Customer customer) {

		String insertQuery = "insert into customer values(?,?,?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

			preparedStatement.setInt(1, customer.getCustomerId());
			preparedStatement.setString(2, customer.getCustomerName());
			preparedStatement.setString(3, customer.getcCustomerEmail());
			preparedStatement.setLong(4, customer.getCustomerPhone());
			preparedStatement.setString(5, customer.getcCustomerAddress());

			preparedStatement.execute();

			return customer;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}/*
		 * 
		 * customer update
		 *
		 */

	public int updateCustomerName(int customerid, String customername) {
		String updateCustomerNameQuery = "update customer set name =? where id = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(updateCustomerNameQuery);

			preparedStatement.setInt(2, customerid);
			preparedStatement.setString(1, customername);

			return preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

	public int updateCustomerEmail(int customerid, String customeremail) {
		String updateCustomerEmailQuery = "update customer set email = ? where id = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(updateCustomerEmailQuery);

			preparedStatement.setInt(2, customerid);
			preparedStatement.setString(1, customeremail);

			return preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public long updateCustomerPhone(int customerid, Long customerphone) {
		String updateCustomerPhoneQuery = "update customer set phone = ? where id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(updateCustomerPhoneQuery);

			preparedStatement.setInt(2, customerid);
			preparedStatement.setLong(1, customerphone);

			return preparedStatement.executeLargeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

	public int updateCustomerAddress(int customerid, String customeraddress) {
		String updateCustomerAddressQuery = "update customer set address = ? where id = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(updateCustomerAddressQuery);

			preparedStatement.setInt(2, customerid);
			preparedStatement.setString(1, customeraddress);

			return preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public void displayCustomerQuery() {
		String displayCustomerQuery = "select * from customer";

		try {

			PreparedStatement preparedStatement = connection.prepareStatement(displayCustomerQuery);

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {

				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String email = resultSet.getString("email");
				long phone = resultSet.getLong("phone");
				String address = resultSet.getString("address");

				System.out.println("id =" + id);
				System.out.println("name =" + name);
				System.out.println("email =" + email);
				System.out.println("phone =" + phone);
				System.out.println("address =" + address);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int deleteCustomerById(int customerid) {
		String deleteCustomerById = "Delete from customer where id =?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(deleteCustomerById);

			preparedStatement.setInt(1, customerid);

			return preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

}