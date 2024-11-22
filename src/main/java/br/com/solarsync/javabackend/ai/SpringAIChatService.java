package br.com.solarsync.javabackend.ai;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.solarsync.javabackend.model.Servico;
import br.com.solarsync.javabackend.repository.ServicoRepository;

@Service
public class SpringAIChatService {
  private final ChatClient.Builder chatClientBuilder;

  @Autowired
  private final ServicoRepository servicoRepository;

  public SpringAIChatService(ChatClient.Builder chatClientBuilder, ServicoRepository servicoRepository) {
    this.chatClientBuilder = chatClientBuilder;
    this.servicoRepository = servicoRepository;
  }

  public String run(String userPrompt) {
    var chatClient = chatClientBuilder.build();
    return chatClient
        .prompt()
        .user(userPrompt)
        .call()
        .content()
        .replace("\n", "");
  }

  public String getServicoDetailsById(Long id) {
    Servico servico = servicoRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Servico não encontrado"));

    return String.format("Quanto é 1 + 1?");
  }
}
