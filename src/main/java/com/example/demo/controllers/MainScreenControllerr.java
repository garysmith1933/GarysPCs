package com.example.demo.controllers;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.PartService;
import com.example.demo.service.ProductService;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */

@Controller
public class MainScreenControllerr {
   // private final PartRepository partRepository;

   @Autowired
    private final ProductRepository productRepository;

    private PartService partService;
    private ProductService productService;

    private List<Part> theParts;
    private List<Product> theProducts;


//    public MainScreenControllerr(PartRepository partRepository, ProductRepository productRepository) {
//        this.productRepository = productRepository;
//        this.productRepository = productRepository;
//    }

    public MainScreenControllerr(PartService partService,ProductService productService, ProductRepository productRepository){
        this.partService=partService;
        this.productService=productService;
        this.productRepository = productRepository;
    }

    @GetMapping("/mainscreen")
    public String listPartsandProducts(Model theModel, @Param("partkeyword") String partkeyword, @Param("productkeyword") String productkeyword){
        //add to the sprig model
        List<Part> partList=partService.listAll(partkeyword);
        System.out.println(partList);
        theModel.addAttribute("parts",partList);
        theModel.addAttribute("partkeyword",partkeyword);
    //    theModel.addAttribute("products",productService.findAll());
        List<Product> productList=productService.listAll(productkeyword);
        theModel.addAttribute("products", productList);
        theModel.addAttribute("productkeyword",productkeyword);
        return "mainscreen";
    }

    @PostMapping("/buyProduct")
    public String buyProduct(@RequestParam("productID") Long productID, Model model) {
        Optional<Product> productPresent = this.productRepository.findById(productID);

        if (productPresent.isPresent()) {
            //get the product!
            Product product = productPresent.get();

            if (product.getInv() <= 0) {
                return "redirect:/purchaseFailure";
            }

            else {
                //decrement the product inventory
                product.setInv(product.getInv() - 1);
                this.productRepository.save(product);
                return "redirect:/purchaseSuccess";
            }
        }

        else {
            return "redirect:/purchaseFailure";
        }
    }
}
