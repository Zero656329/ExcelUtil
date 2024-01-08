package com.sunny.excelutil.dto;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class CrmOrderBookExtDto {
    private String customerOrdernumber;

    private String materialNumber;

    private String orderDate;

    private BigDecimal orderAmount;
    private String cindex;

}
