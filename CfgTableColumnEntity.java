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
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 表record_id
     */
    private String tableRecordId;
    /**
     * 英文名称
     */
    private String columnName;
    /**
     * 中文名称
     */
    private String columnNameCn;
    /**
     * 字段类型 :
     *  1: 字符串 varchar;
     *  2: 数字数据 int short long DECIMAL ;
     *  3: 日期时间 DATE TIME;
     *  4: 是否判断 BOOLEAN ;
     *  5: 二进制 BLOB ;
     */
    private short columnType;
    /**
     * 字段长度
     */
    private short columnLength;
    /**
     * 小数点
     */
    private short decimalPoint;
    /**
     * 默认值
     */
    private String defaultValue;
    /**
     * 是否可空
     */
    private short isNull;
    /**
     * 自增字段
     */
    private short autoIncrement;
    /**
     * 备注
     */
    private String remark;
}