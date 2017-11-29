package com.test.data.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.test.common.data.User;

/**
 * Created by xupanpan on 2017/11/29.
 */
@RestController
public class UserController {
  private final Logger logger = LoggerFactory.getLogger(UserController.class);

  @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
  public User getUser(@PathVariable long id) {
    logger.info("getUser id:{}", id);
    return User.builder().username("zhangshan").passpord("123456").build();
  }
}
