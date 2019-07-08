package com.mypack.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.mypack.entity.YingXiong;
import com.mypack.service.YingXiongServiceIF;

@Controller
public class YingXiongController {
	@Autowired
	YingXiongServiceIF yxsi;
	
	public YingXiongServiceIF getYxsi() {
		return yxsi;
	}

	public void setYxsi(YingXiongServiceIF yxsi) {
		this.yxsi = yxsi;
	}

	@RequestMapping("/xinXi")
	public String xinXi(Integer currentPage,Model model){
		if(currentPage==null){
			currentPage=1;
		}
		PageInfo<YingXiong> pf=yxsi.queryOneAllYXPage(currentPage, 4);
		if(pf.getPageNum()==pf.getFirstPage()){
			pf.setPrePage(pf.getFirstPage());
		}
		if(pf.getPageNum()==pf.getLastPage()){
			pf.setNextPage(pf.getLastPage());
		}
		System.out.println(pf);
		model.addAttribute("pf",pf);
		return "shouye";
	}

	@RequestMapping("/xiangQing")
	public String xiangQing(int id,Model model){
		YingXiong yx = yxsi.queryOneYX(id);
		model.addAttribute("yx", yx);
		return "xiangqing";
	}
	@RequestMapping("/add")
	public String add(){
		
		return "add";
	}
	@RequestMapping("/towAdd")
	public String towAdd(YingXiong yx){
		yxsi.insertOneYX(yx);
		return "redirect:xinXi";
	}
	@RequestMapping("/bianJi")
	public String bianJi(int id,Model model){
		YingXiong yx=yxsi.queryOneYX(id);
		model.addAttribute("yx", yx);
		return "bianji";
	}
	@RequestMapping("/towBianJi")
	public String towBianJi(YingXiong yx){
		yxsi.updateOneYX(yx);
		return "redirect:xinXi";
	}
	@RequestMapping("/tiaoZhuan")
	public String tiaoZhuan(int id,Model model){		
		PageInfo<YingXiong> py=yxsi.queryOneAllYXPage(id, 4);
		if(id>py.getPages()){
			id=py.getPages();
		}
		if(id<1){
			id=1;
		}
		PageInfo<YingXiong> pf=yxsi.queryOneAllYXPage(id, 4);
		if(pf.getPageNum()==pf.getFirstPage()){
			pf.setPrePage(pf.getFirstPage());
		}
		if(pf.getPageNum()==pf.getLastPage()){
			pf.setNextPage(pf.getLastPage());
		}
		
		model.addAttribute("pf",pf);
		return "shouye";
	}
	@RequestMapping("/shanChu")
	public String shanChu(int id){
		yxsi.deleteOneYX(id);
		return "redirect:xinXi";
	}
	YingXiong yx=null;
	@RequestMapping("/souye")
	public String sou_ye(Integer currentPage,Model model){		
		PageInfo<YingXiong> py=yxsi.queryFenLei(currentPage, 4, yx);
		if(currentPage>py.getPages()){
			currentPage=py.getPages();
		}
		if(currentPage<1){
			currentPage=1;
		}
		PageInfo<YingXiong> pf=yxsi.queryFenLei(currentPage, 4, yx);
		if(pf.getPageNum()==pf.getFirstPage()){
			pf.setPrePage(pf.getFirstPage());
		}
		if(pf.getPageNum()==pf.getLastPage()){
			pf.setNextPage(pf.getLastPage());
		}
		
		model.addAttribute("pf",pf);
		return "sou_shouye";
	}
	
	@RequestMapping("/souSuo")
	public String souSuo(Integer currentPage,Model model,YingXiong yxiong){
		yx=yxiong;
		if(currentPage==null){
			currentPage=1;		
		}
		if(yx==null){
			return "shouye";
		}
		PageInfo<YingXiong> pf=yxsi.queryFenLei(currentPage, 4, yx);
		if(pf.getPageNum()==pf.getFirstPage()){
			pf.setPrePage(pf.getFirstPage());
		}
		if(pf.getPageNum()==pf.getLastPage()){
			pf.setNextPage(pf.getLastPage());
		}
		model.addAttribute("pf",pf);
		return "sou_shouye";
	}
	
	
}
