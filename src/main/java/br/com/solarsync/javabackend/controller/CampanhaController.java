package br.com.solarsync.javabackend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.solarsync.javabackend.dto.CampanhaRequestDTO;
import br.com.solarsync.javabackend.dto.CampanhaResponseDTO;
import br.com.solarsync.javabackend.service.CampanhaService;

@RestController
@RequestMapping("/api/campanhas")
public class CampanhaController {

  private final CampanhaService campanhaService;

  public CampanhaController(CampanhaService campanhaService) {
    this.campanhaService = campanhaService;
  }

  @PostMapping
  public ResponseEntity<CampanhaResponseDTO> criarCampanha(@RequestBody CampanhaRequestDTO campanhaRequestDTO) {
    CampanhaResponseDTO campanhaResponseDTO = campanhaService.criarCampanha(campanhaRequestDTO);
    return new ResponseEntity<>(campanhaResponseDTO, HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<List<CampanhaResponseDTO>> listarTodasCampanhas() {
    List<CampanhaResponseDTO> campanhas = campanhaService.listarCampanhas();
    return ResponseEntity.ok(campanhas);
  }

  @GetMapping("/{id}")
  public ResponseEntity<CampanhaResponseDTO> listarCampanhaPorId(@PathVariable Long id) {
    CampanhaResponseDTO campanhaResponseDTO = campanhaService.visualizarCampanha(id)
        .orElseThrow(() -> new IllegalArgumentException("Campanha não encontrada"));
    return ResponseEntity.ok(campanhaResponseDTO);
  }

  @PutMapping("/{id}")
  public ResponseEntity<CampanhaResponseDTO> atualizarCampanha(@PathVariable Long id,
      @RequestBody CampanhaRequestDTO campanhaRequestDTO) {
    CampanhaResponseDTO campanhaAtualizada = campanhaService.atualizarCampanha(id, campanhaRequestDTO);
    return ResponseEntity.ok(campanhaAtualizada);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deletarCampanha(@PathVariable Long id) {
    campanhaService.deletarCampanha(id);
    return ResponseEntity.noContent().build();
  }
}
