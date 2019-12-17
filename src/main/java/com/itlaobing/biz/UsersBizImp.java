package com.itlaobing.biz;

import com.itlaobing.model.Users;
import org.springframework.stereotype.Service;

@Service
public class UsersBizImp implements  UsersBiz {
    @Override
    public boolean check(Users users) {
        if (users!=null && users.getUname()!=null && !users.getUname().trim().equals("") && users.getPasswd()!=null && !users.getPasswd().trim().equals("")){
            return true;
        }
        return false;
    }
}
