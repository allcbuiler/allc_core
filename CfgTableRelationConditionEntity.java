package com.allcb.cc.daoc.entity;

import com.allcb.cc.daoc.entity.common.CommonEntity;

public class CfgTableRelationConditionEntity extends CommonEntity {

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

    public String getMainTableRecordId() {
        return mainTableRecordId;
    }

    public void setMainTableRecordId(String mainTableRecordId) {
        this.mainTableRecordId = mainTableRecordId;
    }

    public String getRelaTableRecordId() {
        return relaTableRecordId;
    }

    public void setRelaTableRecordId(String relaTableRecordId) {
        this.relaTableRecordId = relaTableRecordId;
    }

    public String getMainFieldRecordId() {
        return mainFieldRecordId;
    }

    public void setMainFieldRecordId(String mainFieldRecordId) {
        this.mainFieldRecordId = mainFieldRecordId;
    }

    public String getRelaFieldRecordId() {
        return relaFieldRecordId;
    }

    public void setRelaFieldRecordId(String relaFieldRecordId) {
        this.relaFieldRecordId = relaFieldRecordId;
    }

    public Short getConditionType() {
        return conditionType;
    }

    public void setConditionType(Short conditionType) {
        this.conditionType = conditionType;
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    public String getConditionValueA() {
        return conditionValueA;
    }

    public void setConditionValueA(String conditionValueA) {
        this.conditionValueA = conditionValueA;
    }

    public String getConditionValueB() {
        return conditionValueB;
    }

    public void setConditionValueB(String conditionValueB) {
        this.conditionValueB = conditionValueB;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Short getStopStatus() {
        return stopStatus;
    }

    public void setStopStatus(Short stopStatus) {
        this.stopStatus = stopStatus;
    }

    /**业务record_id*/
    private String bizRecordId ;
    private String bizTableRecordId;
    /**关联主表record_id*/
    private String mainTableRecordId ;
    /**被关联表record_id*/
    private String relaTableRecordId ;
    /**关联表字段record_id*/
    private String mainFieldRecordId ;
    /**被关联表字段record_id*/
    private String relaFieldRecordId ;
    /**关联条件类型 ： 1：=；2：>；3：>=；4：<；5：<=；6：like；具体查看“枚举数据字典”表*/
    private short conditionType ;
    /**关联类型：1 JOIN ； 2 WHERE；*/
    private String relationType ;
    /**条件固定值A*/
    private String conditionValueA ;
    /**条件固定值B（第二个值），当between时使用。*/
    private String conditionValueB ;
    /**备注*/
    private String remark ;
    /**是否停用*/
    private short stopStatus ;
}
