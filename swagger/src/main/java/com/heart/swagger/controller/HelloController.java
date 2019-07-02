package com.heart.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author mr_zhaojie
 * @date 2019/7/2 9:02
 */
@Controller
@RequestMapping("swagger")
@ResponseBody
@Api(tags="请求测试接口")
public class HelloController {

    @RequestMapping("hello")
    @ApiOperation("测试")
    public String hello(){
        return "Hello world";
    }
}
