package cn.dface.annecy.dal;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.dface.annecy.entity.UserDo;

@Mapper
public interface UserDAO {

    List<UserDo> findUsersByName(@Param("name") String name);

    List<UserDo> findUsers();
    
    int insert(UserDo userDo);
}
