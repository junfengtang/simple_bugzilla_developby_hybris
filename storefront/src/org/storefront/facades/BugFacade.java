package org.storefront.facades;

import java.util.List;

import org.storefront.data.BugData;


public interface BugFacade
{
	BugData getBug(String title);

	List<BugData> getBugs();

	public void addBug(BugData bugData);

	public void deleteBug(final String title);

	public void editBug(String title, BugData bugData);

}
