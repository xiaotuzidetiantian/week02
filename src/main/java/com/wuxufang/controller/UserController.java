package com.wuxufang.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.wuxufang.service.UserService;


@Controller
public class UserController {

	@Resource
	private UserService userService;
}
