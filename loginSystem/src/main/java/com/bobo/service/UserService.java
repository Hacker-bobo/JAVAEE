package com.bobo.service;

import com.bobo.entity.*;
import com.bobo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper usermapper;

    public User findByid(Integer id) { return usermapper.findById(id);}

    public User guanlian(Integer id) { return usermapper.guanlian(id);}

    public Respon login(User u) {
        Respon res = new Respon();
        Integer uid = u.getId();
        String pwd = u.getPwd();
        User myUser = guanlian(u.getId());
        if(myUser == null)
            res.setStatue(100);
        else if(uid.equals(myUser.getId()) && pwd.equals(myUser.getPwd())) {
            System.out.println("登录成功！");
            res.setStatue(200);
            res.setUser(myUser);
        }
        else {
            System.out.println("密码错误！");
            res.setStatue(500);
        }
        return res;
    }
}
