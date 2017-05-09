package cn.dface.annecy.service;

import java.util.List;

import cn.dface.annecy.entity.UserDo;

public interface UserService {

    void insertUserDo(UserDo userDo);

    List<UserDo> findUsersByName(String name);
}
