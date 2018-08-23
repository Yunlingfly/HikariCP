package cn.yunlingfly.hikaricp.mapper;

import cn.yunlingfly.hikaricp.bean.Person;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IPersonMapper {
    @Select("SELECT id, username FROM personinfo WHERE id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "username", column = "username")
    })
    Person findById(@Param(value = "id") String id);

    @Select("SELECT * FROM personinfo")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "username", column = "username")
    })
    List<Person> getAll();

    @Insert("INSERT INTO personinfo(id,username) VALUES(#{id}, #{username})")
    void insert(Person user);

    @Update("UPDATE personinfo SET username=#{username} WHERE id =#{id}")
    void update(Person user);

    @Delete("DELETE FROM personinfo WHERE id =#{id}")
    void delete(Integer id);

}
