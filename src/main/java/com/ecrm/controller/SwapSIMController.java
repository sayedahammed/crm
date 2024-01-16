package com.ecrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/swap-sim")
public class SwapSIMController {

    @GetMapping
    public String index() {
        return "admin/swap-sim/index";
    }

    public void create() {
    }

    public void save() {

    }

    @GetMapping("{id}/edit")
    public String update(@PathVariable Long id) {
        return "admin/swap-sim/edit";
    }

    public void delete(Long id) {

    }
}
