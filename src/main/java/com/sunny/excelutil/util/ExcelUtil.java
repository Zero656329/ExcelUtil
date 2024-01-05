package com.sunny.excelutil.util;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.metadata.WriteSheet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import static org.springframework.util.StreamUtils.BUFFER_SIZE;

public class ExcelUtil
{
    public static <T> void exportExcel(HttpServletRequest httpServletRequest, HttpServletResponse response, List targets, Map<String, String> map, String sheetName, String fileName, Class<T> clazz) throws Exception {

        //生成excel文件
        setResponse(httpServletRequest, response, fileName);
        targets = Optional.ofNullable(targets).orElseGet(ArrayList::new);
        ExcelWriterBuilder builder = EasyExcel.write(response.getOutputStream(), clazz);
        ExcelWriter excelWriter = builder.build();
        WriteSheet writeSheet = null;
        writeSheet = EasyExcel.writerSheet(0, sheetName).build();
        excelWriter.write(targets, writeSheet);
        excelWriter.finish();
    }
    public static void setResponse(HttpServletRequest httpServletRequest, HttpServletResponse response, String fileName) throws Exception {
        if (httpServletRequest.getHeader("USER-AGENT").toLowerCase().contains("firefox")) {
            // 火狐浏览器
            fileName = CommonUtil.base64EncodeFileName(fileName);
        } else {
            // IE，其他浏览器
            fileName = URLEncoder.encode(fileName, "UTF-8");
        }
        response.setContentType("application/vnd.ms-excel;charset=UTF-8");
        response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
    }
















    /**
     * 传入文件file
     * @param outputStream
     * @param fileList
     */
    public static void downloadZipForFiles(OutputStream outputStream, List<File> fileList){

        ZipOutputStream zipOutputStream = null;
        try {
            zipOutputStream = new ZipOutputStream(outputStream);
            for (File file : fileList) {
                ZipEntry zipEntry = new ZipEntry(file.getName());
                zipOutputStream.putNextEntry(zipEntry);
                byte[] buf = new byte[BUFFER_SIZE];
                int len;
                FileInputStream in = new FileInputStream(file);
                while ((len = in.read(buf)) != -1) {
                    zipOutputStream.write(buf, 0, len);
                    zipOutputStream.flush();
                }
            }
            zipOutputStream.flush();
            zipOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            try {
                if (zipOutputStream != null ) {
                    zipOutputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * 传入文件的 byte[]
     * Map<String,byte[]> fileBufMap key是文件名（包含后缀），value是文件的byte[]
     * @param outputStream
     * @param fileBufMap
     */
    public static void downloadZipForByteMore(OutputStream outputStream,Map<String,byte[]> fileBufMap)  {

        ZipOutputStream zipOutputStream = null;
        try {
            zipOutputStream = new ZipOutputStream(outputStream);
            for (String fileName:fileBufMap.keySet()){
                ZipEntry zipEntry = new ZipEntry(fileName);
                zipOutputStream.putNextEntry(zipEntry);
                if (Objects.nonNull(fileBufMap.get(fileName))){
                    byte[] fileBytes = fileBufMap.get(fileName);
                    zipOutputStream.write(fileBytes);
                    zipOutputStream.flush();
                }
            }
            zipOutputStream.flush();
            zipOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            // 关闭流
            try {
                if (zipOutputStream != null ) {
                    zipOutputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 返回zip包的 byte[]
     *
     * @param fileBufMap
     * @return
     */

    public static byte[] getZipForByteMore(Map<String,byte[]> fileBufMap)  {
        ByteArrayOutputStream totalZipBytes = null;
        ZipOutputStream zipOutputStream = null;
        try {
            totalZipBytes = new ByteArrayOutputStream();
            zipOutputStream = new ZipOutputStream(totalZipBytes);
            for (String fileName:fileBufMap.keySet()){
                ZipEntry zipEntry = new ZipEntry(fileName);
                zipOutputStream.putNextEntry(zipEntry);
                if (Objects.nonNull(fileBufMap.get(fileName))){
                    byte[] fileBytes = fileBufMap.get(fileName);
                    zipOutputStream.write(fileBytes);
                    zipOutputStream.flush();
                }
            }
            zipOutputStream.close();
            byte[] bytes = totalZipBytes.toByteArray();
            totalZipBytes.close();// 关闭流
            return bytes;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            try {
                if (totalZipBytes != null) {
                    totalZipBytes.close();
                }
                if (zipOutputStream != null) {
                    zipOutputStream.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }







}
