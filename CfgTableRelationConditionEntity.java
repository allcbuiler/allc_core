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

    private String bizRecordId ;
    private String bizTableRecordId;
    private String mainTableRecordId ;
    private String relaTableRecordId ;
    private String mainFieldRecordId ;
    private String relaFieldRecordId ;
    private Short conditionType ;
    private String relationType ;
    private String conditionValueA ;
    private String conditionValueB ;
    private String remark ;
    private Short stopStatus ;
}
