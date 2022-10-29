package com.bjpowernode;

import com.bjpowernode.mapper.UserMapper;
import com.bjpowernode.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class MyBatisPlusTest {

    @Autowired
    private UserMapper userMapper;

    //查询所有
    @Test
    public void testSelectList(){
        //通过条件构造器查询一个list集合，若没有条件，则可以设置null为参数
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);
    }

    //插入单条信息
    @Test
    public void testInsert(){
        User user = new User();
        user.setName("李四");
        user.setAge(23);
        user.setEmail("ikun@qq.com");
        int result = userMapper.insert(user);
        System.out.println("result:"+result);
        System.out.println("id:"+user.getId());
    }

    //删除单条信息
    @Test
    public void testDelete(){
        //因为id的长度超过int类型的范围，所以id属性的尾部需要加L表示Long类型
        int i = userMapper.deleteById(1585827585961508866L);
        System.out.println("i:"+i);
    }

    @Test
    public void testDeleteByMap(){
        //根据map集合中所设置的条件删除用户
        Map<String, Object> map = new HashMap<>();
        map.put("name","王五");
        map.put("age",24);
        int i = userMapper.deleteByMap(map);
    }

    @Test
    public void test(){
        System.out.println("小明");
        System.out.println("----");
        System.out.println("======");
        System.out.println("--==");
    }
}
