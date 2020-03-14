package com.allcb.cc.daoc.service.jtc;

import com.allcb.cc.daoc.entity.CfgTableColumnEntity;
import com.allcb.cc.daoc.entity.CfgTableEntity;
import com.allcb.cc.daoc.entity.CfgTableRelationEntity;
import com.allcb.cc.daoc.vo.common.BizConfigReqVo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ALLCAPI {

    static {
        System.loadLibrary("allcapi");
    }

    public native String getSessionId(String vrid);
	
    public native void setHttpRequestBaseUrl(String httpRequestBaseUrl);
	
    public native ALLCAPICFGRET getBizConfigByBizId(ALLCAPIIPT allcapicfg);
	
    public native Map<String, ArrayList<Object>> getBizSqlByBizId(ALLCAPIIPT allcapicfg);
	
    public native Map<String, ArrayList<Object>> getBizSqlByBizId_1(String sessionId,
                                                                  BizConfigReqVo bizConfigReqVo,
                                                                  List<CfgTableRelationEntity> tableRelationEntityList,
                                                                  List<CfgTableEntity> tableEntityList,
                                                                  List<CfgTableColumnEntity> tableColumnEntityList,
                                                                  Map<String, String> reqParamMap);


    public native String submitInsert(String sessionId, String bizId, Map<String, String> insData);


    public native String submitUpdate(String sessionId, String bizId, Map<String, String> insData);


    public native String submitDelete(String sessionId, String bizId, Map<String, String> insData);
}
