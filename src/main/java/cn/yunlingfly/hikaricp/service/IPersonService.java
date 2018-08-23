package cn.yunlingfly.hikaricp.service;

import cn.yunlingfly.hikaricp.bean.Person;

import java.util.List;

public interface IPersonService {
    List<Person> listAll();
    void insertOne(Person p);
}
