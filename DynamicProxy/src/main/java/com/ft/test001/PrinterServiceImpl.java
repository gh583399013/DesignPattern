package com.ft.test001;

/**
 * @author mask
 * @date 2018/7/11 11:36
 * @desc
 */
public class PrinterServiceImpl implements PrinterService {
    public String print(String[] text) {
        StringBuilder sb = new StringBuilder(200);
        sb.append("开始打印:");
        for (String s : text) {
            sb.append(s + "|");
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
