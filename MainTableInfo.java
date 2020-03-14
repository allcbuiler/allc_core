package com.allcb.cc.daoc.vo.common.bizConfig;

import java.util.ArrayList;

public class MainTableInfo {

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getBizTableRecordId() {
        return bizTableRecordId;
    }

    public void setBizTableRecordId(String bizTableRecordId) {
        this.bizTableRecordId = bizTableRecordId;
    }

    public Boolean getIsMain() {
        return isMain;
    }

    public void setIsMain(Boolean main) {
        isMain = main;
    }

    public String getMainTable() {
        return mainTable;
    }

    public void setMainTable(String mainTable) {
        this.mainTable = mainTable;
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

    public ArrayList<RelaTableInfo> getRelaInfo() {
        return relaInfo;
    }

    public void setRelaInfo(ArrayList<RelaTableInfo> relaInfo) {
        this.relaInfo = relaInfo;
    }

    private String recordId ;

    private String bizTableRecordId;

    private boolean isMain;

    private String mainTable ;

    private String alias ;

    private String dsRecordId ;

    private ArrayList<RelaTableInfo> relaInfo;
}
