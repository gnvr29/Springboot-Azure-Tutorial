package com.teste.teste.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.teste.teste.model.Pessoa}
 */
public record PessoaDto(String nome, String cpf) implements Serializable {
}