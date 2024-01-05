package com.sunny.excelutil.dao;

import com.sunny.excelutil.dto.CrmOrderBookDto;
import com.sunny.excelutil.dto.CrmOrderBookExportDto;


import java.util.List;

public interface ReportMapper {
    List<CrmOrderBookExportDto> getList(CrmOrderBookDto reportDto);

}
