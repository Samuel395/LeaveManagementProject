package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Entity.Leaves;
import com.example.demo.Service.LeaveService;

@RestController
public class UserController {

	@Autowired
	LeaveService leaveService;

	@RequestMapping(value = "/leaves", method = RequestMethod.GET)
	public ModelAndView leaves() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("leaves");
		System.out.println(mv.getModelMap());
		return mv;

	}

	@RequestMapping(value = "/add-leaves", method = RequestMethod.POST)
	public String addleaves(Leaves leaves) {
		leaveService.createLeave(leaves);
		return "redirect/leaves";

	}

}
