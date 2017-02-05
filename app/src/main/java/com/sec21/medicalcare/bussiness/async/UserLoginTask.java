package com.sec21.medicalcare.bussiness.async;

import android.os.AsyncTask;

/**
 * Created by D3KC4H on 01/02/2017.
 */


/**
 * Represents an asynchronous login/registration task used to authenticate
 * the user.
 */
public class UserLoginTask extends AsyncTask<Void, Void, Boolean> {

    /**
     * A dummy authentication store containing known user names and passwords.
     * TODO: remove after connecting to a real authentication system.
     */
    private static final String[] DUMMY_CREDENTIALS = new String[]{
            "dp21@google.com:12345", "bar@example.com:world"
    };
    private final String mEmail;
    private final String mPassword;
    private LoginResponseListener loginListener;

    public UserLoginTask(String email, String password, LoginResponseListener loginListener) {
        mEmail = email;
        mPassword = password;
        this.loginListener = loginListener;
    }

    @Override
    protected Boolean doInBackground(Void... params) {
        // TODO: attempt authentication against a network service.

        try {
            // Simulate network access.
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            return false;
        }

        for (String credential : DUMMY_CREDENTIALS) {
            String[] pieces = credential.split(":");
            if (pieces[0].equals(mEmail)) {
                // Account exists, return true if the password matches.
                return pieces[1].equals(mPassword);
            }
        }

        // TODO: register the new account here.
        return true;
    }

    @Override
    protected void onPostExecute(final Boolean success) {
        loginListener.onLoginComplete(success);
        cancel(false);
        //mAuthTask = null;
    }

    @Override
    protected void onCancelled() {
        loginListener.onCancel();
    }
}
