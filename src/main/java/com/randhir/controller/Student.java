package com.randhir.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class Student extends AbstractController
{

    protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
       ModelAndView view=new ModelAndView("index","msg","index.jsp");
       return  view;
    }
}
