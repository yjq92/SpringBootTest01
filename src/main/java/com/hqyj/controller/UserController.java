package com.hqyj.controller;

import com.hqyj.pojo.User;
import com.hqyj.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

//@PostMapping是一个组合注解，是@RequestMapping(method = RequestMethod.POST)的缩写。
// @ResponseBody 作用：将controller的方法返回的对象通过适当的转换器转换为指定的格式之后，写入到response对象的body区，通常用来返回JSON数据或者是XML数据。

@Controller
@RequestMapping("y")
public class UserController {
    @Autowired
    private ISysUserService userService;
    //user列表页面
    @RequestMapping("info")
    public String info(){
        return "userInfo/profile";
    }

    @RequestMapping("list")
    @ResponseBody
    public HashMap<String, Object> list(@RequestParam("userId")long userId) {
        HashMap<String, Object> map=new HashMap<>();
        System.out.println("执行此方法了！");
        User user = userService.selectByPrimaryKey(userId);
        System.out.println(user.toString());
        map.put("data",user);
        return map;
    }
    @RequestMapping("updateInfo")
    @ResponseBody
    public HashMap<String,Object> updateInfo(@RequestParam("userId") long userId){
        System.out.println("执行 updateInfo 方法了!!!");
        HashMap map = new HashMap();
        if (userService.updateByPrimaryKeySelective(userId) > 0) {
            map.put("info", true);
        } else {
            map.put("info", false);
        }
        return map;
    }
}
