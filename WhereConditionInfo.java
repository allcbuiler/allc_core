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

    /**
     * 是否主记录
     * */
    private Boolean isMain;

    /**
     * 表名称
     * */
    private String tableName;

    private String fieldName;

    /**
     * 关联类型 1 = ; 2 > ; 3 >= ; 4 < ; 5 <= ; 6 != ; 7 like
     * */
    private int conditionType;

    private String conditionValA;

    private String conditionValB;
}