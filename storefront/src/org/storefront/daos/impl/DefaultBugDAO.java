package org.storefront.daos.impl;

import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.storefront.daos.BugDAO;
import org.storefront.model.BugModel;


@Component(value = "bugDAO")
public class DefaultBugDAO implements BugDAO
{
	@Autowired
	private FlexibleSearchService flexibleSearchService;

	@Resource
	private ModelService modelService;

	/**
	 * 列表数据查询
	 */
	@Override
	public List<BugModel> findBugs()
	{
		final String queryString = "SELECT {p:" + BugModel.PK + "} " + "FROM {" + BugModel._TYPECODE + " AS p} ";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		return flexibleSearchService.<BugModel> search(query).getResult();
	}

	/**
	 * 详情数据查询
	 */
	@Override
	public List<BugModel> findBugsByTitle(final String title)
	{
		final String queryString = "SELECT {p:" + BugModel.PK + "}" + "FROM {" + BugModel._TYPECODE + " AS p} " + "WHERE " + "{p:"
				+ BugModel.TITLE + "}=?title ";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("title", title);
		return flexibleSearchService.<BugModel> search(query).getResult();
	}

	@Override
	public void addBug(final BugModel bm)
	{
		System.out.println("DAO数据:" + bm);
		modelService.save(bm);
	}



}
