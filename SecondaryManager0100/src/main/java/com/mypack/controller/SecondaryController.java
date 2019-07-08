package com.mypack.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mypack.entity.CaiDan_Yi;
import com.mypack.entity.SecondaryMenu;
import com.mypack.service.CaiDan_YiIF;
import com.mypack.service.SecondaryServiceIF;

@Controller
public class SecondaryController {

	
	@Autowired
	CaiDan_YiIF caidan_yi;

	@Autowired
	SecondaryServiceIF secondaryService;

	@RequestMapping("index")
	public String lists(Model model) {
		
		List<CaiDan_Yi> caiDan_yi=caidan_yi.queryAllCaiDan();
		model.addAttribute("lstMenus", caiDan_yi);
		return "index";
	}
	
	@RequestMapping("a_list")
	public String list(HttpServletRequest request, Model model) {
		String ids=request.getParameter("id");
		System.out.println("******************************************************");
		System.out.println(ids);
		int id = Integer.parseInt(ids);
		List<SecondaryMenu> lstMenu= secondaryService.queryAllMenuByA_Id(id);
		model.addAttribute("lstMenu", lstMenu);
		List<CaiDan_Yi> caiDan_yi=caidan_yi.queryAllCaiDan();
		model.addAttribute("lstMenus", caiDan_yi);
		return "index";
	}
}
