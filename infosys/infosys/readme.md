# Mybatis封装

类属姓名 和 数据库的命名不一致，则无法自动封装。

# 条件查询的 # or $ 选择

参看 like '%张%'
==>  Preparing: select id, username, password, name, gender, image, job, entrydate, dept_id, create_time, update_time from emp where name like '%张%' and gender = ? and entrydate between ? and ? order by update_time desc

```java
    @Select("select id, username, password, name, gender, image, job, entrydate, dept_id, create_time, update_time" +
            " from emp where name like '%${name}%' and gender = #{gender} and entrydate between #{begin} and #{end} order by update_time desc")
    public List<Emp> selectAll(String name, Short gender, LocalDate begin, LocalDate end);
```
#{value} 是不能出现在 '' 中的；需要替换成 ${value} 。
结果就是 value 直接出现在 SQL 语句中参与了“拼接”。
