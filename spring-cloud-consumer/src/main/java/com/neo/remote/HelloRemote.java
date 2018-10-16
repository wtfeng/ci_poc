package com.neo.remote;

import com.fwd.gz.poc.ci.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by summer on 2017/5/11.
 */
@FeignClient(name= "spring-cloud-producer")
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);


    @RequestMapping(value = "/user", method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE)
    public User getUser(@RequestParam(value = "name") String name);
}
