package com.lessons;

/**
 * Hello world!
 *
 */
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.log4j.Logger;

public class App extends HttpServlet
{
   // private Logger logger = Logger.getLogger(this.getClass());
    private RequestDispatcher jsp;

    @Override
    public void init(ServletConfig config) throws ServletException
    {
        ServletContext context = config.getServletContext();
        jsp = context.getRequestDispatcher("/testjsp.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
 //       logger.debug("doGet()");
        jsp.forward(req, resp); 
    }
}