package com.gkshou.yadmin;

import com.gkshou.yadmin.common.utils.JwtUtil;
import com.gkshou.yadmin.sys.entity.User;
import io.jsonwebtoken.Claims;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JwtUtilTest {
    @Autowired
    private JwtUtil jwtUtil;
    @Test
    public void testCreateJwt(){
        User user = new User();
        user.setUsername("zhangsan");
        user.setPhone("12345666677");
        String token = jwtUtil.createToken(user);
        System.out.println(token);
    }
    @Test
    public void testParseJwt(){
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI1MzA5MjI0NS1iMWQ3LTQ0NjUtYjY2OC03NTRmNWFiMWYxNDUiLCJzdWIiOiJ7XCJwaG9uZVwiOlwiMTIzNDU2NjY2NzdcIixcInVzZXJuYW1lXCI6XCJ6aGFuZ3NhblwifSIsImlzcyI6InN5c3RlbSIsImlhdCI6MTY4MTI3NzQwMiwiZXhwIjoxNjgxMjc5MjAyfQ.7MKMAZw09JvHFPfUdSjmYAj7p2MH8fTxOW_Zei9VdIY";
        Claims claims = jwtUtil.parseToken(token);
        System.out.println(claims);
    }

    @Test
    public void testParseJwt2(){
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI1MzA5MjI0NS1iMWQ3LTQ0NjUtYjY2OC03NTRmNWFiMWYxNDUiLCJzdWIiOiJ7XCJwaG9uZVwiOlwiMTIzNDU2NjY2NzdcIixcInVzZXJuYW1lXCI6XCJ6aGFuZ3NhblwifSIsImlzcyI6InN5c3RlbSIsImlhdCI6MTY4MTI3NzQwMiwiZXhwIjoxNjgxMjc5MjAyfQ.7MKMAZw09JvHFPfUdSjmYAj7p2MH8fTxOW_Zei9VdIY";
        User user = jwtUtil.parseToken(token,User.class);
        System.out.println(user);
    }

}
