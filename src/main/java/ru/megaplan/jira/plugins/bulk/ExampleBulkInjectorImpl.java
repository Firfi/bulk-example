package ru.megaplan.jira.plugins.bulk;

import com.atlassian.jira.bulkedit.BulkOperationManager;
import com.atlassian.sal.api.lifecycle.LifecycleAware;

/**
 * Created with IntelliJ IDEA.
 * User: Firfi
 * Date: 6/8/12
 * Time: 11:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExampleBulkInjectorImpl implements ExampleBulkInjector, LifecycleAware {

    private final BulkOperationManager bulkOperationManager;

    ExampleBulkInjectorImpl(BulkOperationManager bulkOperationManager) {
        this.bulkOperationManager = bulkOperationManager;
    }

    @Override
    public void onStart() {
        bulkOperationManager.addBulkOperation("ru.megaplan.jira.plugins.bulk.ExampleBulkOperation", ExampleBulkOperation.class);
    }
}
