package com.ecrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/lead")
public class LeadController {

    @GetMapping
    public String index() {
        return "admin/lead/index";
    }

    @GetMapping("/create")
    public String create() {
        return "admin/lead/create";
    }

    public void save() {

    }

    public void edit(Long id) {

    }

    public void delete(Long id) {

    }
}
