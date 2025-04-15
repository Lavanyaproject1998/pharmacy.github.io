package com.keane.training.dao;

import java.sql.ResultSet;

import java.sql.SQLException;

import com.keane.dbfw.ResultMapper;
import com.keane.training.domain.Medicine;
import com.keane.training.domain.Order;
import com.keane.training.domain.User;

public class SqlMapper {

	public static final String FETCH_USER_CUSTOMER = "select * from customer where userID=?;";
	public static final String FETCH_USER_ADMIN = "select * from admin1 where userID=?;";

	public static final String FETCHPERSONALCARE = "select * from personalCare;";
	public static final String FETCHNUTRITIONCARE = "select * from nutrition;";
	public static final String FETCHHEALTHCARE = "select * from healthcare;";

	public static final String FETCHMEDICINEFROM_PC = "select * from personalcare where productId=?;";
	public static final String FETCHMEDICINEFROM_N = "select * from nutrition where productId=?;";
	public static final String FETCHMEDICINEFROM_HC = "select * from healthcare where productId=?;";

	public static final String FETCHUSER = "select * from customer where userID=?;";

	public static final String ADD_USER_CUSTOMER = "insert into customer values(?,?,?,?,?,?,?,?,?)";
	public static final String ADD_USER_ADMIN = "insert into admin1 values(?,?,?,?,?,?,?,?,?)";

	public static final String INSERTORDER = "insert into ordertable(userID,userName,productId,emailID,contactnumber,city,pincode,producttype,productname,productprice,quantity) values(?,?,?,?,?,?,?,?,?,?,?)";
	public static final String FETCHOREDR_UID = "select * from ordertable where userID=?;";
	public static final String FETCHOREDR_OID = "select * from ordertable where orderID=?;";
	public static final String FETCHORDER = "select * from ordertable;";
	
	public static final String UPDATEORDER="update ordertable set userName=?,emailID=?,contactNumber=?,city=?,pinCode=?  where orderID=?;";
	
	public static final String DELETEORDER = "delete from ordertable where orderID=?";
	
	public static final ResultMapper MAP_USER = new ResultMapper() {

		@Override
		public Object mapRows(ResultSet rs) throws SQLException {
			User user = new User();
			user.setUser_ID(rs.getInt("userID"));
			user.setPassWord(rs.getString("upassword"));
			return user;

		}
	};

	public static final ResultMapper USER = new ResultMapper() {

		@Override
		public Object mapRows(ResultSet rs) throws SQLException {
			User user = new User();
			user.setUser_ID(rs.getInt("userID"));
			user.setUser_Name(rs.getString("userName"));
			user.setEmail_ID(rs.getString("emailID"));
			user.setContactNumber(rs.getString("contactNumber"));
			user.setCity(rs.getString("City"));
			user.setPinCode(rs.getInt("pincode"));
			return user;

		}
	};

	public static final ResultMapper MEDICINEMAPPER = new ResultMapper() {

		@Override
		public Object mapRows(ResultSet rs) throws SQLException {
			// TODO Auto-generated method stub
			int id = rs.getInt(1);
			String ptype = rs.getString(2);
			String pname = rs.getString(3);
			double pprice = rs.getDouble(4);

			Medicine m = new Medicine(id, ptype, pname, pprice);
			return m;

		}
	};

	public static final ResultMapper OrderMapper = new ResultMapper() {

		@Override
		public Object mapRows(ResultSet rs) throws SQLException {
			int userID = rs.getInt(1);
			String userName = rs.getString(2);
			int orderID = rs.getInt(3);
			int prodID = rs.getInt(4);
			String emailID = rs.getString(5);
			String contactNumber = rs.getString(6);
			String city = rs.getString(7);
			int pinCode = rs.getInt(8);
			String prodType = rs.getString(9);
			String prodName = rs.getString(10);
			double prodPrice = rs.getDouble(11);
			int quantity = rs.getInt(12);
			Order orders = new Order(userID, userName, orderID, prodID, emailID, contactNumber, city, pinCode, prodType,
					prodName, prodPrice, quantity);
			return orders;
		}
	};
}