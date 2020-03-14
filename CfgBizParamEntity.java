package com.allcb.cc.daoc.entity;

import com.allcb.cc.daoc.entity.common.CommonEntity;

public class CfgBizParamEntity extends CommonEntity {

    public String getBizRecordId() {
        return bizRecordId;
    }

    public void setBizRecordId(String bizRecordId) {
        this.bizRecordId = bizRecordId;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamNameCn() {
        return paramNameCn;
    }

    public void setParamNameCn(String paramNameCn) {
        this.paramNameCn = paramNameCn;
    }

    public String getParamAlias() {
        return paramAlias;
    }

    public void setParamAlias(String paramAlias) {
        this.paramAlias = paramAlias;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**业务RECORD_ID*/
    private String bizRecordId ;

    /**参数名称*/
    private String paramName ;

    /**参数中文名称*/
    private String paramNameCn ;

    /**参数名称别名*/
    private String paramAlias ;

    /**备注*/
    private String remark ;

}