package org.storefront.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.storefront.daos.BugDAO;
import org.storefront.data.BugData;
import org.storefront.model.BugModel;
import org.storefront.service.BugService;



@Component(value = "bugService")
public class DefaultBugService implements BugService
{
	@Resource
	private BugDAO bugDAO;

	@Override
	public List<BugModel> getBugs()
	{
		return bugDAO.findBugs();
	}

	@Override
	public BugModel getBugForTitle(final String title)
	{
		final BugModel result = bugDAO.findBugsByTitle(title);
		return result;
	}

	@Override
	public void addBug(final BugModel bm)
	{
		bugDAO.addBug(bm);
	}

	@Override
	public void deleteBug(final String title)
	{
		bugDAO.deleteBug(title);

	}

	@Override
	public void editBug(final String title, final BugData bugData)
	{
		bugDAO.editBug(title, bugData);
	}

}
