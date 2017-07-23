package com.randhir.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.Map;

@Controller
public class Student
{
    @RequestMapping(value = "/hello",method = RequestMethod.POST)
  public ModelAndView CountryState(@RequestParam("firstName") String fname,@RequestParam("lastName") String lname)
    {
          ModelAndView view =new ModelAndView("index");
          view.addObject("msg"," firstname  "+fname+" lastname "+lname);
          return  view;
    }
}
