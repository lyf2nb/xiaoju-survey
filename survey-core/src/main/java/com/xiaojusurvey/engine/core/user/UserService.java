package com.xiaojusurvey.engine.core.user;

import com.xiaojusurvey.engine.common.entity.user.User;

import java.util.List;

public interface UserService {

    List<User> findAllUser();

    User findUserByUsernameAndPassword(String username, String password);

    User findUserByUsername(String username);
}
