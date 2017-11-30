package hello.entity;

import hello.entity.User;

/**
 * Created by yang on 2017/11/29.
 */
public interface HelloService {
    public User findUserByName(String name);
}
