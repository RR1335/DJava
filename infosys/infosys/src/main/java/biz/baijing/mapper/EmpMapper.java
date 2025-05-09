package biz.baijing.mapper;

import biz.baijing.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {

    // $ and # , # 预编译
    @Delete("delete from emp where id = #{id}")
    public int delete(Integer id);


    // 获取返回的主键值
    @Options(useGeneratedKeys = true,keyProperty = "id")
    // insert into 插入数据的 emp是数据库的命名（下划线命名）；values 是（Emp emp）变量的 Bean 类的命名（小驼峰命名）
    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) " +
            "values (#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
    public int insert(Emp emp);


    @Update("update emp set username=#{username},name=#{name},gender=#{gender},image=#{image}, " +
            "job=#{job},entrydate=#{entrydate},dept_id=#{deptId},update_time=#{updateTime} where id = #{id}")
    public void update(Emp emp);


    @Results({
            @Result(column  = "dept_id",property = "deptId"),
            @Result(column = "create_time" , property = "createTime"),
            @Result(column = "update_time",property = "updateTime")
    })
    @Select("select username,name,gender,job,entrydate,dept_id,update_time from emp where id=#{id}")
    public Emp getEmpById(Integer id);


//    @Select("select * from emp where id=#{id}")
//    @Select("select id, username, password, name, gender, image, job, entrydate, dept_id, create_time, update_time from emp where id=#{id}")
    @Select("select id, username, password, name, gender, image, job, entrydate, dept_id deptId, create_time createTime, update_time updateTime from emp where id=#{id}")
    public Emp getEmpById01(Integer id);

    // Mybatis 驼峰命名的开关 , properties 文件中配置 mybatis.configuration.map-underscore-to-camel-case=true
    @Select("select * from emp where id=#{id}")
    public Emp select(Integer id);


    // '%#{name}%'  变成 $
    @Select("select id, username, password, name, gender, image, job, entrydate, dept_id, create_time, update_time" +
            " from emp where name like '%${name}%' and gender = #{gender} and entrydate between #{begin} and #{end} order by update_time desc")
    public List<Emp> selectAll(String name, Short gender, LocalDate begin, LocalDate end);

}
