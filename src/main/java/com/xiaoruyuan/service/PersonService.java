package com.xiaoruyuan.service;

import com.xiaoruyuan.dao.PersonMapper;
import com.xiaoruyuan.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonMapper personMapper;

    public Person queryPerson(Integer id) {
        return personMapper.queryPersonById(id);
    }

}
