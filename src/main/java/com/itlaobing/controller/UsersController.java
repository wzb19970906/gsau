package com.itlaobing.controller;

import com.itlaobing.biz.UsersBiz;
import com.itlaobing.model.Users;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UsersController {
    @Autowired private UsersBiz usersBiz;

    public UsersBiz getUsersBiz() {
        return usersBiz;
    }

    public void setUsersBiz(UsersBiz usersBiz) {
        this.usersBiz = usersBiz;
    }
    @RequestMapping("check_Users.do")
    public ModelAndView check(Users users, HttpServletRequest request){
        boolean flag = usersBiz.check(users);
        ModelAndView mv = new ModelAndView();
        if(flag){
            request.setAttribute("users",users);
            mv.setViewName("loginSuccess.jsp");
            return  mv;
        }else{
            mv.setViewName("redirect:loginFail.jsp");
            return  mv;
        }
    }
    @RequestMapping(value = "show_Users.do")
    public Users show(){
        Users us=new Users("张飞","123456");
        return us;
    }
}
