package com.mypack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.mypack.entity.Goods;
import com.mypack.service.GoodsServiceIF;

@Controller
@Transactional
@RequestMapping("/goods")
public class GoodsController {

	@Autowired
	GoodsServiceIF goodsService;
	
	@RequestMapping("/listGoods")
	public String list(Integer currentPage, Model model) {
		if(currentPage==null) {
			currentPage=1;
		}	
		PageInfo<Goods> pf=goodsService.queryAllGoods(currentPage, 6);
		
		if(pf.getPageNum()==pf.getFirstPage()){
			pf.setPrePage(pf.getFirstPage());
		}
		
		if(pf.getPageNum()==pf.getLastPage()){
			pf.setNextPage(pf.getLastPage());
		}
		model.addAttribute("pf", pf);
		return "listGoods";
	}
	
	@RequestMapping("/loadGoods")
	public String loadGoods(int gId, Model model) {
		Goods goods=goodsService.queryOneGoods(gId);
		model.addAttribute("goods", goods);
		return "loadGoods";
	}
	
}
