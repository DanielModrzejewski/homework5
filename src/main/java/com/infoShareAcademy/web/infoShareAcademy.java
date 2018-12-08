package com.infoShareAcademy.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@WebServlet(urlPatterns = "/infoShareAcademy")
public class infoShareAcademy extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        out.println("<h1> Daniel Modrzejewski </h1>");
        out.println("<h1> JDD5:zaJavka </h1>");
        out.println("<h1> " + LocalDateTime.now() + "</h1>");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();

        List<String> parNamesList = Collections.list(req.getParameterNames());
        for (String parName : parNamesList) {
            String[] parValuesList = req.getParameterValues(parName);
            for (String parValue : parValuesList) {
                out.println("<h1> " + parName + ":" + parValue + "</h1>");
            }

        }
    }
}
