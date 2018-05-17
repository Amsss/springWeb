package com.bsoft.adapter.controller;


/**
 * @Author Zezhao.Zhu
 * @Description:
 * @Create: 2018/5/2 15:40
 * @Modified By：
 */
public class SingingAspect {
    /**
     * @Author:Zezhao.Zhu
     * @Description:
     * @Date:15:41 2018/5/2
     */
    public void singBefore() {
        System.out.println("before");
    }

    /**
     * @Author:Zezhao.Zhu
     * @Description:
     * @Date:15:41 2018/5/2
     */
    public void singAfter() {
        System.out.println("after");
    }

    public static void main(String[] args) {
        String date_string_1 = "2015-09-17 22:50:42";
        String date_string_2 = "2015-09-19 23:50:42";
        String date_string_3 = "2016-09-19 23:50:42";
        String date_string_4 = "2016-09-19 23:50:42";
        System.out.println(date_string_1.compareTo(date_string_2));
        System.out.println(date_string_3.compareTo(date_string_2));
        System.out.println(date_string_3.compareTo(date_string_4));
        if (date_string_1.compareTo(date_string_2) > 0) {
            System.out.println("日期1比日期2晚");
        } else {
            System.out.println("日期1比日期2早");
        }
    }
}
