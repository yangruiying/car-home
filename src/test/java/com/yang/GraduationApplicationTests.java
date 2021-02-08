package com.yang;

import com.platform.idleplatform.GraduationApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GraduationApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GraduationApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;
    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiLmtYvor5UiLCJleHAiOjE2MTA4ODgwNDIsInVzZXJJZCI6IjEyMTM0NTQ2IiwiaWF0IjoxNjEwODg4MDM3fQ.tmHR09U4B0PnlXbwq93h2JmVMVlHjmIDZCkO6OQFSXU","ccc");

        System.out.println(redisTemplate.opsForValue().get("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiLmtYvor5UiLCJleHAiOjE2MTA4ODgwNDIsInVzZXJJZCI6IjEyMTM0NTQ2IiwiaWF0IjoxNjEwODg4MDM3fQ.tmHR09U4B0PnlXbwq93h2JmVMVlHjmIDZCkO6OQFSXU"));
    }

}
