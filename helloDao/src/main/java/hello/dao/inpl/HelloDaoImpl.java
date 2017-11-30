package hello.dao.inpl;

import hello.dao.HelloDao;
import hello.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by yang on 2017/11/29.
 */

@Repository
public class HelloDaoImpl implements HelloDao{
    public User findUserByName(String name) {
        User user=new User();
        user.setUsername("22");
        user.setPassword("33");
        user.setSex("女");
        return user;
    }
}
