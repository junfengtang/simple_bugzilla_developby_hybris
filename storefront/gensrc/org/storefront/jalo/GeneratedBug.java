/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2016-12-20 10:19:08                         ---
 * ----------------------------------------------------------------
 */
package org.storefront.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.storefront.constants.StorefrontConstants;
import org.storefront.jalo.BugComment;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Bug}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBug extends GenericItem
{
	/** Qualifier of the <code>Bug.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>Bug.serverity</code> attribute **/
	public static final String SERVERITY = "serverity";
	/** Qualifier of the <code>Bug.bugreslover</code> attribute **/
	public static final String BUGRESLOVER = "bugreslover";
	/** Qualifier of the <code>Bug.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>Bug.BugComment</code> attribute **/
	public static final String BUGCOMMENT = "BugComment";
	/**
	* {@link OneToManyHandler} for handling 1:n BUGCOMMENT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BugComment> BUGCOMMENTHANDLER = new OneToManyHandler<BugComment>(
	StorefrontConstants.TC.BUGCOMMENT,
	false,
	"Bug",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(SERVERITY, AttributeMode.INITIAL);
		tmp.put(BUGRESLOVER, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.BugComment</code> attribute.
	 * @return the BugComment
	 */
	public Collection<BugComment> getBugComment(final SessionContext ctx)
	{
		return BUGCOMMENTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.BugComment</code> attribute.
	 * @return the BugComment
	 */
	public Collection<BugComment> getBugComment()
	{
		return getBugComment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.BugComment</code> attribute. 
	 * @param value the BugComment
	 */
	public void setBugComment(final SessionContext ctx, final Collection<BugComment> value)
	{
		BUGCOMMENTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.BugComment</code> attribute. 
	 * @param value the BugComment
	 */
	public void setBugComment(final Collection<BugComment> value)
	{
		setBugComment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to BugComment. 
	 * @param value the item to add to BugComment
	 */
	public void addToBugComment(final SessionContext ctx, final BugComment value)
	{
		BUGCOMMENTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to BugComment. 
	 * @param value the item to add to BugComment
	 */
	public void addToBugComment(final BugComment value)
	{
		addToBugComment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from BugComment. 
	 * @param value the item to remove from BugComment
	 */
	public void removeFromBugComment(final SessionContext ctx, final BugComment value)
	{
		BUGCOMMENTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from BugComment. 
	 * @param value the item to remove from BugComment
	 */
	public void removeFromBugComment(final BugComment value)
	{
		removeFromBugComment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.bugreslover</code> attribute.
	 * @return the bugreslover - Bugreslover
	 */
	public String getBugreslover(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUGRESLOVER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.bugreslover</code> attribute.
	 * @return the bugreslover - Bugreslover
	 */
	public String getBugreslover()
	{
		return getBugreslover( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.bugreslover</code> attribute. 
	 * @param value the bugreslover - Bugreslover
	 */
	public void setBugreslover(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUGRESLOVER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.bugreslover</code> attribute. 
	 * @param value the bugreslover - Bugreslover
	 */
	public void setBugreslover(final String value)
	{
		setBugreslover( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.serverity</code> attribute.
	 * @return the serverity - Severity
	 */
	public EnumerationValue getServerity(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SERVERITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.serverity</code> attribute.
	 * @return the serverity - Severity
	 */
	public EnumerationValue getServerity()
	{
		return getServerity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.serverity</code> attribute. 
	 * @param value the serverity - Severity
	 */
	public void setServerity(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SERVERITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.serverity</code> attribute. 
	 * @param value the serverity - Severity
	 */
	public void setServerity(final EnumerationValue value)
	{
		setServerity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.title</code> attribute.
	 * @return the title
	 */
	public String getTitle(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Bug.title</code> attribute.
	 * @return the title
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Bug.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
}
