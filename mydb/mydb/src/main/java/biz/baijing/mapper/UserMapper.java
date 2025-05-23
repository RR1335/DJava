package biz.baijing.mapper;

import biz.baijing.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select id from user")
    public List<User> listUser();

}
