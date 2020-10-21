package edu.uw.tcss450.uiandnavigationlab.model;

import androidx.lifecycle.ViewModel;

public class UserInfoViewModel extends ViewModel {


    private String mEmail;

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        this.mEmail = email;
    }
}