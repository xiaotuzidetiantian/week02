package com.wuxufang.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wuxufang.dao.UserMapper;
import com.wuxufang.domain.User;
import com.wuxufang.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public int insert(List<User> user) {
		return userMapper.insert(user);
	}
}
