package com.example.demo.controllers;


import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.service.PartService;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class InventoryReportController {
    private PartService partService;
    private ProductService productService;

    List<Part> allParts;

    public InventoryReportController(PartService partService, ProductService productService) {
        this.partService = partService;
        this.productService = productService;
    }

    @GetMapping("/productInventoryReport")
    public String generateProductInventoryReport(Model model){
        List<Product> allProducts = productService.findAll();
        model.addAttribute("products", allProducts);
        return "inventoryReport";
    }

    @GetMapping("/partInventoryReport")
    public String generatePartInventoryReport(Model model){
        List<Part> allParts = partService.findAll();
        model.addAttribute("parts", allParts);
        return "partInventoryReport";
    }
}
