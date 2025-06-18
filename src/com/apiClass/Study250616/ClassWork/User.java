package com.apiClass.Study250616.ClassWork;

import java.util.Date;

public class User {
    private String userName; // 用户名
    private String password; // 密码
    private Date birthday; // 生日
    private String telNumber; // 手机号码
    private String email; // 邮箱

    public User() {
    }

    public User(String userName, String password, Date birthday,
                String telNumber, String email) {
        this.userName = userName;
        this.password = password;
        this.birthday = birthday;
        this.telNumber = telNumber;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

// 重写 hashCode 与 equal
    public int hashCode(){
        return userName.hashCode();
    }

    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        User other = (User) obj;
        if (userName == null) {
            if (other.userName != null) {
                return false;
            }
        }else if (!userName.equals(other.userName)) {
            return false;
        }
        return true;
    }


}
