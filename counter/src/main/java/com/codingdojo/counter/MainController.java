package com.codingdojo.counter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	@GetMapping("/")
	public String index(HttpSession session) {
		Integer visits = 0;
		
		if (session.getAttribute("visits") == null) {
			session.setAttribute("visits", 0);
		} else {
			visits = (Integer) session.getAttribute("visits");
			visits += 1;
			session.setAttribute("visits", visits);
		}
		return "index.jsp";
	}
	
	@GetMapping("/counter")
	public String counter() {
		return "counter.jsp";
	}
}
