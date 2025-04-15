package com.keane.training.web.handlers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.keane.dbfw.DBFWException;
import com.keane.mvc.HttpRequestHandler;
import com.keane.training.dao.CancelOrderDao;
import com.keane.training.dao.DAOAppException;

public class CancelOrder implements HttpRequestHandler {
	static Logger log = Logger.getLogger(CancelOrder.class);

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int orderID = Integer.parseInt(request.getParameter("orderID"));
		CancelOrderDao dao = new CancelOrderDao();
		int flag = 0;
		try {
			flag = dao.cancelOrder(orderID);
			
		} catch (DBFWException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (flag != 0) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("CancelOrderStatus.jsp");
			request.setAttribute("Err", "Order cancelled");
			dispatcher.forward(request, response);
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("CancelOrderStatus.jsp");
			request.setAttribute("Err", "Failed to cancel Order Please Check the Order ID");
			dispatcher.forward(request, response);
		}
	}
}
