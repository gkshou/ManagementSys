package com.gkshou.yadmin;

import com.gkshou.yadmin.sys.entity.User;
import com.gkshou.yadmin.sys.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class YAdminApplicationTests {
    @Resource
    private UserMapper userMapper;
    @Test
    void testMapper() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

}
