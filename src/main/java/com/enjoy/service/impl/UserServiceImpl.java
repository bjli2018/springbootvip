package com.enjoy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.enjoy.dao.entity.EnjoyUser;
import com.enjoy.dao.mapper.EnjoyUserMapper;
import com.enjoy.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by BJLI on 2020/2/2.
 */
@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private EnjoyUserMapper enjoyUserMapper;

    @Override
    public boolean login(String username, String passwd) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("username",username);
        queryWrapper.eq("passwd",passwd);
        List<EnjoyUser> list = enjoyUserMapper.selectList(queryWrapper);
        return list.size() > 0;
    }

    @Override
    public boolean register(String username, String passwd) {
        EnjoyUser enjoyUser = new EnjoyUser();
        enjoyUser.setPasswd(passwd);
        enjoyUser.setUsername(username);
        int cnt = enjoyUserMapper.insert(enjoyUser);
        return cnt > 0;
    }

    @Override
    @Transactional
    public void batchAdd(String username, String passwd) {
        EnjoyUser enjoyUser = new EnjoyUser();
        enjoyUser.setPasswd(passwd);
        enjoyUser.setUsername(username);
        enjoyUserMapper.insert(enjoyUser);
        int i = 10 / 0;
        enjoyUser = new EnjoyUser();
        enjoyUser.setPasswd(passwd);
        enjoyUser.setUsername(username + "2");
        enjoyUserMapper.insert(enjoyUser);
    }
}
