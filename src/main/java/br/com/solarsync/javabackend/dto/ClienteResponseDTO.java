package br.com.solarsync.javabackend.dto;

import br.com.solarsync.javabackend.model.Escolaridade;
import br.com.solarsync.javabackend.model.EstadoCivil;
import br.com.solarsync.javabackend.model.Genero;

public record ClienteResponseDTO(
    Long id,
    String nome,
    String email,
    Escolaridade escolaridade,
    EstadoCivil estadoCivil,
    Genero genero) {
}
