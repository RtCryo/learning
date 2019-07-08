package com.lessons;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append("Hello Servlet " + req.getMethod() + " ");
        HttpSession session = req.getSession();

        if(session.getAttribute("name") == null) {
            session.setAttribute("name", "hello world session");
            resp.getWriter().append(" no session " ) ;
        } else {
            String attribute = session.getAttribute("name").toString();
            resp.getWriter().append(attribute) ;
        }
    }
}
