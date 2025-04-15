package com.keane.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.keane.dbcon.ConnectionHolder;
import com.keane.dbcon.DBConnectionException;
import com.keane.dbfw.DBFWException;
import com.keane.dbfw.DBHelper;
import com.keane.dbfw.ParamMapper;

public class UpdateOrderDao {
	public int updateOrder(final String userName, final String emailID, final String phoneNumber, final String city,
			final int pincode, final int orderID) throws DAOAppException {
		ConnectionHolder ch = null;
		Connection con = null;
		int res = -1;
		ParamMapper mapper = new ParamMapper() {

			@Override
			public void mapParams(PreparedStatement pStmt) throws SQLException {

				pStmt.setString(1, userName);
				pStmt.setString(2, emailID);
				pStmt.setString(3, phoneNumber);
				pStmt.setString(4, city);
				pStmt.setInt(5, pincode);
				pStmt.setInt(6, orderID);
			}
		};
		try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();

			res = DBHelper.executeUpdate(con, SqlMapper.UPDATEORDER, mapper);

		} catch (DBConnectionException e) {
			throw new DAOAppException(e);
		} catch (DBFWException e) {
			throw new DAOAppException(e);
		}
		return res;
	}
}
