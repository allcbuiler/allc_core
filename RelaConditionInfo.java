package com.allcb.cc.daoc.vo.common.bizConfig;

public class RelaConditionInfo{

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public Boolean getMain() {
        return isMain;
    }

    public void setMain(Boolean main) {
        isMain = main;
    }

    public String getMainTableFieldName() {
        return mainTableFieldName;
    }

    public void setMainTableFieldName(String mainTableFieldName) {
        this.mainTableFieldName = mainTableFieldName;
    }

    public String getRelaTableFieldName() {
        return relaTableFieldName;
    }

    public void setRelaTableFieldName(String relaTableFieldName) {
        this.relaTableFieldName = relaTableFieldName;
    }

    public Integer getConditionType() {
        return conditionType;
    }

    public void setConditionType(Integer conditionType) {
        this.conditionType = conditionType;
    }

    private String recordId ;

    /**
     * 是否主记录
     * */
    private boolean isMain;

    /**
     * 主表关联条件
     * */
    private String mainTableFieldName;

    /**
     * 被关联表关联条件
     * */
    private String relaTableFieldName;

    /**
     * 关联类型 1 = ; 2 > ; 3 >= ; 4 < ; 5 <= ; 6 != ; 7 like
     * */
    private int conditionType;
}

