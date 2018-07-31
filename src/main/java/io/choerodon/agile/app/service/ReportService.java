package io.choerodon.agile.app.service;

import io.choerodon.agile.api.dto.*;
import io.choerodon.agile.infra.dataobject.EpicChartDO;
import io.choerodon.agile.infra.dataobject.EpicChartListDO;
import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;

import java.util.List;
import java.util.Map;

/**
 * @author dinghuang123@gmail.com
 * @since 2018/6/19
 */
public interface ReportService {

    /**
     * 燃尽图报告信息
     *
     * @param projectId projectId
     * @param sprintId  sprintId
     * @param type      storyPoints、remainingEstimatedTime、originalEstimatedTime、issueCount
     * @return ReportIssueDTO
     */
    List<ReportIssueDTO> queryBurnDownReport(Long projectId, Long sprintId, String type);

    /**
     * 查看累积流量图
     *
     * @param projectId               projectId
     * @param cumulativeFlowFilterDTO cumulativeFlowFilterDTO
     * @return CumulativeFlowDiagramDTO
     */
    List<CumulativeFlowDiagramDTO> queryCumulativeFlowDiagram(Long projectId, CumulativeFlowFilterDTO cumulativeFlowFilterDTO);

    Page<IssueListDTO> queryIssueByOptions(Long projectId, Long versionId, String status, String type, PageRequest pageRequest);

    Map<String, Object> queryVersionLineChart(Long projectId, Long versionId, String type);

    List<VelocitySprintDTO> queryVelocityChart(Long projectId, String type);

    /**
     * 根据项目id和字段名称查询饼图
     *
     * @param projectId projectId
     * @param fieldName fieldName
     * @return PieChartDTO
     */
    List<PieChartDTO> queryPieChart(Long projectId, String fieldName);

    List<EpicChartDO> queryEpicChart(Long projectId, Long epicId, String type);

    List<EpicChartListDO> queryEpicChartList(Long projectId, Long epicId);

    /**
     * 查询燃尽图坐标信息
     *
     * @param projectId projectId
     * @param sprintId  sprintId
     * @param type      type
     * @return Coordinate
     */
    Map<String, Integer> queryBurnDownCoordinate(Long projectId, Long sprintId, String type);
}
