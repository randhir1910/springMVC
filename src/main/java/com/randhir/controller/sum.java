package com.randhir.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by randhir on 12/7/17.
 */
@Controller
public class sum
{
   @RequestMapping("/addEmp")
    public ModelAndView add()
    {

        return  new ModelAndView("/WEB-INF/view.jsp","name","hello world");
    }
}
