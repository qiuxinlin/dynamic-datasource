package com.qiuxinlin.dynamicdatasource.service;



import com.qiuxinlin.dynamicdatasource.entity.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List selectUsersFromDs();

    List selectUserFromDsGroup();

    void addUserToSlave1(User user);

    void addUserToSlave2(User user);
}
