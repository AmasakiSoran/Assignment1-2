package com.example.administrator.start;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.BmobUser;

public class User extends BmobUser {
    String id;
    String password;

    public String getName() {
        return id;
    }
    public void setName(String id) {
        this.id = id;
    }
    public String getpw() {
        return password;
    }
    public void setpw(String password) {
        this.password = password;
    }

}
