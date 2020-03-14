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

    /**
     * 根据授权码获取会话ID
     * 系统授权码
     * */
    public native String getSessionId(String vrid);
    /**
     * 设置请求域名地址
     * */
    public native void setHttpRequestBaseUrl(String httpRequestBaseUrl);
    /**
     * 根据会话ID和业务ID获取查询SQL
     * */
    public native ALLCAPICFGRET getBizConfigByBizId(ALLCAPIIPT allcapicfg);
    /**
     * 根据会话ID和业务ID获取查询SQL
     * */
    public native ALLCAPISQLRET getBizSqlByBizId(ALLCAPIIPT allcapicfg);
    /**
     * 根据会话ID和业务ID获取查询SQL
     * */
    public native Map<String, ArrayList<Object>> getBizSqlByBizId_1(String sessionId,
                                                                  BizConfigReqVo bizConfigReqVo,
                                                                  List<CfgTableRelationEntity> tableRelationEntityList,
                                                                  List<CfgTableEntity> tableEntityList,
                                                                  List<CfgTableColumnEntity> tableColumnEntityList,
                                                                  Map<String, String> reqParamMap);

    /**
     * 根据会话ID也业务ID添加数据
     * */
    public native String submitInsert(String sessionId, String bizId, Map<String, String> insData);
    /**
     * 根据会话ID也业务ID修改数据
     * */
    public native String submitUpdate(String sessionId, String bizId, Map<String, String> insData);
    /**
     * 根据会话ID也业务ID删除数据
     * */
    public native String submitDelete(String sessionId, String bizId, Map<String, String> insData);
}
