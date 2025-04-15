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
import com.keane.training.domain.User;

public class Login implements HttpRequestHandler {

	public static Logger log = Logger.getLogger(Login.class);

	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int user_ID = Integer.parseInt(request.getParameter("uid"));
		String password = request.getParameter("password");
		String type = request.getParameter("type");
		int flag = -1;
		List users = null;
		LoginDAO dao = new LoginDAO();

		try {
			users = dao.validateUser(user_ID, type);
			log.info(users);

			for (Object object : users) {

				User user = (User) object;
				if (user.getPassWord().equals(password)) {
					flag = 0;
					break;
				}
			}
			log.info("Flag in login " + flag);
			if (flag == 0) {
				if (type.equals("customer")) {
					RequestDispatcher dispatcher = request.getRequestDispatcher("CustomerHome.jsp");
					request.setAttribute("Name", user_ID);
					dispatcher.forward(request, response);
				} else {
					RequestDispatcher dispatcher = request.getRequestDispatcher("AdminHome.jsp");
					request.setAttribute("Name", user_ID);
					dispatcher.forward(request, response);
				}

			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
				request.setAttribute("Err", "username are password is incorrect");
				dispatcher.forward(request, response);
			}

		} catch (DAOAppException e) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
			request.setAttribute("Err", e.getMessage());
			dispatcher.forward(request, response);

		}

	}
}
