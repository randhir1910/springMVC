package com.randhir.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.Map;

@Controller
public class Student
{
    @RequestMapping(value = "/countryAndState/{country}/{state}")
  public ModelAndView CountryState(@PathVariable Map<String,String>  stringMap)
    {
          String country=stringMap.get("country");
          String state=stringMap.get("state");
          ModelAndView view =new ModelAndView("index");
          view.addObject("msg"," country  "+country+" State "+state);
          return  view;
    }
}
