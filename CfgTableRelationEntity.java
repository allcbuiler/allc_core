package com.allcb.cc.daoc.entity;

import com.allcb.cc.daoc.entity.common.CommonEntity;

public class CfgTableRelationEntity extends CommonEntity {
    public String getBizRecordId() {
        return bizRecordId;
    }

    public void setBizRecordId(String bizRecordId) {
        this.bizRecordId = bizRecordId;
    }

    public String getBizTableRecordId() {
        return bizTableRecordId;
    }

    public void setBizTableRecordId(String bizTableRecordId) {
        this.bizTableRecordId = bizTableRecordId;
    }

    public String getTableRecordId() {
        return tableRecordId;
    }

    public void setTableRecordId(String tableRecordId) {
        this.tableRecordId = tableRecordId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableAliasName() {
        return tableAliasName;
    }

    public void setTableAliasName(String tableAliasName) {
        this.tableAliasName = tableAliasName;
    }

    public String getDataSourceGuid() {
        return dataSourceGuid;
    }

    public void setDataSourceGuid(String dataSourceGuid) {
        this.dataSourceGuid = dataSourceGuid;
    }

    public String getIsMasterTable() {
        return isMasterTable;
    }

    public void setIsMasterTable(String isMasterTable) {
        this.isMasterTable = isMasterTable;
    }

    public Short getRelationType() {
        return relationType;
    }

    public void setRelationType(Short relationType) {
        this.relationType = relationType;
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
    private String bizRecordId;

    private String bizTableRecordId;
    /**
     * 
     */
    private String tableRecordId;
    /**
     * 
     */
    private String tableName;
    /**
     * 
     */
    private String tableAliasName;
    /**
     * 
     */
    private String dataSourceGuid;
    /**
     * 
     */
    private String isMasterTable;
    /**
     * 
     */
    private Short relationType;
    /**
     * 
     */
    private String Remark;
}
