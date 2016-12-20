package org.storefront.service.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.storefront.daos.BugDAO;
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
		final List<BugModel> result = bugDAO.findBugsByTitle(title);
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("Bug with title '" + title + "' not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException("Bug title '" + title + "' is not unique, " + result.size() + " bugs found!");
		}
		return result.get(0);
	}

	@Override
	public void addBug(final BugModel bm)
	{
		System.out.println("Service数据:" + bm);
		bugDAO.addBug(bm);
	}

}
