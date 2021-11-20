package com.xiaoruyuan.controller;


import com.xiaoruyuan.domain.Exe;
import com.xiaoruyuan.service.ExeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExeController {

    @Autowired
    private ExeService exeService;

    @RequestMapping("/addExe")
    public String addExe(@RequestParam("exeName") String exeName,
                         @RequestParam("queId") int queId,
                         @RequestParam("exePrice") Double exePrice){
        Exe exe = null;
        exe = new Exe(null,exeName,queId,exePrice);
        int row = exeService.addExe(exe);
        return row > 0 ? "success" : "fail";
    }

    @RequestMapping("/delExe")
    public String delExe(@RequestParam("id") int id){
        return exeService.delExe(id) > 0 ? "success" : "fail";
    }
}
