package com.wsw.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wsw.domain.User;
import com.wsw.service.UserService;
import com.wsw.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 23859
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-12-09 10:52:23
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




