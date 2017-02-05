package com.sec21.medicalcare.com.sec21.medicalcare.bussiness.login;

import com.sec21.medicalcare.bussiness.login.LoginValidation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by D3KC4H on 01/02/2017.
 */

public class LoginValidationTest {

    private LoginValidation loginValidation;

    @Before
    public void setUp(){
        loginValidation = new LoginValidation();
    }

    @Test
    public void shouldReturnInvalidLoginForEmptyUserAndPassword(){
        String username = "";
        String password = "";
        Assert.assertEquals(false, loginValidation.validateFields(username, password));
    }

    @Test
    public void shouldReturnTrueForValidUserAndPassword(){
        String username = "dpossamai";
        String password = "1234";
        Assert.assertEquals(true, loginValidation.validateFields(username, password));
    }
}
