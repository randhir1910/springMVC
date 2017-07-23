package com.randhir.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.Map;
import com.randhir.model.studentModel;
@Controller
public class Student
{
    @RequestMapping(value = "/hello",method = RequestMethod.POST)
  public ModelAndView CountryState(@ModelAttribute studentModel model )
    {
          ModelAndView view =new ModelAndView("index");
          view.addObject("msg"," firstname  "+model.getFirstName()+" lastname "+model.getLastName());
          return  view;
    }
}
