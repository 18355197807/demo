package com.example.demo.test.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(description  = "测试模型实体")
public class DemoPo implements Serializable {
	
	@ApiModelProperty(value = "主键", required = true)
    private String uuid;

	@ApiModelProperty(value = "姓名", required = true)
    private String name;

	@ApiModelProperty(value = "年纪", required = true)
    private Integer age;

	@ApiModelProperty(value = "爱好", required = true)
    private String hobby;

	@ApiModelProperty(value = "地址", required = true)
    private String address;

	@ApiModelProperty(value = "电话", required = true)
    private String phone;

	@ApiModelProperty(value = "创建时间", required = true)
    private String createtime;

	@ApiModelProperty(value = "编辑时间", required = true)
    private String editetime;

	@ApiModelProperty(value = "0否，1是", required = true)
    private String rookieStatus;

	@ApiModelProperty(value = "微信小程序用户唯一标识", required = true)
    private String openid;

    private static final long serialVersionUID = 1L;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getEditetime() {
        return editetime;
    }

    public void setEditetime(String editetime) {
        this.editetime = editetime;
    }

    public String getRookieStatus() {
        return rookieStatus;
    }

    public void setRookieStatus(String rookieStatus) {
        this.rookieStatus = rookieStatus;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}