package com.wd.backto90s.controller.sys;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "系统登陆")
@RequestMapping("/sys")
public class SysLoginController {

    @GetMapping("/login")
    @ApiOperation("用户登陆")
    public void login(){

    }

}
