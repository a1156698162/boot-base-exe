package com.xiaoruyuan.dao;

import com.xiaoruyuan.domain.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface PersonMapper {
    /**
     * i 查询所有
     *
     * @return
     */
    List<Person> queryAllPerson();


    /**
     * i 查询单个
     *
     * @param id
     * @return
     */
    Person queryPersonById(Integer id);


    /**
     * i 增加
     *
     * @param person
     * @return
     */
    Integer addPerson(Person person);


    /**
     * i 删除
     *
     * @param id
     * @return
     */
    Integer deletePersonById(Integer id);


    /**
     * i 修改
     *
     * @param person
     * @return
     */
    Integer modifyPerson(Person person);
}
