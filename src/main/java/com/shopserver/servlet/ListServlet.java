package com.shopserver.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Анюта on 16.02.2017.
 */
@WebServlet("/list")
public class ListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
       // PrintWriter out = resp.getWriter();
       // out.print("<h1>List of products</h1>");
        req.getRequestDispatcher("list.jsp").forward(req, resp);
    }


}
