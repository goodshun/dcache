package com.lds.dcache.web;

import com.lds.dcache.entity.User;
import com.lds.dcache.service.EhcacheService;
import com.lds.dcache.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {
    @Autowired
    RedisService redisService;

    @Autowired
    EhcacheService ehcacheService;

    @RequestMapping(value = { "/*", "/" }, method = RequestMethod.GET)
    public Object index() throws Exception {
        return "this is Redis Sample!";
    }

    @RequestMapping(value = { "/user"}, method = RequestMethod.GET)
    public Object userTest() throws Exception {
        User admin = new User("lds","1223","www",2);
        redisService.addObject("lds33",admin);
        return "this is Redis Sample!";
    }

    @RequestMapping(value = { "/addstring"}, method = RequestMethod.GET)
    public Object addstring() throws Exception {
        redisService.addString("name","lsdssss");
        return "this is Redis Sample!";
    }

    @RequestMapping(value = { "/getstring/{id}"}, method = RequestMethod.GET)
    public Object getstring(@PathVariable(name = "id") long id) throws Exception {

        return ehcacheService.findUserById(id);
    }

}
