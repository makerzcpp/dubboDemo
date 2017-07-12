package service.impl;

import pojo.User;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * userService实现类
 *
 * @author solar
 * @date 2017/7/11
 */
public class UserServiceImpl implements UserService {
    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<User> queryAll() {
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 50; i++) {
            User user = new User();
            user.setAge(10 + i);
            user.setId((long) (i + 1));
            user.setPassword("123456");
            user.setUsername("username_" + i);
            list.add(user);
        }

        return list;

    }
}
