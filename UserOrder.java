package com.keane.training.web.handlers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import com.keane.dbfw.DBFWException;
import com.keane.mvc.HttpRequestHandler;
import com.keane.training.dao.UserOrderDao;
import com.keane.training.domain.Order;

public class UserOrder implements HttpRequestHandler {

	public static Logger log = Logger.getLogger(UserOrder.class);

	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		PrintWriter out = response.getWriter();
		int userID = Integer.parseInt(request.getParameter("userID"));
		UserOrderDao dao = new UserOrderDao();
		
		try {
			
			List<Order> orders= dao.getAllUserOrder(userID);
//			for(Order or:orders) {
//				System.out.println(or);
//			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("UserOrder.jsp");
			//request.setAttribute("orders", orders);
			request.setAttribute("orders", orders);
			dispatcher.forward(request, response);
		} catch (DBFWException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}