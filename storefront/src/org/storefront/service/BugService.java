/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package org.storefront.service;

import java.util.List;

import org.storefront.model.BugModel;


/**
 *
 */
public interface BugService
{
	List<BugModel> getBugs();

	BugModel getBugForTitle(String title);

	public void addBug(BugModel bm);

}
