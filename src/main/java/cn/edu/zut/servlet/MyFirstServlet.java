package cn.edu.zut.servlet;

import cn.edu.zut.servlet.persistent.DBoperator;

import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "MyFirstServlet",urlPatterns = "/MyFirstServlet")
public class MyFirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String name =request.getParameter( "names");
        DBoperator dBoperator =new DBoperator();
        dBoperator.insert(name);

        PrintWriter out =response.getWriter();
        out.println(name);
        out.close();

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
