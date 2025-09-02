/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vvm.controllers;

import com.vvm.services.StatsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author BRAVO15
 */
@Controller
public class StatsController {
    @Autowired
    private StatsServices statsServive;
    
    @GetMapping("/stats")
    public String stats(Model model){
        model.addAttribute("revenues", this.statsServive.getRevenueByProduct());
        return "stats";
    }
}
