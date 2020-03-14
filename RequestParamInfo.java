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

    /**请求参数类型 ： G 查询参数； I 插入参数； U 更新参数； D 删除参数 */
    private String requestType;

    /**参数名称*/
    private String paramName ;

    /**参数中文名称*/
    private String paramNameCn ;

    /**参数名称别名*/
    private String paramAlias ;
}
