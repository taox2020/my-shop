package com.tx.my.shop.login.web.controller;

import com.tx.my.shop.login.commons.utils.SpringContext;
import com.tx.my.shop.login.entity.User;
import com.tx.my.shop.login.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SpringContext context = new SpringContext();
        UserService userService = (UserService) context.getBean("userService");

        String email = req.getParameter("email");
        String password = req.getParameter("password");
        User user = userService.login(email, password);
        // 登陆成功
        if (user != null){
            resp.sendRedirect("/main.jsp");
        }

        //登陆失败
        else {
            req.getRequestDispatcher("/index.jsp").forward(req,resp);
        }
    }
}
