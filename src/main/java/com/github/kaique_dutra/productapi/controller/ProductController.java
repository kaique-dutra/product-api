package com.github.kaique_dutra.productapi.controller;


import com.github.kaique_dutra.productapi.model.Product;
import com.github.kaique_dutra.productapi.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController (ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product save( @RequestBody Product product){
        System.out.println("Produto recebido: " + product );
       var id =  UUID.randomUUID().toString();
       product.setId(id);
        productRepository.save(product);
        return product;
    }


   @GetMapping("/{id}")
    public Product obtainPerId(@PathVariable ("id")String id){
        Optional<Product> product = productRepository.findById(id);
        return  product.isPresent() ? product.get() : null;
    }
    @GetMapping
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") String id){
        productRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public void update(@PathVariable("id") String id,
                       @RequestBody Product product){
        product.setId(id);
        productRepository.save(product);
    }
    @GetMapping("/search")
    public List<Product> search(@RequestParam("name") String name){
    return  productRepository.findByName(name);
    }

}
