package com.sunny.excelutil.util;


import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;


public class CommonUtil {


    /**
     * 火狐浏览器中文文件名修复
     *
     * @param fileName
     * @return
     */
    public static String base64EncodeFileName(String fileName) {
        try {
            return "=?UTF-8?B?"
                    + Base64.encodeBase64String(fileName
                    .getBytes("UTF-8")) + "?=";
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    /**
     * 获取32位uuid
     *
     * @return String
     */




}
