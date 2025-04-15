package com.keane.training.web.handlers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keane.dbfw.DBFWException;
import com.keane.mvc.HttpRequestHandler;
import com.keane.training.dao.DAOAppException;
import com.keane.training.dao.MedicineDao;
import com.keane.training.dao.OrderDao;
import com.keane.training.domain.Medicine;
import com.keane.training.domain.User;
import com.sun.istack.internal.logging.Logger;

public class Orders implements HttpRequestHandler {

	public static Logger log = Logger.getLogger(Orders.class);

	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		PrintWriter out = response.getWriter();
		int pid = Integer.parseInt(request.getParameter("pid"));
		int uid = Integer.parseInt(request.getParameter("uid"));
		String ch = request.getParameter("medicines");
		char c= ch.charAt(0);
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		int flag = 0;
		OrderDao dao = new OrderDao();
		Medicine m=null;
		User u= null;
		try {
			List l1 = dao.getMedicine(pid, c);
			if(!l1.isEmpty()) {
				m=(Medicine)l1.get(0);
			}
			List u1=dao.getUser(uid);
			if(!u1.isEmpty()) {
				u=(User)u1.get(0);
			}
			dao.insertOrder(u,m,quantity);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("OrderSuccess.jsp");
			dispatcher.forward(request, response);
		} catch (DBFWException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}