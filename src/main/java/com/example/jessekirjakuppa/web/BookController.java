package com.example.jessekirjakuppa.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


public class BookController {
	
	@RequestMapping("/index")
	public String viewBooks() {
		return "";
	}

}
