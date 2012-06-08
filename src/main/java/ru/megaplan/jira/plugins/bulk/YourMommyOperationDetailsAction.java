package ru.megaplan.jira.plugins.bulk;

import com.atlassian.jira.bulkedit.BulkOperationManager;
import com.atlassian.jira.bulkedit.operation.BulkOperation;
import com.atlassian.jira.web.action.JiraWebActionSupport;
import com.atlassian.jira.web.bean.BulkEditBean;
import com.atlassian.jira.web.bean.BulkEditBeanFactory;


/**
 * Created with IntelliJ IDEA.
 * User: Firfi
 * Date: 6/8/12
 * Time: 11:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class YourMommyOperationDetailsAction extends JiraWebActionSupport {

    private final BulkEditBeanFactory bulkEditBeanFactory;
    private final BulkOperationManager bulkOperationManager;
    private final BulkOperation exampleBulkOperation;

    YourMommyOperationDetailsAction(BulkEditBeanFactory bulkEditBeanFactory, BulkOperationManager bulkOperationManager) {
        this.bulkEditBeanFactory = bulkEditBeanFactory;
        this.bulkOperationManager = bulkOperationManager;
        exampleBulkOperation = bulkOperationManager.getOperation(ExampleBulkOperation.class.getName());
    }

    @Override
    public String doDefault() {
        return INPUT;
    }

    public BulkEditBean getRootBulkEditBean()
    {
        BulkEditBean bean = BulkEditBeanSessionHelper.getFromSession();
        return bean;
    }

    public String doPerform() {
        log.warn("perform");
        return INPUT;
    }

    public String doDetails() {
        BulkEditBean bean = getRootBulkEditBean();
        bean.addAvailablePreviousStep(2);
        bean.setCurrentStep(3);
        log.warn("details" + bean.getSelectedIssues().iterator().next());
        return INPUT;
    }

    public String doDetailsValidation() {
        log.warn("detailsValidation");
        return SUCCESS;
    }

}
