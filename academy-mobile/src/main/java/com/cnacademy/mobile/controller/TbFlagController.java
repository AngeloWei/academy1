package com.cnacademy.mobile.controller;

import com.cnacademy.service.TbFlagService;
import com.cnacademy.pojo.TbFlag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TbFlagController {

    @Autowired
    private TbFlagService tbFlagService;
    @GetMapping("/flag/add")
    @ResponseBody
    public String addFlag(@RequestParam String name) {
        TbFlag tbFlag = new TbFlag();
        tbFlag.setSequence((short) 1);
        tbFlag.setName(name);
        tbFlagService.insertFlag(tbFlag);
        return "success";
    }
}
