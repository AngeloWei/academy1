package com.cnacademy.mobile.controller;

import com.cnacademy.service.TbUserClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TbUserClassController {

    @Autowired
    private TbUserClassService userClassService;
    @GetMapping("/userclass/add")
    public String addUserClass() {
        return userClassService.insert();
    }
}
