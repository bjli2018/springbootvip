package com.enjoy.service;

/**
 * Created by BJLI on 2020/2/2.
 */
public interface IUserService {
    boolean login(String username,String passwd);
    boolean register(String username,String passwd);
    void batchAdd(String username,String passwd);
}
