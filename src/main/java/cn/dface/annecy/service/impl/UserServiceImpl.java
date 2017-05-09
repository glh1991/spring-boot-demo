package cn.dface.annecy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import cn.dface.annecy.dal.UserDAO;
import cn.dface.annecy.entity.UserDo;
import cn.dface.annecy.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void insertUserDo(UserDo userDo) {
        this.userDAO.insert(userDo);
    }

    @Override
    public List<UserDo> findUsersByName(String name) {
        if (StringUtils.hasText(name)) {
            return this.userDAO.findUsersByName(name);
        } else {
            return this.userDAO.findUsers();
        }
    }
}
