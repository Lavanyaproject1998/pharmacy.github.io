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
import com.keane.training.domain.Medicine;
import com.keane.training.domain.User;

public class OrderDao {
	static Logger log = Logger.getLogger(OrderDao.class);

	public static List getMedicine(final int pid, final char c) throws DBFWException {
		ConnectionHolder ch = null;
		Connection con = null;
		List medicine = null;
		try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			final ParamMapper USERPMAPPER = new ParamMapper() {
				@Override
				public void mapParams(PreparedStatement pStmt) throws SQLException {
					// TODO Auto-generated method stub
					pStmt.setInt(1, pid);
				}
			};

			if (c == 'p') {
				medicine = DBHelper.executeSelect(con, SqlMapper.FETCHMEDICINEFROM_PC, USERPMAPPER,
						SqlMapper.MEDICINEMAPPER);
			} else if (c == 'n') {
				medicine = DBHelper.executeSelect(con, SqlMapper.FETCHMEDICINEFROM_N, USERPMAPPER,
						SqlMapper.MEDICINEMAPPER);
			} else if (c == 'h') {
				medicine = DBHelper.executeSelect(con, SqlMapper.FETCHMEDICINEFROM_HC, USERPMAPPER,
						SqlMapper.MEDICINEMAPPER);
			}

		} catch (DBConnectionException e) {
			e.printStackTrace();
		}
		return medicine;
	}

	public static List getUser(final int uid) throws DBFWException {
		ConnectionHolder ch = null;
		Connection con = null;
		List user = null;
		try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			final ParamMapper USERPMAPPER = new ParamMapper() {
				@Override
				public void mapParams(PreparedStatement pStmt) throws SQLException {
					// TODO Auto-generated method stub
					pStmt.setInt(1, uid);
				}
			};

			user = DBHelper.executeSelect(con, SqlMapper.FETCHUSER, USERPMAPPER, SqlMapper.USER);

		} catch (DBConnectionException e) {
			e.printStackTrace();
		}
		return user;
	}

	public static List insertOrder(final User u, final Medicine m, final int quantity) throws DBFWException {
		ConnectionHolder ch = null;
		Connection con = null;
		List medicine = null;
		int result = 0;
		try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			final ParamMapper USERPMAPPER = new ParamMapper() {
				@Override
				public void mapParams(PreparedStatement pStmt) throws SQLException {
					// TODO Auto-generated method stub
					pStmt.setInt(1, u.getUser_ID());
					pStmt.setString(2, u.getUser_Name());
					pStmt.setInt(3, m.getProdID());
					pStmt.setString(4, u.getEmail_ID());
					pStmt.setString(5, u.getContactNumber());
					pStmt.setString(6, u.getCity());
					pStmt.setInt(7, u.getPinCode());
					pStmt.setString(8, m.getProdType());
					pStmt.setString(9, m.getProdName());
					pStmt.setDouble(10, m.getProdPrice());
					pStmt.setInt(11, quantity);
				}
			};

			result = DBHelper.executeUpdate(con, SqlMapper.INSERTORDER, USERPMAPPER);

		} catch (DBConnectionException e) {
			e.printStackTrace();
		}
		return medicine;
	}

	public static List getAllOrderList() throws DBFWException {
		ConnectionHolder ch = null;
		Connection con = null;
		List orders = null;
		try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			orders = DBHelper.executeSelect(con, SqlMapper.FETCHORDER, SqlMapper.OrderMapper);

		} catch (DBConnectionException e) {
			e.printStackTrace();
		}
		return orders;
	}

}
