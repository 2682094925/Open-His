package com.rhl.mcy.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rhl.mcy.domain.User;
import com.rhl.mcy.mapper.UserMapper;
import com.rhl.mcy.service.UserService;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




