package com.allcb.cc.daoc.entity.common;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.UUID;

/**
 * 公共信息
 * 包括
 *  RecordId ,
 *  RecordCreateUserId ,
 *  RecordCreateDatetime ,
 *  RecordUpdateUserId ,
 *  RecordUpdateDatetime ,
 *  ValidStatus ,
 *  DeleteStatus
 * */
public class CommonEntity {

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public Short getValidStatus() {
        return validStatus;
    }

    public void setValidStatus(Short validStatus) {
        this.validStatus = validStatus;
    }

    public Short getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Short deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * 记录ID
     * */
    private String recordId = UUID.randomUUID().toString();

    /**
     * 记录创建者用户ID
     * */
    private String createUserId ;

    /**
     * 记录创建时间
     * */
//    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createDatetime = new Date();

    /**
     * 记录修改者用户ID
     * */
    private String updateUserId ;

    /**
     * 记录修改时间
     * */
//    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updateDatetime = new Date();

    /**
     * 记录时候有效
     * 1:有效；0：无效；-1：未设置；
     * */
    private short validStatus = 1;

    /**
     * 记录是否已经删除
     * 0：未删除；1：已经删除；-1：未设置；
     * */
    private short deleteStatus = 0;
}
