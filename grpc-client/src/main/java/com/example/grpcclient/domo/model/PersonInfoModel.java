package com.example.grpcclient.domo.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;


public class PersonInfoModel {
    @ApiModelProperty(value = "id",required = true,example = "1")
    int id;
    @ApiModelProperty(value = "学校",example = "一中")
    String school;
    @ApiModelProperty(value = "是否是男生",example = "false")
    boolean isBoy  ;
    @ApiModelProperty(value = "身份信息")
    List<IdentityModel> personalInfos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public boolean isBoy() {
        return isBoy;
    }

    public void setBoy(boolean boy) {
        isBoy = boy;
    }

    public List<IdentityModel> getPersonalInfos() {
        return personalInfos;
    }

    public void setPersonalInfos(List<IdentityModel> personalInfos) {
        this.personalInfos = personalInfos;
    }
}