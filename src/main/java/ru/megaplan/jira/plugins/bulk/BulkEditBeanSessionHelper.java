package ru.megaplan.jira.plugins.bulk;

import com.atlassian.jira.web.SessionKeys;
import com.atlassian.jira.web.bean.BulkEditBean;
import webwork.action.ActionContext;

/**
 * Created with IntelliJ IDEA.
 * User: Firfi
 * Date: 6/9/12
 * Time: 12:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class BulkEditBeanSessionHelper
{
    public static void storeToSession(final BulkEditBean bulkEditBean)
    {
        ActionContext.getSession().put(SessionKeys.BULKEDITBEAN, bulkEditBean);
    }

    public static BulkEditBean getFromSession()
    {
        return (BulkEditBean) ActionContext.getSession().get(SessionKeys.BULKEDITBEAN);
    }

    public static void removeFromSession()
    {
        ActionContext.getSession().remove(SessionKeys.BULKEDITBEAN);
    }
}
