package biz.baijing.mapper;

import biz.baijing.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

// 运行时，自动生成接口的实现类对象（代理对象）
// 将对象交给IOC容器管理
@Mapper
public interface UserMapper {

    // 查询「全部」用户信息
    @Select("select * from user")
    public List<User> listUser();
}
