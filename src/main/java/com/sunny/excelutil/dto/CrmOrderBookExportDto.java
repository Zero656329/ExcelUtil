package com.sunny.excelutil.dto;

import com.alibaba.excel.annotation.ExcelProperty;

import java.math.BigDecimal;

public class CrmOrderBookExportDto{
    @ExcelProperty(value = "公司")
    private String company;
    @ExcelProperty(value = "客户代码")
    private String customerNnum;
    @ExcelProperty(value = "客户名称")
    private String customerName;
    @ExcelProperty(value = "业务人员")
    private String businessPerson;
    @ExcelProperty(value = "采购订单日期")
    private String  puorderDate;

    @ExcelProperty(value = "订单类型")
    private String orderType;
    @ExcelProperty(value = "客户订单号")
    private String customerOrdernumber;
    @ExcelProperty(value = "物料编号")
    private String materialNumber;
    @ExcelProperty(value = "物料名称")
    private String materialName;
    @ExcelProperty(value = "客户物料号")
    private String customerMaterialNumber;
    @ExcelProperty(value = "单价")
    private String costPrice;
    @ExcelProperty(value = "订单数量")
    private String orderQuantity;
    @ExcelProperty(value = "金额")
    private String amount;
    @ExcelProperty(value = "首个订单日期")
    private String firstOrderDate;
    @ExcelProperty(value = "凭证货币")
    private String certificateCurrency;
    @ExcelProperty(value = "订单序号")
    private String orderNum;
    @ExcelProperty(value = "订单交期")
    private String orderDate;
    @ExcelProperty(value = "订单数量")
    private BigDecimal orderAmount;
    @ExcelProperty(value = "计划序号")
    private String plNum;
    @ExcelProperty(value = "计划交期")
    private String plDate;


    @ExcelProperty(value = "计划数量")
    private BigDecimal planAmount;
    @ExcelProperty(value = "调整序号")
    private String adNum;
    @ExcelProperty(value = "调整交期")
    private String adDate;

    @ExcelProperty(value = "调整数量")
    private BigDecimal adjustAmount;

    @ExcelProperty(value = "出货交期")
    private String shipmentDate;
    @ExcelProperty(value = "出货数量")
    private BigDecimal shipmentAmount;
    @ExcelProperty(value = "订单残数")
    private Long orderResidue;
    @ExcelProperty(value = "交货状态")
    private String deliveryStatus;
    @ExcelProperty(value = "库存地点")
    private String stockLocation;
    @ExcelProperty(value = "订单号")
    private String orderNumber;
    @ExcelProperty(value = "订单行号")
    private String orderLineNumber;
    @ExcelProperty(value = "备注1")
    private String remark1;
    @ExcelProperty(value = "备注2")
    private String remark2;
    @ExcelProperty(value = "登记人姓名")
    private String  updater;
    @ExcelProperty(value = "登记时间")
    private String cCreate;

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getcCreate() {
        return cCreate;
    }

    public void setcCreate(String cCreate) {
        this.cCreate = cCreate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCustomerNnum() {
        return customerNnum;
    }

    public void setCustomerNnum(String customerNnum) {
        this.customerNnum = customerNnum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBusinessPerson() {
        return businessPerson;
    }

    public void setBusinessPerson(String businessPerson) {
        this.businessPerson = businessPerson;
    }

    public String getPuorderDate() {
        return puorderDate;
    }

    public void setPuorderDate(String puorderDate) {
        this.puorderDate = puorderDate;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getCustomerOrdernumber() {
        return customerOrdernumber;
    }

    public void setCustomerOrdernumber(String customerOrdernumber) {
        this.customerOrdernumber = customerOrdernumber;
    }

    public String getMaterialNumber() {
        return materialNumber;
    }

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getCustomerMaterialNumber() {
        return customerMaterialNumber;
    }

    public void setCustomerMaterialNumber(String customerMaterialNumber) {
        this.customerMaterialNumber = customerMaterialNumber;
    }

    public String getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(String costPrice) {
        this.costPrice = costPrice;
    }

    public String getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(String orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getFirstOrderDate() {
        return firstOrderDate;
    }

    public void setFirstOrderDate(String firstOrderDate) {
        this.firstOrderDate = firstOrderDate;
    }

    public String getCertificateCurrency() {
        return certificateCurrency;
    }

    public void setCertificateCurrency(String certificateCurrency) {
        this.certificateCurrency = certificateCurrency;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getPlanAmount() {
        return planAmount;
    }

    public void setPlanAmount(BigDecimal planAmount) {
        this.planAmount = planAmount;
    }

    public BigDecimal getAdjustAmount() {
        return adjustAmount;
    }

    public void setAdjustAmount(BigDecimal adjustAmount) {
        this.adjustAmount = adjustAmount;
    }

    public String getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(String shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public BigDecimal getShipmentAmount() {
        return shipmentAmount;
    }

    public void setShipmentAmount(BigDecimal shipmentAmount) {
        this.shipmentAmount = shipmentAmount;
    }

    public Long getOrderResidue() {
        return orderResidue;
    }

    public void setOrderResidue(Long orderResidue) {
        this.orderResidue = orderResidue;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getStockLocation() {
        return stockLocation;
    }

    public void setStockLocation(String stockLocation) {
        this.stockLocation = stockLocation;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderLineNumber() {
        return orderLineNumber;
    }

    public void setOrderLineNumber(String orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }


    public String getPlDate() {
        return plDate;
    }

    public void setPlDate(String plDate) {
        this.plDate = plDate;
    }

    public String getAdDate() {
        return adDate;
    }

    public void setAdDate(String adDate) {
        this.adDate = adDate;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getPlNum() {
        return plNum;
    }

    public void setPlNum(String plNum) {
        this.plNum = plNum;
    }

    public String getAdNum() {
        return adNum;
    }

    public void setAdNum(String adNum) {
        this.adNum = adNum;
    }
}
