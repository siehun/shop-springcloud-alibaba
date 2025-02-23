package io.yue.shop.utils.md5;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Hash {
    public static String md5Java(String message) {
        // 存储要返回的值
        String digest = null;
        try {
            // 获取md5示例
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 把字符串转为utf-8编码的字符数组后，使用md5计算哈希值，返回16字节的数组
            byte[] hash = md.digest(message.getBytes("UTF-8"));
            // 16字节，转换为16进制字符串是32个字符
            StringBuilder sb = new StringBuilder(2 * hash.length);
            for (byte b : hash) {
                // b & 0xff主要是为了转为无符号整数(int类型),
                sb.append(String.format("%02x", b & 0xff));
            }
            digest = sb.toString();
        } catch (UnsupportedEncodingException ex) {

        } catch (NoSuchAlgorithmException ex) {

        }
        return digest;
    }
}
