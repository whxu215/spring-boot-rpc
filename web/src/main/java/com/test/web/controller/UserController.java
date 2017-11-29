package com.test.web.controller;

import com.test.common.data.User;
import com.test.web.service.UserClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserClient userClient;

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable long id) {
        logger.debug("getUser id:{}", id);
        return userClient.findById(id);
//      return User.builder().username("zhangshan").passpord("123456").build();
    }
}
