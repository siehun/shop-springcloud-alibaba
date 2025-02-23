package io.yue.shop.utils.psswd;

import io.yue.shop.utils.md5.MD5Hash;

public class PasswordUtils {
    public static String getPassword(String password) {
        if (password == null || password.trim().isEmpty()) {
            return password;
        }
        // 五次哈希加强度
        for (int i = 0; i < 5; i++) {
            password = MD5Hash.md5Java(password);
        }
        return password;
    }
}
