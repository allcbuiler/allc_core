package com.allcb.cc.daoc.vo.common.bizConfig;

public class WhereConditionInfo{

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public Boolean getIsMain() {
        return isMain;
    }

    public void setIsMain(Boolean main) {
        isMain = main;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Integer getConditionType() {
        return conditionType;
    }

    public void setConditionType(Integer conditionType) {
        this.conditionType = conditionType;
    }

    public String getConditionValA() {
        return conditionValA;
    }

    public void setConditionValA(String conditionValA) {
        this.conditionValA = conditionValA;
    }

    public String getConditionValB() {
        return conditionValB;
    }

    public void setConditionValB(String conditionValB) {
        this.conditionValB = conditionValB;
    }

    private String recordId;

    private Boolean isMain;

    private String tableName;

    private String fieldName;

    private int conditionType;

    private String conditionValA;

    private String conditionValB;
}