package com.sec21.medicalcare.bussiness.async;

/**
 * Created by D3KC4H on 04/02/2017.
 */

public interface LoginResponseListener {

    void onLoginComplete(boolean result);

    void onCancel();
}
