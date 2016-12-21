package org.storefront.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.storefront.data.BugData;
import org.storefront.facades.BugFacade;


@Controller
public class BugController
{
	@Resource
	private BugFacade bugFacade;

	//列表
	@RequestMapping(value = "/bugs", method = RequestMethod.GET)
	public String showBugs(final Model model)
	{
		final List<BugData> bugs = bugFacade.getBugs();
		model.addAttribute("bugs", bugs);
		return "BugListing";
	}

	//详情
	@RequestMapping(value = "/show/{title}", method = RequestMethod.GET)
	public String showBugDetails(@PathVariable final String title, final Model model)
	{
		final BugData bugData = bugFacade.getBug(title);
		model.addAttribute("bugData", bugData);
		return "ViewBug";
	}

	//添加bug视图
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addBugView()
	{
		return "AddBug";
	}

	//post表单提交地址
	@RequestMapping(value = "/addBug", method = RequestMethod.POST)
	public String addBugData(final BugData bugData)
	{
		bugFacade.addBug(bugData);
		return "Success";
	}

	//删除
	@RequestMapping(value = "/delete/{title}", method = RequestMethod.GET)
	public String deleteBug(@PathVariable final String title)
	{
		bugFacade.deleteBug(title);
		return "Success";
	}

	//编辑bug
	@RequestMapping(value = "/edit/{title}", method = RequestMethod.GET)
	public String editBug(@PathVariable final String title, final Model model)
	{
		final BugData bugData = bugFacade.getBug(title);
		model.addAttribute("bugData", bugData);
		return "EditBug";
	}

	//编辑bug
	@RequestMapping(value = "/editBug/{title}", method = RequestMethod.POST)
	public String editBugdata(@PathVariable final String title, final BugData bugData)
	{
		bugFacade.editBug(title, bugData);
		System.out.println("Controller data" + bugData);
		return "Success";
	}





}
