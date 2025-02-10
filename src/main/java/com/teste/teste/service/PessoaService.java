package com.teste.teste.service;


import com.teste.teste.dto.PessoaDto;
import com.teste.teste.model.Pessoa;
import com.teste.teste.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public void registrarPessoa(PessoaDto pessoaDto) {
        Pessoa pessoa = new Pessoa(pessoaDto.nome(), pessoaDto.cpf());
        pessoaRepository.save(pessoa);
    }
}