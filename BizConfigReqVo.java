package com.allcb.cc.daoc.vo.common;

import com.allcb.cc.daoc.vo.common.bizConfig.*;

import java.util.List;

public class BizConfigReqVo {

    public String getBizRecordId() {
        return bizRecordId;
    }

    public void setBizRecordId(String bizRecordId) {
        this.bizRecordId = bizRecordId;
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
    }

    public List<SelectedColInfo> getSelectedColInfos() {
        return selectedColInfos;
    }

    public void setSelectedColInfos(List<SelectedColInfo> selectedColInfos) {
        this.selectedColInfos = selectedColInfos;
    }

    public List<MainTableInfo> getMainTableInfos() {
        return mainTableInfos;
    }

    public void setMainTableInfos(List<MainTableInfo> mainTableInfos) {
        this.mainTableInfos = mainTableInfos;
    }

    public List<WhereConditionInfo> getBizWhereConditions() {
        return bizWhereConditions;
    }

    public void setBizWhereConditions(List<WhereConditionInfo> bizWhereConditions) {
        this.bizWhereConditions = bizWhereConditions;
    }

    public List<RequestParamInfo> getReqParamInfos() {
        return reqParamInfos;
    }

    public void setReqParamInfos(List<RequestParamInfo> reqParamInfos) {
        this.reqParamInfos = reqParamInfos;
    }

    private String bizRecordId;

    private String bizName;

    private List<SelectedColInfo> selectedColInfos;

    private List<MainTableInfo> mainTableInfos;

    private List<WhereConditionInfo> bizWhereConditions;

    private List<RequestParamInfo> reqParamInfos;
}
