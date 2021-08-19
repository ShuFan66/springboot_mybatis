package com.shufan.springboot.mbts.service.impl;

import com.shufan.springboot.mbts.mapper.membersMapper;
import com.shufan.springboot.mbts.model.members;
import com.shufan.springboot.mbts.service.membersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("membersService")
public class membersServiceImpl implements membersService {
    @Autowired
    private membersMapper membersMapper;
    @Override
    public List<members> selectAll() {
        return membersMapper.selectAll();
    }
}
