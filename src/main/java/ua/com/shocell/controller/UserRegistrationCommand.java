package ua.com.shocell.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserRegistrationCommand implements Command {
    public UserRegistrationCommand() {
    }

    public void execute(HttpServletRequest request, HttpServletResponse response) {
        DAOUserImpl daoUser = new DAOUserImpl();
        String login = request.getParameter("userLogin");
        String password = request.getParameter("userPassword");
        if (daoUser.LoginPasswordMatch(login, password)) {
            try {
                response.sendRedirect("login.jsp");
            } catch (IOException var8) {
                var8.printStackTrace();
            }
        } else {
            try {
                response.getWriter().println("<!DOCTYPE HTML>");
                response.getWriter().println("<html><body><p>Login or password is incorrect.</p></body></html>");
            } catch (IOException var7) {
                var7.printStackTrace();
            }
        }

    }
}

