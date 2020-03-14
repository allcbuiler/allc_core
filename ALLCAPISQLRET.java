package com.allcb.cc.daoc.service.jtc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ALLCAPISQLRET {

    /**
     * 错误信息集合，为空时执行过程正确
     * */
    private List<String> retInfoList;

    /**
     * 查询脚本（SQL）集合：
     *  KEY ：数据源ID
     *  VALUE ： 数据源对应的查询脚本集合
     * */
    private Map<String, ArrayList<Object>> sqlMap;

    public Map<String, ArrayList<Object>> getSqlMap() {
        return sqlMap;
    }

    public void setSqlMap(Map<String, ArrayList<Object>> sqlMap) {
        this.sqlMap = sqlMap;
    }

    public List<String> getRetInfoList() {
        return retInfoList;
    }

    public void setRetInfoList(List<String> retInfoList) {
        this.retInfoList = retInfoList;
    }

}
