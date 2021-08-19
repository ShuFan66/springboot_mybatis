package com.shufan.springboot.mbts.mapper;

import com.shufan.springboot.mbts.model.members;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface membersMapper {
    List<members> selectAll();
}
