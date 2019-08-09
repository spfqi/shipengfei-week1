package com.shipengfei.week1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shipengfei.week1.domain.Plant;
import com.shipengfei.week1.service.PlantService;
import com.shipengfei.week1.utils.Pages;


@Controller
public class PlantController {
	@Autowired
	private PlantService service;
	
	@RequestMapping("list")
	public String selcets(String pname,Model model,@RequestParam(defaultValue = "1")Integer pageNum) {
		int pageSize=2;
		PageHelper.startPage(pageNum, pageSize);
		List<Plant> list=service.selects(pname);
		PageInfo<Plant> info = new PageInfo<Plant>(list);
		Pages.page(pageNum, info, model, "");
		model.addAttribute("list", list);
		model.addAttribute("pname", pname);
		return "list";
	}
	
	@ResponseBody
	@RequestMapping("add")
	public boolean add(Plant p) {
		return service.add(p)>0;
		
	}

}
