package com.enjoy.dao;

import com.enjoy.App;
import com.enjoy.dao.entity.EnjoyUser;
import com.enjoy.dao.mapper.EnjoyUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by BJLI on 2020/2/1.
 */
@SpringBootTest(classes = {App.class})
@RunWith(SpringRunner.class)
public class UserTest {
    @Resource
    private EnjoyUserMapper enjoyUserMapper;

    @Test
    public void testAdd() {
        EnjoyUser user = new EnjoyUser() ;
        user.setPasswd("123");
        user.setUsername("enjoy");
        enjoyUserMapper.insert(user);
    }


}
