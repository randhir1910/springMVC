package com.randhir.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class Student
{
    @RequestMapping(value ="hello/{firstName}/{lastName}")
     @ResponseBody
   String index(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName)
   {
       return firstName+lastName;
   }
}
