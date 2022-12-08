package com.example.grpcclient.domo.model;

public class IdentityModel {
    int identityNumber ;//身份证号
    String name ;


    public int getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(int identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
