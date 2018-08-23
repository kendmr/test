package com.chinaPay.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        doPost(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response){
        System.out.print("test");
    }
}
