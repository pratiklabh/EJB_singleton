package com.sts.ejb_singleton.test;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/counter")
public class CounterServlet extends HttpServlet {
    @EJB
    private CounterBeanLocal counterBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        counterBean.increment(); // Increment the counter
        int count = counterBean.getCount(); // Get the current count

        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.println("Hello sistorrrrrrr, padhai karo padhai ");
        out.println("Current count: " + count);
    }
}