package com.allcb.cc.daoc.entity;

import com.allcb.cc.daoc.entity.common.CommonEntity;

public class CfgBizParamEntity extends CommonEntity {

    public String getTableRecordId() {
        return tableRecordId;
    }

    public void setTableRecordId(String tableRecordId) {
        this.tableRecordId = tableRecordId;
    }

    public String getColumnRecordId() {
        return columnRecordId;
    }

    public void setColumnRecordId(String columnRecordId) {
        this.columnRecordId = columnRecordId;
    }

    public String getBizRecordId() {
        return bizRecordId;
    }

    public void setBizRecordId(String bizRecordId) {
        this.bizRecordId = bizRecordId;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getParamNameCn() {
        return paramNameCn;
    }

    public void setParamNameCn(String paramNameCn) {
        this.paramNameCn = paramNameCn;
    }

    public String getParamAlias() {
        return paramAlias;
    }

    public void setParamAlias(String paramAlias) {
        this.paramAlias = paramAlias;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private String tableRecordId;

    private String columnRecordId;

    /**业务RECORD_ID*/
    private String bizRecordId ;

    /**参数名称*/
    private String paramName ;

    /**请求参数类型 ： G 查询参数； I 插入参数； U 更新参数； D 删除参数 */
    private String requestType;

    /**参数中文名称*/
    private String paramNameCn ;

    /**参数名称别名*/
    private String paramAlias ;

    /**备注*/
    private String remark ;

}