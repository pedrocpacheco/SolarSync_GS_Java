package br.com.solarsync.javabackend.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_SOLARSYNC_CLIENTE")
public class Servico {
  
  public Servico() {
  }

  public Servico(Long id, String tituloServico, String descricaoServico, Long idCliente, Long idEmpresa) {
    this.id = id;
    this.tituloServico = tituloServico;
    this.descricaoServico = descricaoServico;
    this.idCliente = idCliente;
    this.idEmpresa = idEmpresa;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id; 

  @Column(name = "titulo_servico")
  private String tituloServico;


  @Column(name = "descricao_servico", columnDefinition = "TEXT")
  private String descricaoServico;
  
  @Column(name = "id_cliente")
  private Long idCliente;

  @Column(name = "id_Empresa")
  private Long idEmpresa;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTituloServico() {
    return tituloServico;
  }

  public void setTituloServico(String tituloServico) {
    this.tituloServico = tituloServico;
  }

  public String getDescricaoServico() {
    return descricaoServico;
  }

  public void setDescricaoServico(String descricaoServico) {
    this.descricaoServico = descricaoServico;
  }

  public Long getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(Long idCliente) {
    this.idCliente = idCliente;
  }

  public Long getIdEmpresa() {
    return idEmpresa;
  }

  public void setIdEmpresa(Long idEmpresa) {
    this.idEmpresa = idEmpresa;
  }

  

}
