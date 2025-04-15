package com.keane.training.web.handlers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import com.keane.mvc.HttpRequestHandler;
import com.keane.training.dao.DAOAppException;
import com.keane.training.dao.RegisterDAO;
import com.keane.training.domain.User;

public class RegisterUser implements HttpRequestHandler {
	static Logger log = Logger.getLogger(RegisterUser.class);

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RegisterDAO dao = new RegisterDAO();
		User user = new User();

		user.setUser_ID(Integer.parseInt(request.getParameter("uid")));
		user.setUser_Name(request.getParameter("userName"));
		user.setPassWord(request.getParameter("password"));
		user.setEmail_ID(request.getParameter("email"));
		user.setAge(Integer.parseInt(request.getParameter("age")));
		user.setContactNumber(request.getParameter("phone_number"));
		user.setCity(request.getParameter("city"));
		user.setState(request.getParameter("state"));
		user.setPinCode(Integer.parseInt(request.getParameter("pincode")));
		String type = request.getParameter("type");

		boolean isExists;
		try {
			isExists = dao.validateUser(user.getUser_ID(), type);

			if (isExists) {
				log.info("User already registered");
				RequestDispatcher dispatcher = request.getRequestDispatcher("..\\pages\\Register.jsp");
				request.setAttribute("Err", "User already registered with the system");
				dispatcher.forward(request, response);
			} else {
				int finalRes = dao.registerUser(user, type);
				if (finalRes > 0) {

					RequestDispatcher dispatcher = request.getRequestDispatcher("..\\pages\\success.jsp");
					request.setAttribute("success", "User succesfully registered with the system");
					request.setAttribute("details", user);
					dispatcher.forward(request, response);
				}
			}
		} catch (DAOAppException e) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
			request.setAttribute("Err", e.getMessage());
			dispatcher.forward(request, response);
		}
	}

}
