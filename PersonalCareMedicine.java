package com.keane.training.web.handlers;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.keane.mvc.HttpRequestHandler;
import com.keane.training.dao.DAOAppException;
import com.keane.training.dao.LoginDAO;
import com.keane.training.dao.MedicineDao;
import com.keane.training.domain.Medicine;

public class PersonalCareMedicine implements HttpRequestHandler {

	public static Logger log = Logger.getLogger(PersonalCareMedicine.class);

	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		int flag = 1;
		MedicineDao dao = new MedicineDao();
		try {
			List<Medicine> medicines=dao.getPersonalCareTable();
			RequestDispatcher dispatcher = request.getRequestDispatcher("Medicine.jsp");
			request.setAttribute("medicines", medicines);
			dispatcher.forward(request, response);
		} catch (DAOAppException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
