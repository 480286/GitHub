package com.mypack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mypack.entity.Student;
import com.mypack.service.StudentServiceIF;

@Controller
@ComponentScan("com.mypack.service")
public class StudentController {
	
	@Autowired
	StudentServiceIF stuService;
	
	@RequestMapping("/load")
	public String load(int id, Model model) {
		Student stu=stuService.queryOneStu(id);
		model.addAttribute("stu", stu);
		return "update";
	}
	
	@RequestMapping("/list")
	public String listAll(Model model){
		List<Student> stuLst=stuService.queryAllStu();
		model.addAttribute("stuLst", stuLst);
		return "list";
	}
	
	@RequestMapping("/add")
	public String add(Student stu) {
		boolean flag=stuService.addStu(stu);
		if(flag) {
			return "redirect:/list";
		}else {
			return "add";
		}
		
	}
	
	@RequestMapping("/delete")
	public String delete(int id) {
		boolean flag=stuService.deleteStu(id);
		if(flag) {
			return "redirect:/list";
		}
		return null;
	}
	
	@RequestMapping("/update")
	public String update(Student stu) {
		boolean flag=stuService.updateStu(stu);
		if(flag) {
			return "redirect:/list";
		}else {
			return "update";
		}
	}
}
