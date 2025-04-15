package com.keane.training.web.handlers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.keane.dbfw.DBFWException;
import com.keane.mvc.HttpRequestHandler;
import com.keane.training.dao.DAOAppException;
import com.keane.training.dao.UpdateOrderDao;

public class UpdateOrder implements HttpRequestHandler {
	static Logger log = Logger.getLogger(UpdateOrder.class);

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("userName");
		String emailID = request.getParameter("email");
		String phoneNumber = request.getParameter("phone_number");
		String city = request.getParameter("city");
		int pincode = Integer.parseInt(request.getParameter("pincode"));
		int orderID = Integer.parseInt(request.getParameter("orderID"));
		int flag = 0;
		UpdateOrderDao dao = new UpdateOrderDao();
		try {
			flag = dao.updateOrder(userName, emailID, phoneNumber, city, pincode, orderID);

		} catch (DAOAppException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (flag != 0) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("UpdateOrderStatus.jsp");
			request.setAttribute("Err", "Order Updated");
			dispatcher.forward(request, response);
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("UpdateOrderStatus.jsp");
			request.setAttribute("Err", "Failed to Upadate Order Please Check the Order ID");
			dispatcher.forward(request, response);
		}

	}
}
