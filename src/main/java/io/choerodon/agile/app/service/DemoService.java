package io.choerodon.agile.app.service;

import io.choerodon.agile.domain.agile.event.OrganizationRegisterEventPayload;

/**
 * Created by HuangFuqiang@choerodon.io on 2019/01/07.
 * Email: fuqianghuang01@gmail.com
 */
public interface DemoService {

    OrganizationRegisterEventPayload demoInit(OrganizationRegisterEventPayload demoProjectPayload);

//    void demoDelete(Long projectId);

}
