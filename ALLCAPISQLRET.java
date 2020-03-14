package com.allcb.cc.daoc.service.jtc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ALLCAPISQLRET {

    private List<String> retInfoList;

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
