package app.servlets;

import app.entities.User;
import app.model.ModelUsers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class MainAdminListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String fio = httpServletRequest.getParameter("fio");
        String login = httpServletRequest.getParameter("login");
        String password = httpServletRequest.getParameter("password");
        if (!(fio==null&&login==null&&password==null)) {
            ModelUsers.getInstance().add(new User(login,password,fio));
            RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/mainAdmin.jsp");
            requestDispatcher.forward(httpServletRequest,httpServletResponse);
        } else {
            httpServletRequest.setAttribute("error","Заполните все поля");
            RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/mainAdmin.jsp");
            requestDispatcher.forward(httpServletRequest,httpServletResponse);
        }
    }
}
