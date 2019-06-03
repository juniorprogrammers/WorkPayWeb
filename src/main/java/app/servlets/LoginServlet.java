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

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("views/mainAdmin.jsp");
        requestDispatcher.forward(httpServletRequest,httpServletResponse);
    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String login = httpServletRequest.getParameter("login");
        String password = httpServletRequest.getParameter("password");
        User user = new User(login,password);
        ModelUsers modelUsers = ModelUsers.getInstance();
        List<User> users = modelUsers.getModel();
        httpServletRequest.setAttribute("users", users);
        httpServletRequest.getSession();
        if (!(user.getLogin().equals("")&&user.getPassword().equals(""))) {
            if (user.equals(ModelUsers.getInstance().getAdmin())) {
                RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("views/mainAdmin.jsp");
                requestDispatcher.forward(httpServletRequest,httpServletResponse);
            } else {
                if (ModelUsers.getInstance().getModel().contains(user)) {
                    RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/views/userInfo.jsp") ;
                    requestDispatcher.forward(httpServletRequest,httpServletResponse);
                } else {
                    httpServletRequest.setAttribute("error", "Неверный логин или пароль");
                    RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/");
                    requestDispatcher.forward(httpServletRequest,httpServletResponse);
                }
            }
        } else {
            httpServletRequest.setAttribute("error","Заполните все поля");
            RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/");
            requestDispatcher.forward(httpServletRequest,httpServletResponse);
        }
    }
}
