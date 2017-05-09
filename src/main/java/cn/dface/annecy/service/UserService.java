package cn.dface.annecy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import cn.dface.annecy.dal.UserDAO;
import cn.dface.annecy.entity.UserDo;

@Service("UserService")
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public void insertUserDo(UserDo userDo) {
        this.userDAO.insert(userDo);
    }

    public List<UserDo> findUsersByName(String name) {
        if (StringUtils.hasText(name)) {
            return this.userDAO.findUsersByName(name);
        } else {
            return this.userDAO.findUsers();
        }
    }
}
