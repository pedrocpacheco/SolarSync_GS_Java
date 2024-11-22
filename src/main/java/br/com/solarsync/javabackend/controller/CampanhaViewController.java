package br.com.solarsync.javabackend.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.solarsync.javabackend.dto.CampanhaRequestDTO;
import br.com.solarsync.javabackend.dto.CampanhaResponseDTO;
import br.com.solarsync.javabackend.service.CampanhaService;

@Controller
@RequestMapping("/campanhas")
public class CampanhaViewController {

  private final CampanhaService campanhaService;

  public CampanhaViewController(CampanhaService campanhaService) {
    this.campanhaService = campanhaService;
  }

  @GetMapping
  public String listarCampanhas(Model model) {
    List<CampanhaResponseDTO> campanhas = campanhaService.listarCampanhas();
    model.addAttribute("campanhas", campanhas);
    return "campanhas/listar"; // retorna a view para listar campanhas
  }

  @GetMapping("/{id}")
  public String visualizarCampanha(@PathVariable Long id, Model model) {
    CampanhaResponseDTO campanha = campanhaService.visualizarCampanha(id)
        .orElseThrow(() -> new IllegalArgumentException("Campanha não encontrada"));
    model.addAttribute("campanha", campanha);
    return "campanhas/visualizar"; // retorna a view para visualizar a campanha
  }

  @GetMapping("/novo")
  public String criarNovaCampanha(Model model) {
    model.addAttribute("campanha", new CampanhaRequestDTO("", null, "", "", null, "", "")); // Atualizado
    return "campanhas/novo"; // Caminho do template
  }

  @PostMapping
  public String criarCampanha(@ModelAttribute CampanhaRequestDTO campanhaRequestDTO) {
    campanhaService.criarCampanha(campanhaRequestDTO);
    return "redirect:/campanhas"; // redireciona para a lista de campanhas
  }

  @GetMapping("/editar/{id}")
  public String editarCampanha(@PathVariable Long id, Model model) {
    CampanhaResponseDTO campanha = campanhaService.visualizarCampanha(id)
        .orElseThrow(() -> new IllegalArgumentException("Campanha não encontrada"));
    CampanhaRequestDTO campanhaRequestDTO = new CampanhaRequestDTO(
        campanha.titulo(),
        campanha.clicksEfetivos(),
        campanha.descricao(),
        campanha.publicoAlvo(),
        campanha.periodoRealizacao(),
        campanha.produto(), // Novo atributo
        campanha.meioComunicacao() // Novo atributo
    );
    model.addAttribute("campanhaRequestDTO", campanhaRequestDTO);
    model.addAttribute("id", id);
    return "campanhas/editar"; // retorna a view para editar a campanha
  }

  @GetMapping("/deletar/{id}")
  public String deletarCampanha(@PathVariable Long id) {
    campanhaService.deletarCampanha(id);
    return "redirect:/campanhas"; // redireciona para a lista de campanhas
  }
}
