package com.allcb.cc.daoc.entity.common;

import java.util.Date;
import java.util.UUID;

/**
 * 
 * 
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
     * 
     * */
    private String recordId = UUID.randomUUID().toString();

//    public String getRecordId(){
//        if (this.recordId == null || this.recordId == ""){
//            this.recordId = UUID.randomUUID().toString();
//            return this.recordId;
//        }
//
//        return this.recordId;
//    }
//
//    public void setRecordId(String recordId){
//        this.recordId = recordId;
//    }

    /**
     * 
     * */
    private String createUserId ;

    /**
     * 
     * */
    private Date createDatetime = new Date();

    /**
     * 
     * */
    private String updateUserId ;

    /**
     * 
     * */
    private Date updateDatetime = new Date();

    private Short validStatus = 1;

    private Short deleteStatus = 0;
}
