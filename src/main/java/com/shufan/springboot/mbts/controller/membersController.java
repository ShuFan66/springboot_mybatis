package com.shufan.springboot.mbts.controller;

import com.shufan.springboot.mbts.model.members;
import com.shufan.springboot.mbts.service.membersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jike")
public class membersController {
    @Autowired
    private membersService membersService;
    @RequestMapping("/selectAll")
    public List<members> selectAll(){
        return membersService.selectAll();
    }
}
