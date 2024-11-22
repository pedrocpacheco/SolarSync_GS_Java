package br.com.solarsync.javabackend.dto;

public record CampanhaRequestDTO(
    String titulo,
    Long clicksEfetivos,
    String descricao,
    String publicoAlvo,
    String periodoRealizacao,
    String produto,
    String meioComunicacao) {
}
