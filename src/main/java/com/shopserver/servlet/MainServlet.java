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
@WebServlet("/")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
      //  PrintWriter out = resp.getWriter();
      //  out.print("<h1>Hello Servlet</h1>");
        req.setAttribute("site_name", "Магазин одежды 'Модная жопа'");
        req.getRequestDispatcher("main.jsp").forward(req, resp);
    }


}
