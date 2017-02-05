package com.sec21.medicalcare.bussiness.login;

import android.text.TextUtils;

import java.util.regex.Pattern;

/**
 * Created by D3KC4H on 01/02/2017.
 */

public class LoginValidation {


    public static boolean validateFields(String username, String password) {
        if(!TextUtils.isEmpty(username) && !TextUtils.isEmpty(password)){
            return true;
        }
        return false;
    }

    public static boolean isUsernameValid(String username){
        return username.length() > 7 && username.length() < 20 && !TextUtils.isEmpty(username);
    }

    public static boolean isPasswordValid(String password){
        return password.length() > 7 && password.length() < 20 && !TextUtils.isEmpty(password);
    }
}
