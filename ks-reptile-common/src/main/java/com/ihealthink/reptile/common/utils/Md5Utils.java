package com.ihealthink.reptile.common.utils;

import java.security.MessageDigest;

/**
 * @author Rocket
 * @version 1.0
 * @description: TODO
 * @date Created in 9:20 2021/3/17
 */
public class Md5Utils {

    /***
     * MD5加码 生成32位md5码
     */
    public static String getMd5String(String inStr) {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
        char[] charArray = inStr.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            byteArray[i] = (byte) charArray[i];
        }
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();

    }

    /**
     * 加密解密算法 执行一次加密，两次解密
     */
    public static String convertMD5(String inStr) {

        char[] a = inStr.toCharArray();
        for (int i = 0; i < a.length; i++) {
            a[i] = (char) (a[i] ^ 't');
        }
        String s = new String(a);
        return s;

    }

    /**
     * 判断输入的密码和数据库中保存的MD5密码是否一致
     *
     * @param inputPassword 输入的密码
     * @param md5DB         数据库保存的密码
     * @return
     */
    public static boolean passwordIsTrue(String inputPassword, String md5DB) {

        String md5 = getMd5String(inputPassword);
        return md5DB.equals(md5);
    }


//    // 测试主函数
//    public static void main(String args[]) {
//        String s = new String("123456");
//        System.out.println("原始：" + s);
//        System.out.println("MD5后：" + getMd5String(s));
//        System.out.println("密码是否一致：" + passwordIsTrue("123456", "e10adc3949ba59abbe56e057f20f883e"));
//
//    }

}
