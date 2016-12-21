/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2016-12-21 9:35:06                          ---
 * ----------------------------------------------------------------
 */
package org.storefront.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.storefront.constants.StorefrontConstants;
import org.storefront.jalo.Bug;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem BugComment}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBugComment extends GenericItem
{
	/** Qualifier of the <code>BugComment.time</code> attribute **/
	public static final String TIME = "time";
	/** Qualifier of the <code>BugComment.commentPeople</code> attribute **/
	public static final String COMMENTPEOPLE = "commentPeople";
	/** Qualifier of the <code>BugComment.commentDesc</code> attribute **/
	public static final String COMMENTDESC = "commentDesc";
	/** Qualifier of the <code>BugComment.Bug</code> attribute **/
	public static final String BUG = "Bug";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n BUG's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBugComment> BUGHANDLER = new BidirectionalOneToManyHandler<GeneratedBugComment>(
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
		tmp.put(TIME, AttributeMode.INITIAL);
		tmp.put(COMMENTPEOPLE, AttributeMode.INITIAL);
		tmp.put(COMMENTDESC, AttributeMode.INITIAL);
		tmp.put(BUG, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugComment.Bug</code> attribute.
	 * @return the Bug
	 */
	public Bug getBug(final SessionContext ctx)
	{
		return (Bug)getProperty( ctx, BUG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugComment.Bug</code> attribute.
	 * @return the Bug
	 */
	public Bug getBug()
	{
		return getBug( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugComment.Bug</code> attribute. 
	 * @param value the Bug
	 */
	public void setBug(final SessionContext ctx, final Bug value)
	{
		BUGHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugComment.Bug</code> attribute. 
	 * @param value the Bug
	 */
	public void setBug(final Bug value)
	{
		setBug( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugComment.commentDesc</code> attribute.
	 * @return the commentDesc - CommentDesc
	 */
	public String getCommentDesc(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMMENTDESC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugComment.commentDesc</code> attribute.
	 * @return the commentDesc - CommentDesc
	 */
	public String getCommentDesc()
	{
		return getCommentDesc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugComment.commentDesc</code> attribute. 
	 * @param value the commentDesc - CommentDesc
	 */
	public void setCommentDesc(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMMENTDESC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugComment.commentDesc</code> attribute. 
	 * @param value the commentDesc - CommentDesc
	 */
	public void setCommentDesc(final String value)
	{
		setCommentDesc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugComment.commentPeople</code> attribute.
	 * @return the commentPeople - CommentPeople
	 */
	public String getCommentPeople(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMMENTPEOPLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugComment.commentPeople</code> attribute.
	 * @return the commentPeople - CommentPeople
	 */
	public String getCommentPeople()
	{
		return getCommentPeople( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugComment.commentPeople</code> attribute. 
	 * @param value the commentPeople - CommentPeople
	 */
	public void setCommentPeople(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMMENTPEOPLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugComment.commentPeople</code> attribute. 
	 * @param value the commentPeople - CommentPeople
	 */
	public void setCommentPeople(final String value)
	{
		setCommentPeople( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		BUGHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugComment.time</code> attribute.
	 * @return the time
	 */
	public String getTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BugComment.time</code> attribute.
	 * @return the time
	 */
	public String getTime()
	{
		return getTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugComment.time</code> attribute. 
	 * @param value the time
	 */
	public void setTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BugComment.time</code> attribute. 
	 * @param value the time
	 */
	public void setTime(final String value)
	{
		setTime( getSession().getSessionContext(), value );
	}
	
}
