package br.com.carlossantosjr.amdocsproject.controller.dto;

import java.util.Date;

public class User1Rq {
    private String name;
    private String phone_no;
    private String email;
    private String address;
    private String password;
    private String upload_photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUpload_photo() {
        return upload_photo;
    }

    public void setUpload_photo(String upload_photo) {
        this.upload_photo = upload_photo;
    }
}
