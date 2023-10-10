package com.example.demo.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PurchaseController {

    @GetMapping("/purchaseSuccess")
    public String purchaseSuccessDisplay(Model model) {
        model.addAttribute("success", "Your Purchase was successful!");
        return "purchaseSuccess";
    }

    @GetMapping("/purchaseFailure")
    public String purchaseFailureDisplay(Model model) {
        model.addAttribute("error", "There was a problem with your purchase.");
        return "purchaseFailure";
    }
}
