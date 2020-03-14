package com.allcb.cc.daoc.entity;

import com.allcb.cc.daoc.entity.common.CommonEntity;

public class CfgTableEntity extends CommonEntity {
    public String getTableCode() {
        return tableCode;
    }

    public void setTableCode(String tableCode) {
        this.tableCode = tableCode;
    }

    public Short getTableType() {
        return tableType;
    }

    public void setTableType(Short tableType) {
        this.tableType = tableType;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableNameCn() {
        return tableNameCn;
    }

    public void setTableNameCn(String tableNameCn) {
        this.tableNameCn = tableNameCn;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 表编号
     */
    private String tableCode;
    /**
     * 表类型 ： 1：基础表；2：业务表；3：字段表；4：......
     */
    private short tableType;
    /**
     * 英文名称
     */
    private String tableName;
    /**
     * 中文名称
     */
    private String tableNameCn;
    /**
     * 备注
     */
    private String remark;
}