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
import com.keane.training.domain.Medicine;
import com.keane.training.domain.User;

public class CancelOrderDao {
	public static int cancelOrder(final int orderID) throws DBFWException {
		ConnectionHolder ch = null;
		Connection con = null;
		List res = null;
		int result = 0;
		try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			final ParamMapper USERPMAPPER = new ParamMapper() {
				@Override
				public void mapParams(PreparedStatement pStmt) throws SQLException {
					// TODO Auto-generated method stub
					pStmt.setInt(1, orderID);
				}
			};

			result = DBHelper.executeUpdate(con, SqlMapper.DELETEORDER, USERPMAPPER);

		} catch (DBConnectionException e) {
			e.printStackTrace();
		}
		return result;
	}

}
