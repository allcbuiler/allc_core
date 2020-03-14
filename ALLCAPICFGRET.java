package com.allcb.cc.daoc.service.jtc;

import com.allcb.cc.daoc.vo.common.BizConfigReqVo;

import java.util.List;

public class ALLCAPICFGRET {

    /**
     * 配置结果信息
     * */
    private BizConfigReqVo bizConfigReqVo;

    /**
     * 错误信息集合，为空时执行过程正确
     * */
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
