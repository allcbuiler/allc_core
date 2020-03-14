package com.allcb.cc.daoc.service.jtc;

import com.allcb.cc.daoc.vo.common.BizConfigReqVo;

import java.util.List;

public class ALLCAPICFGRET {

    private BizConfigReqVo bizConfigReqVo;

    private List<String> retInfoList;

    public BizConfigReqVo getBizConfigReqVo() {
        return bizConfigReqVo;
    }

    public void setBizConfigReqVo(BizConfigReqVo bizConfigReqVo) {
        this.bizConfigReqVo = bizConfigReqVo;
    }

    public List<String> getRetInfoList() {
        return retInfoList;
    }

    public void setRetInfoList(List<String> retInfoList) {
        this.retInfoList = retInfoList;
    }
}
