package com.teste.teste.controller;


import com.teste.teste.dto.PessoaDto;
import com.teste.teste.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/pessoa")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;

    @PostMapping("/registrarPessoa")
    public void registrarPessoa(@RequestBody PessoaDto pessoaDto){
        pessoaService.registrarPessoa(pessoaDto);
    }
}

