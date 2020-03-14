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
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    /**
     * 
     */
    private String tableCode;
    /**
     * 
     */
    private Short tableType;
    /**
     * 
     */
    private String tableName;
    /**
     * 
     */
    private String tableNameCn;
    /**
     * 
     */
    private String Remark;
}