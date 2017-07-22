package com.randhir.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Student extends MultiActionController
{

    protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
       ModelAndView view=new ModelAndView("index","msg","index.jsp");
       return  view;
    }
    public  void methodShow(HttpServletRequest request, HttpServletResponse response) throws  Exception
    {
        response.setContentType("text/html");
       response.getWriter().println("<b>HELLO World</b>");
    }
}
