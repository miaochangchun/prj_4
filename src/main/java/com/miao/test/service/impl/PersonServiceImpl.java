package com.miao.test.service.impl;

import com.miao.test.entity.Person;
import com.miao.test.repository.PersonRepository;
import com.miao.test.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 10048 on 2017/9/2.
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Long savePerson() {
        Person person = new Person();
        person.setUsername("miao");
        person.setPhone("17610068133");
        person.setAddress("qingdao");
        person.setRemark("this is miaochangchun");
        return personRepository.save(person);
    }
}
