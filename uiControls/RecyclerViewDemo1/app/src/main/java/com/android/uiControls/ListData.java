package com.android.uiControls;

public class ListData {

    private String name;
    private String mContactNum;

    public ListData(String name, String contact) {
        this.name = name;
        this.mContactNum = contact;
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

    public void setmContactNum(String mContactNum) {
        this.mContactNum = mContactNum;
    }
}
