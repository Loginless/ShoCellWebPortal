package ua.com.shocell.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserLoginCommand implements Command {
    public UserLoginCommand() {
    }

    public void execute(HttpServletRequest request, HttpServletResponse response) {
        new DAOUserImpl();
        String login = request.getParameter("userLogin");
        String password = request.getParameter("userPassword");
    }
}

