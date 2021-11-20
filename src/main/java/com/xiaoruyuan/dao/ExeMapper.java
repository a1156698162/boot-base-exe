package com.xiaoruyuan.dao;

import com.xiaoruyuan.domain.Exe;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExeMapper {
    int addExe(Exe exe);

    int delExe(int id);
}
