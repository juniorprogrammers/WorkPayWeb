package app.servlets;

import app.entities.User;
import app.model.ModelUsers;

import javax.mail.Session;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class MainAdminDelServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        ModelUsers modelUsers = ModelUsers.getInstance();
        List<User> users = modelUsers.getModel();
        httpServletRequest.setAttribute("users", users);
        if (httpServletRequest.getSession().getAttribute("del")!=null) {
            Integer id = (Integer)httpServletRequest.getSession().getAttribute("del");
            modelUsers.del(modelUsers.getUser(id));
            RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/views/mainAdmin.jsp");
            requestDispatcher.forward(httpServletRequest,httpServletResponse);
        }

    }
}
