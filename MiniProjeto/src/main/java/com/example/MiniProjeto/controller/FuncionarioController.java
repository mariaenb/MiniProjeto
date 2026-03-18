package com.example.MiniProjeto.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rh")
public class FuncionarioController {

    private final FuncionarioService service;

    public FuncionarioController(FuncionarioService service){
        this.service = service;
    }

    @PostMapping
    public Funcionario criar(@RequestBody @Valid Funcionario )
}