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

public class MedicineDao {
	static Logger log = Logger.getLogger(MedicineDao.class);

	public List getPersonalCareTable() throws DAOAppException {
		List medicines = null;
		ConnectionHolder ch = null;
		Connection con = null;
		try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			medicines = DBHelper.executeSelect(con, SqlMapper.FETCHPERSONALCARE, SqlMapper.MEDICINEMAPPER);
		} catch (DBConnectionException e) {
			log.error(e);
			throw new DAOAppException(e);
		} catch (DBFWException e) {
			throw new DAOAppException(e);
		}
		return medicines;
	}
	
	public List getNutritionCareTable() throws DAOAppException {
		List medicines = null;
		ConnectionHolder ch = null;
		Connection con = null;
		try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			medicines = DBHelper.executeSelect(con, SqlMapper.FETCHNUTRITIONCARE, SqlMapper.MEDICINEMAPPER);
		} catch (DBConnectionException e) {
			log.error(e);
			throw new DAOAppException(e);
		} catch (DBFWException e) {
			throw new DAOAppException(e);
		}
		return medicines;
	}
	
	public List getHealthCareTable() throws DAOAppException {
		List medicines = null;
		ConnectionHolder ch = null;
		Connection con = null;
		try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			medicines = DBHelper.executeSelect(con, SqlMapper.FETCHHEALTHCARE, SqlMapper.MEDICINEMAPPER);
		} catch (DBConnectionException e) {
			log.error(e);
			throw new DAOAppException(e);
		} catch (DBFWException e) {
			throw new DAOAppException(e);
		}
		return medicines;
	}
	
	
}
