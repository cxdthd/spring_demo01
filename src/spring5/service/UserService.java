package spring5.service;

import spring5.dao.UserDao;

/**
 * @author YANG
 * @create 2021-07-24 9:31
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add.....");
        userDao.update();
    }
}
