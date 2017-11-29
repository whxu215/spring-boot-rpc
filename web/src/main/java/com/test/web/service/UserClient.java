package com.test.web.service;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.test.common.data.User;

@FeignClient("data")
public interface UserClient {
    @RequestMapping(method = RequestMethod.GET, value = "/users/{id}")
    User findById(@RequestParam("id") Long id);
}
