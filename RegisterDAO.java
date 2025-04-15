package com.keane.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.keane.dbcon.ConnectionHolder;
import com.keane.dbcon.DBConnectionException;
import com.keane.dbfw.DBFWException;
import com.keane.dbfw.DBHelper;
import com.keane.dbfw.ParamMapper;
import com.keane.training.domain.User;

public class RegisterDAO {
	public int registerUser(final User user,final String type) throws DAOAppException {
		ConnectionHolder ch = null;
		Connection con = null;
		int res = -1;
		ParamMapper mapper = new ParamMapper() {

			@Override
			public void mapParams(PreparedStatement pStmt) throws SQLException {
				
				pStmt.setInt(1, user.getUser_ID());
				pStmt.setString(2,user.getUser_Name());
				pStmt.setString(3, user.getPassWord());
				pStmt.setString(4, user.getEmail_ID());
				pStmt.setInt(5, user.getAge());
				pStmt.setString(6, user.getContactNumber());
				pStmt.setString(7, user.getCity());
				pStmt.setString(8, user.getState());
				pStmt.setInt(9, user.getPinCode());
				
			}
		};
		  		try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			if(type.equals("customer")) {
			res = DBHelper.executeUpdate(con, SqlMapper.ADD_USER_CUSTOMER, mapper);
			}else {
				res = DBHelper.executeUpdate(con, SqlMapper.ADD_USER_ADMIN, mapper);	
			}
		} catch (DBConnectionException e) {
			throw new DAOAppException(e);
		} catch (DBFWException e) {
			throw new DAOAppException(e);
		}
		return res;
	}

	public boolean validateUser(final int user_ID, final String type) throws DAOAppException {
		ConnectionHolder ch = null;
		Connection con = null;
		List users = null;

		ParamMapper paramMapper = new ParamMapper() {

			@Override
			public void mapParams(PreparedStatement pStmt) throws SQLException {
				pStmt.setInt(1, user_ID);
			}
		};
		try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			if(type.equals("customer")) {
			users = DBHelper.executeSelect(con, SqlMapper.FETCH_USER_CUSTOMER,
					paramMapper, SqlMapper.MAP_USER);
			}else {
				users = DBHelper.executeSelect(con, SqlMapper.FETCH_USER_ADMIN,
						paramMapper, SqlMapper.MAP_USER);
			}

		} catch (DBConnectionException e) {
			throw new DAOAppException(e);
		} catch (DBFWException e) {
			throw new DAOAppException(e);
		}

		return (users != null && users.size() > 0);

	}
}
