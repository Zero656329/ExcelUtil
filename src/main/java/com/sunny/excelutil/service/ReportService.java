package com.sunny.excelutil.service;

import com.sunny.excelutil.dto.CrmOrderBookDto;
import com.sunny.excelutil.dto.CrmOrderBookExportDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReportService {
    List<CrmOrderBookExportDto> getList();
}
