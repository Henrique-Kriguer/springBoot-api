package br.com.kriguer.api.controller;

import br.com.kriguer.api.model.Pessoa;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/1")
    public String helloMessage(){
        return "Hello again, It´s working well ?";
    }

    @GetMapping("/2")
    public String helloMessage2(){
        return "All right to you ? ok ?";
    }

    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Seja bem vindo (a) "+ nome;
    }

    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p){
        return p;
    }
}
