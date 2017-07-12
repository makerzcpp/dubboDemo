package service;

import pojo.User;

import java.util.List;

/**
 * userService类
 *
 * @author solar
 * @date 2017/7/11
 */
public interface UserService {

    /**
     * 查询所有的用户
     * @return
     */
    List<User> queryAll();
}
