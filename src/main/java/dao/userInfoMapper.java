package dao;

import model.userInfo;

public interface userInfoMapper {
    int insert(userInfo record);

    int insertSelective(userInfo record);
}