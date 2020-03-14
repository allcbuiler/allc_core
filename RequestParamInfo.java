package com.allcb.cc.daoc.vo.common.bizConfig;

public class RequestParamInfo {

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

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    private String requestType;

    private String paramName ;

    private String paramNameCn ;

    private String paramAlias ;
}
