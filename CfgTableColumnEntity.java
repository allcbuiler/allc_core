package com.allcb.cc.daoc.entity;

import com.allcb.cc.daoc.entity.common.CommonEntity;

public class CfgTableColumnEntity extends CommonEntity {
    public String getTableRecordId() {
        return tableRecordId;
    }

    public void setTableRecordId(String tableRecordId) {
        this.tableRecordId = tableRecordId;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnNameCn() {
        return columnNameCn;
    }

    public void setColumnNameCn(String columnNameCn) {
        this.columnNameCn = columnNameCn;
    }

    public Short getColumnType() {
        return columnType;
    }

    public void setColumnType(Short columnType) {
        this.columnType = columnType;
    }

    public Short getColumnLength() {
        return columnLength;
    }

    public void setColumnLength(Short columnLength) {
        this.columnLength = columnLength;
    }

    public Short getDecimalPoint() {
        return decimalPoint;
    }

    public void setDecimalPoint(Short decimalPoint) {
        this.decimalPoint = decimalPoint;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Short getIsNull() {
        return isNull;
    }

    public void setIsNull(Short isNull) {
        this.isNull = isNull;
    }

    public Short getAutoIncrement() {
        return autoIncrement;
    }

    public void setAutoIncrement(Short autoIncrement) {
        this.autoIncrement = autoIncrement;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    /**
     * 
     */
    private String tableRecordId;
    /**
     * 
     */
    private String columnName;
    /**
     * 
     */
    private String columnNameCn;
    /**
     * 
     */
    private Short columnType;
    /**
     * 
     */
    private Short columnLength;
    /**
     * 
     */
    private Short decimalPoint;
    /**
     * 
     */
    private String defaultValue;
    /**
     * 
     */
    private Short isNull;
    /**
     * 
     */
    private Short autoIncrement;
    /**
     * 
     */
    private String Remark;
}