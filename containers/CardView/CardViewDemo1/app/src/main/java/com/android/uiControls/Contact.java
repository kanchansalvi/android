package com.android.uiControls;

public class Contact {

    private String name;
    private String mContactNum;

    public Contact(String name, String contactNum) {
        this.name = name;
        this.mContactNum = contactNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getmContactNum() {
        return mContactNum;
    }

    public void setmContactNum(String contactNum) {
        this.mContactNum = contactNum;
    }
}
