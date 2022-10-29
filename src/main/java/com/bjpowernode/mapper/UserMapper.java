package com.bjpowernode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bjpowernode.pojo.User;
import org.springframework.stereotype.Repository;

@Repository  //@Repository用在持久层的接口上，这个注解是将接口的一个实现类交给spring管理
public interface UserMapper extends BaseMapper<User> {
}
