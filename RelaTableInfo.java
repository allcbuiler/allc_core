package com.allcb.cc.daoc.vo.common.bizConfig;


import java.util.ArrayList;

public class RelaTableInfo{

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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDsRecordId() {
        return dsRecordId;
    }

    public void setDsRecordId(String dsRecordId) {
        this.dsRecordId = dsRecordId;
    }

    public Integer getRelaType() {
        return relaType;
    }

    public void setRelaType(Integer relaType) {
        this.relaType = relaType;
    }

    public ArrayList<RelaConditionInfo> getRelaConditions() {
        return relaConditions;
    }

    public void setRelaConditions(ArrayList<RelaConditionInfo> relaConditions) {
        this.relaConditions = relaConditions;
    }

    public ArrayList<WhereConditionInfo> getWhereConditions() {
        return whereConditions;
    }

    public void setWhereConditions(ArrayList<WhereConditionInfo> whereConditions) {
        this.whereConditions = whereConditions;
    }

    private String recordId ;

    private boolean isMain;

    private String tableName;

    private String alias ;

    private String dsRecordId ;

    private int relaType ;

    private ArrayList<RelaConditionInfo> relaConditions;

    private ArrayList<WhereConditionInfo> whereConditions;
}
