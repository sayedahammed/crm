package com.ecrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @GetMapping({"/dashboard", ""})
    public String dashboardPage() {
        return "admin/dashboard";
    }

    @GetMapping("/user/add")
    public String addUser() {
        return "admin/add-user";
    }

    @GetMapping({"/user/list", "/user"})
    public String userList() {
        return "admin/user-list";
    }
}
