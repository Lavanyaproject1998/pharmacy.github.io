package com.keane.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.keane.dbcon.ConnectionHolder;
import com.keane.dbcon.DBConnectionException;
import com.keane.dbfw.DBFWException;
import com.keane.dbfw.DBHelper;
import com.keane.dbfw.ParamMapper;

public class UserOrderDao {
	static Logger log = Logger.getLogger(UserOrderDao.class);

	public static List getAllUserOrder(final int userID) throws DBFWException {
		ConnectionHolder ch = null;
		Connection con = null;
		List orders = null;
		try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			final ParamMapper USERPMAPPER = new ParamMapper() {
				@Override
				public void mapParams(PreparedStatement pStmt) throws SQLException {
					// TODO Auto-generated method stub
					pStmt.setInt(1, userID);
				}
			};

			
			orders = DBHelper.executeSelect(con, SqlMapper.FETCHOREDR_UID, USERPMAPPER,
						SqlMapper.OrderMapper);
		
		} catch (DBConnectionException e) {
			e.printStackTrace();
		}
		return orders;
	}
	
	//-------------------------------------------------------------------------
	
	public static List getOrderByOID(final int orderID) throws DBFWException {
		ConnectionHolder ch = null;
		Connection con = null;
		List orders = null;
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

			
			orders = DBHelper.executeSelect(con, SqlMapper.FETCHOREDR_OID, USERPMAPPER,
						SqlMapper.OrderMapper);
		
		} catch (DBConnectionException e) {
			e.printStackTrace();
		}
		return orders;
	}
}
