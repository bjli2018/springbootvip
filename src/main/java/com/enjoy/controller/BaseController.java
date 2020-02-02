package com.enjoy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by BJLI on 2020/2/2.
 */
@RestController
public class BaseController {
    @RequestMapping("/404.do")
    public Object error_404() {
        return "你要找的页面，被bob偷吃了！";
    }

}
