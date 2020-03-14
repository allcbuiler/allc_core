package com.allcb.cc.daoc.service.jtc;

import com.allcb.cc.daoc.entity.*;
import com.allcb.cc.daoc.vo.common.BizConfigReqVo;

import java.util.List;
import java.util.Map;

public class ALLCAPIIPT {

    /**
     * 调试级别：
     *  0000 ： 不调试
     *  0001 ： 显示一般信息
     *  0010 ： 显示警告信息
     *  0100 ： 显示错误信息
     * */
    private String debuggerLevel = "0111";
    /**
     * 业务配置ID
     * */
    private String bizRid;
    /**
     * 会话ID
     * */
    private String sessionId;
    /**
     * 表关联的信息
     * */
    private List<CfgTableRelationEntity> tableRelationEntityList;
    /**
     * 表关联的条件信息
     * */
    private List<CfgTableRelationConditionEntity> tableRelationConditionEntityList;
    /**
     * 显示结果的数据列信息
     * */
    private List<CfgTableRelationSelectFieldEntity> tableRelationSelectFieldEntityList;
    /**
     * 数据表信息
     * */
    private List<CfgTableEntity> tableEntityList;
    /**
     * 数据表列信息
     * */
    private List<CfgTableColumnEntity> tableColumnEntityList;
    /**
     * 业务配置的参数列表
     * */
    private List<CfgBizParamEntity> bizParamEntityList;
    /**
     * 请求参数列表
     * */
    private Map<String, String> reqParamMap;

    public String getDebuggerLevel() {
        return debuggerLevel;
    }

    public void setDebuggerLevel(String debuggerLevel) {
        this.debuggerLevel = debuggerLevel;
    }

    public String getBizRid() {
        return bizRid;
    }

    public void setBizRid(String bizRid) {
        this.bizRid = bizRid;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public List<CfgTableRelationEntity> getTableRelationEntityList() {
        return tableRelationEntityList;
    }

    public void setTableRelationEntityList(List<CfgTableRelationEntity> tableRelationEntityList) {
        this.tableRelationEntityList = tableRelationEntityList;
    }

    public List<CfgTableRelationConditionEntity> getTableRelationConditionEntityList() {
        return tableRelationConditionEntityList;
    }

    public void setTableRelationConditionEntityList(List<CfgTableRelationConditionEntity> tableRelationConditionEntityList) {
        this.tableRelationConditionEntityList = tableRelationConditionEntityList;
    }

    public List<CfgTableRelationSelectFieldEntity> getTableRelationSelectFieldEntityList() {
        return tableRelationSelectFieldEntityList;
    }

    public void setTableRelationSelectFieldEntityList(List<CfgTableRelationSelectFieldEntity> tableRelationSelectFieldEntityList) {
        this.tableRelationSelectFieldEntityList = tableRelationSelectFieldEntityList;
    }

    public List<CfgBizParamEntity> getBizParamEntityList() {
        return bizParamEntityList;
    }

    public void setBizParamEntityList(List<CfgBizParamEntity> bizParamEntityList) {
        this.bizParamEntityList = bizParamEntityList;
    }

    public List<CfgTableEntity> getTableEntityList() {
        return tableEntityList;
    }

    public void setTableEntityList(List<CfgTableEntity> tableEntityList) {
        this.tableEntityList = tableEntityList;
    }

    public List<CfgTableColumnEntity> getTableColumnEntityList() {
        return tableColumnEntityList;
    }

    public void setTableColumnEntityList(List<CfgTableColumnEntity> tableColumnEntityList) {
        this.tableColumnEntityList = tableColumnEntityList;
    }

    public Map<String, String> getReqParamMap() {
        return reqParamMap;
    }

    public void setReqParamMap(Map<String, String> reqParamMap) {
        this.reqParamMap = reqParamMap;
    }
}
