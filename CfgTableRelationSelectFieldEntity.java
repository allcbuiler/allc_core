package com.allcb.cc.daoc.entity;

import com.allcb.cc.daoc.entity.common.CommonEntity;

public class CfgTableRelationSelectFieldEntity extends CommonEntity {
    public String getBizRecordId() {
        return bizRecordId;
    }

    public void setBizRecordId(String bizRecordId) {
        this.bizRecordId = bizRecordId;
    }

    public String getTableRecordId() {
        return tableRecordId;
    }

    public void setTableRecordId(String tableRecordId) {
        this.tableRecordId = tableRecordId;
    }

    public String getTableFieldRecordId() {
        return tableFieldRecordId;
    }

    public void setTableFieldRecordId(String tableFieldRecordId) {
        this.tableFieldRecordId = tableFieldRecordId;
    }

    public String getTableFieldAlias() {
        return tableFieldAlias;
    }

    public void setTableFieldAlias(String tableFieldAlias) {
        this.tableFieldAlias = tableFieldAlias;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**业务RECORD_ID*/
    private String bizRecordId ;
    /**表record_id*/
    private String tableRecordId ;
    /**字段record_id*/
    private String tableFieldRecordId ;
    /**字段别名*/
    private String tableFieldAlias ;
    /**备注*/
    private String remark ;
}
