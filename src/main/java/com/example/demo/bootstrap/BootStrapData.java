package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        //MY PARTS
        OutsourcedPart RAM= new OutsourcedPart();
        RAM.setCompanyName("Some Company");
        RAM.setName("16GB DDR5 RAM");
        RAM.setInv(26);
        RAM.setPrice(90.0);
        RAM.setId(100L);
        RAM.setMinInv(25);
        RAM.setMaxInv(100);


        if (this.partRepository.search(RAM.getName()).isEmpty()) {
            outsourcedPartRepository.save(RAM);
            OutsourcedPart thePart=null;
            List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts){
                if(part.getName().equals("16GB DDR5 RAM"))thePart=part;
            }

            System.out.println(thePart.getCompanyName());
        }

        OutsourcedPart powerSupply = new OutsourcedPart();
        powerSupply.setCompanyName("Some Company");
        powerSupply.setName("650W Power Supply");
        powerSupply.setInv(32);
        powerSupply.setPrice(60.0);
        powerSupply.setId(101L);
        powerSupply.setMinInv(25);
        powerSupply.setMaxInv(50);

        if (this.partRepository.search(powerSupply.getName()).isEmpty()) {
            outsourcedPartRepository.save(powerSupply);
            OutsourcedPart thePart=null;
            List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts){
                if(part.getName().equals("650W Power Supply"))thePart=part;
            }

            System.out.println(thePart.getCompanyName());
        }

        OutsourcedPart pcCase = new OutsourcedPart();
        pcCase.setCompanyName("Some Company");
        pcCase.setName("Custom Gaming PC Case");
        pcCase.setInv(34);
        pcCase.setPrice(100.0);
        pcCase.setId(102L);
        pcCase.setMinInv(25);
        pcCase.setMaxInv(100);

        if (this.partRepository.search(pcCase.getName()).isEmpty()) {
            outsourcedPartRepository.save(pcCase);
            OutsourcedPart thePart=null;
            List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts){
                if(part.getName().equals("Custom Gaming PC Case"))thePart=part;
            }

            System.out.println(thePart.getCompanyName());
        }

        OutsourcedPart rgb = new OutsourcedPart();
        rgb.setCompanyName("Some Company");
        rgb.setName("Custom Gaming RBG Lights");
        rgb.setInv(50);
        rgb.setPrice(30.0);
        rgb.setId(103L);
        rgb.setMinInv(25);
        rgb.setMaxInv(100);

        if (this.partRepository.search(rgb.getName()).isEmpty()) {
            outsourcedPartRepository.save(rgb);
            OutsourcedPart thePart=null;
            List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts){
                if(part.getName().equals("Custom Gaming PC Case"))thePart=part;
            }
            System.out.println(thePart.getCompanyName());
        }

        OutsourcedPart gc = new OutsourcedPart();
        gc.setCompanyName("Some Company");
        gc.setName("Graphics Card");
        gc.setInv(20);
        gc.setPrice(500.0);
        gc.setId(104L);
        gc.setMinInv(25);
        gc.setMaxInv(100);


        if (this.partRepository.search(gc.getName()).isEmpty()) {
            outsourcedPartRepository.save(gc);
            OutsourcedPart thePart=null;
            List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for(OutsourcedPart part:outsourcedParts){
                if(part.getName().equals("Custom Gaming PC Case"))thePart=part;
            }

            System.out.println(thePart.getCompanyName());
        }

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        //My Products
        Product customPC = new Product("Custom PC Build", 800.0, 50);
        if (this.productRepository.search(customPC.getName()).isEmpty()){
            productRepository.save(customPC);
        }

        Product highEndPC = new Product("High-End Gaming PC", 1200.0, 25);
        if (this.productRepository.search(highEndPC.getName()).isEmpty()) {
            productRepository.save(highEndPC);
        }

        Product budgetPC = new Product("Budget Gaming PC", 600.0, 50);
        if (this.productRepository.search(budgetPC.getName()).isEmpty()) {
            productRepository.save(budgetPC);
        }

        Product gamingLaptop = new Product("Gaming Laptop", 700.0, 24);
        if (this.productRepository.search(gamingLaptop.getName()).isEmpty()) {
            productRepository.save(gamingLaptop);
        }

        Product highEndLaptop = new Product("High-End Laptop", 1000.0, 22);
        if (this.productRepository.search(highEndLaptop.getName()).isEmpty()) {
            System.out.println("saving");
            productRepository.save(highEndLaptop);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());
    }
}
