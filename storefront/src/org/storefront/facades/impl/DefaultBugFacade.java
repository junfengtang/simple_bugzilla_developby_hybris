package org.storefront.facades.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.storefront.data.BugData;
import org.storefront.enums.Serverity;
import org.storefront.facades.BugFacade;
import org.storefront.model.BugModel;
import org.storefront.service.BugService;


@Component(value = "bugFacade")
public class DefaultBugFacade implements BugFacade
{
	@Resource
	private BugService bugService;

	/**
	 * getBugs Bug列表
	 */
	@Override
	public List<BugData> getBugs()
	{
		final List<BugModel> bugModels = bugService.getBugs();
		final List<BugData> bugFacadeData = new ArrayList<BugData>();
		for (final BugModel sm : bugModels)
		{
			final BugData sfd = new BugData();
			sfd.setTitle(sm.getTitle());
			sfd.setServerity(sm.getServerity().toString());
			sfd.setBugreslover(sm.getBugreslover());
			sfd.setDescription(sm.getDescription());
			bugFacadeData.add(sfd);
		}
		return bugFacadeData;
	}

	/**
	 * getBug Bug详情
	 */
	@Override
	public BugData getBug(final String title)
	{
		BugModel bugModel = null;
		if (title != null)
		{
			bugModel = bugService.getBugForTitle(title);
			if (bugModel == null)
			{
				return null;
			}
		}
		else
		{
			throw new IllegalArgumentException("Bug with name " + title + " not found.");
		}
		final BugData bugData = new BugData();
		bugData.setTitle(bugModel.getTitle());
		bugData.setServerity(bugModel.getServerity().toString());
		bugData.setBugreslover(bugModel.getBugreslover());
		bugData.setDescription(bugModel.getDescription());
		return bugData;
	}

	/**
	 * 提交bug
	 */
	@Override
	public void addBug(final BugData bugData)
	{
		final BugModel bm = new BugModel();
		bm.setTitle(bugData.getTitle());
		bm.setServerity(Serverity.valueOf(bugData.getServerity()));
		bm.setBugreslover(bugData.getBugreslover());
		bm.setDescription(bugData.getDescription());
		bugService.addBug(bm);
	}

	/**
	 * 删除bug
	 */
	@Override
	public void deleteBug(final String title)
	{
		bugService.deleteBug(title);
	}

	/**
	 * 编辑
	 */
	@Override
	public void editBug(final String title, final BugData bugData)
	{
		bugService.editBug(title, bugData);
	}









}
