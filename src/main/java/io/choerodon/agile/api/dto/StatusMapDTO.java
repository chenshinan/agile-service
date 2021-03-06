package io.choerodon.agile.api.dto;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by HuangFuqiang@choerodon.io on 2018/10/25.
 * Email: fuqianghuang01@gmail.com
 */
public class StatusMapDTO implements Serializable {

    @ApiModelProperty(value = "状态主键id")
    private Long id;

    @ApiModelProperty(value = "状态名称")
    private String name;

    @ApiModelProperty(value = "状态code")
    private String code;

    @ApiModelProperty(value = "状态描述")
    private String description;

    @ApiModelProperty(value = "状态类别")
    private String type;

    @ApiModelProperty(value = "状态所属组织id")
    private Long organizationId;

    @ApiModelProperty(value = "版本号")
    private Long objectVersionNumber;

    @ApiModelProperty(value = "状态是否已完成")
    private Boolean completed;

    @ApiModelProperty(value = "状态是否能删除")
    private Boolean canDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getObjectVersionNumber() {
        return objectVersionNumber;
    }

    public void setObjectVersionNumber(Long objectVersionNumber) {
        this.objectVersionNumber = objectVersionNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public Boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
