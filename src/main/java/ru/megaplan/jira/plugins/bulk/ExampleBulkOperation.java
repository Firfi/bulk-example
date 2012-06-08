package ru.megaplan.jira.plugins.bulk;

import com.atlassian.crowd.embedded.api.User;
import com.atlassian.jira.bulkedit.operation.BulkOperation;
import com.atlassian.jira.web.bean.BulkEditBean;
import org.apache.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: Firfi
 * Date: 6/8/12
 * Time: 11:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExampleBulkOperation implements BulkOperation {

    private static final Logger log = Logger.getLogger(ExampleBulkOperation.class);

    @Override
    public boolean canPerform(BulkEditBean bulkEditBean, User user) {
        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void perform(BulkEditBean bulkEditBean, User user) throws Exception {
        log.warn("I OPERATION");
    }

    @Override
    public String getOperationName() {
        return "YourMommyOperation";
    }

    @Override
    public String getCannotPerformMessageKey() {
        return "I CANNOT LOL";
    }

    @Override
    public String getNameKey() {
        return this.getClass().getName();
    }

    @Override
    public String getDescriptionKey() {
        return "descriptionKey";
    }
}
