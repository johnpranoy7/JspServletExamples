package com.cg.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/addMethod")
	public ModelAndView add(@RequestParam("1") int n1, @RequestParam("2") int n2) {
		int result= n1+n2;
		System.out.println(n1+" "+n2);
	ModelAndView mv= new ModelAndView("display","myResult",result);
//	mv.setViewName("display");
//	mv.addObject("myResult",result);
	System.out.println(result);
	return mv;
			}
}
