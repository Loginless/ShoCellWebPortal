package ua.com.shocell.view;

import ua.com.shocell.controller.Command;
import ua.com.shocell.controller.CommandFactory;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginController extends HttpServlet {
    public LoginController() {
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CommandFactory commandFactory = CommandFactory.getInstance();
        Command command = commandFactory.getCommand("login");
        command.execute(req, resp);
    }
}

