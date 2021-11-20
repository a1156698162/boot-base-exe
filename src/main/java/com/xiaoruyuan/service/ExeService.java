package com.xiaoruyuan.service;

import com.xiaoruyuan.dao.ExeMapper;
import com.xiaoruyuan.domain.Exe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExeService {

    @Autowired
    private ExeMapper exeMapper;

    public int addExe(Exe exe) {
        return exeMapper.addExe(exe);
    }

    public int delExe(int id) {
        return exeMapper.delExe(id);
    }
}
