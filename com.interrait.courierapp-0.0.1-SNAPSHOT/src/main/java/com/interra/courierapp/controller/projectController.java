package com.interra.courierapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class projectController {
		@RequestMapping("/home")
		public String homePage(){
			return "homepage";
		}
}
