package org.ecommerce.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    public HomeController() {
    }

    @RequestMapping("/")
    public String index() {
        System.out.println("Carregando os produtos");
        return "helloworld";
    }

    @RequestMapping("/home")
    public String home() {
        // aqui ainda vamos carregar os produtos.
        return "helloworld";
    }
}
