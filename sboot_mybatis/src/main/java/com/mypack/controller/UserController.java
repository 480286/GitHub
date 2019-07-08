package com.mypack.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("listAll")
	public String queryAllUser() {
		System.out.println("hello");
		return "aaaa";
	}
}
