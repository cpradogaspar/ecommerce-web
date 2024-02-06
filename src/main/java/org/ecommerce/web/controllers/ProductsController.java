package org.ecommerce.web.controllers;

import javax.transaction.Transactional;

import org.ecommerce.web.daos.ProductDAO;
import org.ecommerce.web.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Transactional
public class ProductsController {

    @Autowired
    private ProductDAO productDAO;

    @RequestMapping("/produtos")
    public String save(Product produto){
        productDAO.save(produto);
        System.out.println("Cadastrando o produto: "+produto.toString());
        return "products/ok";
    }

    @RequestMapping("/produtos/form")
    public String form(){
        return "products/form";
    }

}
