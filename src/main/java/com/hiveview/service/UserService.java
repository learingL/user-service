package com.hiveview.service;


import com.hiveview.entity.User;

import java.math.BigDecimal;

/**
 * Created by gonglixun on 2017/2/8.
 */
public interface UserService {

    public int updateUser();

    public User addUser(String openid,String unionid,int parentId,int level);

    public User getUserByUnionid(String unionid);

    public User getUserByParentId(int parentId);

    public User getUserById(int userId);


    public  int updateUserBalance(int userId,BigDecimal totalFee,int dataType,String dataDesc,boolean isJia);

    public void updateUserPassWord(String pass,int userId);

}
