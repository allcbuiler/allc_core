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
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 业务record_id
     */
    private String bizRecordId;

    private String bizTableRecordId;
    /**
     * 表record_id
     */
    private String tableRecordId;
    /**
     * 表英文名称
     */
    private String tableName;
    /**
     * 表别名
     */
    private String tableAliasName;
    /**
     * 数据源record_id
     */
    private String dataSourceGuid;
    /**
     * 是否主表
     */
    private String isMasterTable;
    /**
     * 关联类型 ： 1：inner join 内连接；2：left join 左连接；3：right join 右连接；具体查看“枚举数据字典”表
     */
    private short relationType;
    /**
     * 备注
     */
    private String remark;
}
