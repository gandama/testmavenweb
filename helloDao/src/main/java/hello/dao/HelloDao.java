package hello.dao;

import hello.entity.User;

/**
 * Created by yang on 2017/11/29.
 */
public interface HelloDao {
    public User findUserByName(String name);
}
