package com.tdu.controller;

import com.google.gson.Gson;
import com.tdu.pojo.User;
import com.tdu.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/toLogin.action")
    public String toLogin(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        return "/login";
    }

    @RequestMapping(value = "/addUser.action")
    @ResponseBody
    public String addUser(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        Boolean flag = userService.addUser(name,pwd);

        Map<String, String> map = new HashMap<>();
        map.put("result", flag ? "OK" : "ERR");
        Gson gson = new Gson();
        String json = gson.toJson(map);
        return json;
    }
}
