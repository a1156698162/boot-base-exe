package com.xiaoruyuan.controller;

import com.xiaoruyuan.domain.Person;
import com.xiaoruyuan.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/test01")
    public String test01() {
        return "success";
    }

    @RequestMapping(value = "/queryPersonById", method = RequestMethod.GET, params = {"id"})
    public String queryPersonById(Integer id, String name, Model model) {
        Person person = personService.queryPerson(id);
        return person == null ? "person is null" : person.toString();
    }
}
