package cn.yunlingfly.hikaricp.service.impl;

import cn.yunlingfly.hikaricp.bean.Person;
import cn.yunlingfly.hikaricp.mapper.IPersonMapper;
import cn.yunlingfly.hikaricp.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {
    @Autowired
    IPersonMapper iPersonMapper;

    @Override
    public List<Person> listAll() {
        return iPersonMapper.getAll();
    }

    // 使用@Transactional开启事务，出错抛出RuntimeException
    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public void insertOne(Person p) throws RuntimeException {
        iPersonMapper.insert(p);
    }
}
