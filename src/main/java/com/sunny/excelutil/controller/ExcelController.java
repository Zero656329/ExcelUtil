package com.sunny.excelutil.controller;

import com.alibaba.excel.EasyExcel;
import com.sunny.excelutil.conf.ExcelListener;
import com.sunny.excelutil.dto.CrmOrderBookExportDto;
import com.sunny.excelutil.dto.CrmOrderBookExtDto;
import com.sunny.excelutil.service.ReportService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.List;

@RequestMapping("/code")
@Controller
public class ExcelController {
    @Resource
    private ReportService reportService;

    @PostMapping("/exportExcel")
    public Object generator(HttpServletRequest request, HttpServletResponse response ) throws Exception {

        try {
            String filenames = "111111.xlsx";
            String userAgent = request.getHeader("User-Agent");
            if (userAgent.contains("MSIE") || userAgent.contains("Trident")) {
                filenames = URLEncoder.encode(filenames, "UTF-8");
            } else {
                filenames = new String(filenames.getBytes("UTF-8"), "ISO-8859-1");
            }
            List<CrmOrderBookExportDto> testList= reportService.getList();




            response.setContentType("application/vnd.ms-excel;charset=UTF-8");
            response.setCharacterEncoding("utf-8");
            response.setHeader("Content-Disposition", "attachment;filename=" + filenames);
            EasyExcel.write(response.getOutputStream(), CrmOrderBookExportDto.class).sheet("sheet").doWrite(testList);
        } catch (Exception e) {
        }
        return null;
    }
    @PostMapping("/importExcel")
    public Object importExcel(MultipartFile file, HttpServletRequest request, HttpServletResponse response) throws Exception {

        try {

            List<CrmOrderBookExtDto> list = EasyExcel.read(file.getInputStream(),CrmOrderBookExtDto.class,new ExcelListener()).sheet().doReadSync();
            list.forEach(e-> System.out.println(e.getCindex()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}
