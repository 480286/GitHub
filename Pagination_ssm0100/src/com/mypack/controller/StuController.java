package com.mypack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.mypack.entity.Student;
import com.mypack.service.StuServiceIF;

@Controller
public class StuController {

	@Autowired
	StuServiceIF stuService;
	

	@RequestMapping("/list")
	public String list(Integer currentPage, Model model){
		if(currentPage==null) {
			currentPage=1;
		}
		PageInfo<Student> pf=stuService.queryAllStuByPage(currentPage, 3);

		if(pf.getPageNum()==pf.getFirstPage()) {
			pf.setPrePage(pf.getFirstPage());
		}
		
		if(pf.getPageNum()==pf.getLastPage()) {
			pf.setNextPage(pf.getLastPage());
		}
		
		model.addAttribute("pf", pf);
		
		return "list";
	}
	
	
	
}
