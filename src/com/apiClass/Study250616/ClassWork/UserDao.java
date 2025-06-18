package com.apiClass.Study250616.ClassWork;

public interface UserDao {
    public boolean registerUser(User newUser);

    public boolean checkUser(String username, String password, String rePassword, String birthday, String phone, String email);

    public void initData();
    public void showAllUser();
}
