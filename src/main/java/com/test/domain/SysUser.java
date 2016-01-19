package com.test.domain;

import java.io.Serializable;

public class SysUser implements Serializable {
    private Integer id;

    private String username;

    private String userpass;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    private SysUser(Builder b) {
        id = b.id;
        username = b.username;
        userpass = b.userpass;
    }

    public SysUser() {
        super();
    }

    public static class Builder {
        private Integer id;

        private String username;

        private String userpass;

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder userpass(String userpass) {
            this.userpass = userpass;
            return this;
        }

        public SysUser build() {
            return new SysUser(this);
        }
    }
}