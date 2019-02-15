package io.choerodon.agile.app.service;

import io.choerodon.agile.api.dto.IssueStatusDTO;
import io.choerodon.agile.api.dto.StatusAndIssuesDTO;
import io.choerodon.agile.api.dto.StatusMoveDTO;
import io.choerodon.agile.domain.agile.event.StatusPayload;

import java.util.List;

/**
 * Created by HuangFuqiang@choerodon.io on 2018/5/16.
 * Email: fuqianghuang01@gmail.com
 */
public interface IssueStatusService {

    IssueStatusDTO create(Long projectId, IssueStatusDTO issueStatusDTO);

    IssueStatusDTO createStatusByStateMachine(Long projectId, IssueStatusDTO issueStatusDTO);

    IssueStatusDTO moveStatusToColumn(Long projectId, Long statusId, StatusMoveDTO statusMoveDTO);

    List<StatusAndIssuesDTO> queryUnCorrespondStatus(Long projectId, Long boardId);

    IssueStatusDTO moveStatusToUnCorrespond(Long projectId, Long statusId, StatusMoveDTO statusMoveDTO);

    void deleteStatus(Long projectId, Long statusId);

    void consumDeleteStatus(StatusPayload statusPayload);

    /**
     * 查询issueStatus列表
     *
     * @param projectId projectId
     * @return IssueStatusDTO
     */
    List<IssueStatusDTO> queryIssueStatusList(Long projectId);

    IssueStatusDTO updateStatus(Long projectId, IssueStatusDTO issueStatusDTO);

    void moveStatus();

    void updateAllData();
}
