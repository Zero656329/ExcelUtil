package com.sunny.excelutil.service.impl;

import com.sunny.excelutil.dao.ReportMapper;
import com.sunny.excelutil.dto.CrmOrderBookDto;
import com.sunny.excelutil.dto.CrmOrderBookExportDto;
import com.sunny.excelutil.service.ReportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ReportServiceImpl implements ReportService {
    @Resource
    private ReportMapper reportMapper;
    @Override
    public List<CrmOrderBookExportDto> getList() {

        CrmOrderBookDto crmOrderBookDto=new CrmOrderBookDto();
        crmOrderBookDto.setCompany("1400");
        List<CrmOrderBookExportDto> list= reportMapper.getList(crmOrderBookDto);

        return list;
    }
}
