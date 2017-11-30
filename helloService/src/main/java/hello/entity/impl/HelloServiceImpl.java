package hello.entity.impl;

import hello.dao.HelloDao;

import hello.entity.HelloService;
import hello.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yang on 2017/11/29.
 */

@Service
public class HelloServiceImpl implements HelloService{
    @Autowired
    private HelloDao helloDao;

    public User findUserByName(String name) {
        return helloDao.findUserByName(name);
    }
}
