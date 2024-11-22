package br.com.solarsync.javabackend.model;

public enum Regiao {
  NORTH_AMERICA("North America"),
  SOUTH_AMERICA("South America"),
  EUROPE("Europe"),
  ASIA("Asia"),
  AFRICA("Africa"),
  OCEANIA("Oceania"),
  MIDDLE_EAST("Middle East"),
  CENTRAL_AMERICA("Central America"),
  CARIBBEAN("Caribbean"),
  ANTARCTICA("Antarctica");

  private final String nomeRegiao;

  Regiao(String nomeRegiao) {
    this.nomeRegiao = nomeRegiao;
  }

  public String getDescricao() {
    return nomeRegiao;
  }
}
