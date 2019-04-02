package io.choerodon.agile.api.dto;

import io.choerodon.agile.infra.common.utils.StringUtil;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author dinghuang123@gmail.com
 * @since 2018/9/17
 */
public class IssuePriorityDistributionChartDTO {

    @ApiModelProperty(value = "优先级名称")
    private String name;

    @ApiModelProperty(value = "当前优先级下的问题数量之和")
    private Integer totalCount;

    @ApiModelProperty(value = "当前优先级下的已完成问题数量之和")
    private Integer doneCount;

    @ApiModelProperty(value = "优先级DTO")
    private PriorityDTO priorityDTO;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriorityDTO(PriorityDTO priorityDTO) {
        this.priorityDTO = priorityDTO;
    }

    public PriorityDTO getPriorityDTO() {
        return priorityDTO;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getDoneCount() {
        return doneCount;
    }

    public void setDoneCount(Integer doneCount) {
        this.doneCount = doneCount;
    }

    @Override
    public String toString() {
        return StringUtil.getToString(this);
    }
}
