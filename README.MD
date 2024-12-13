# SolarSync

<h1 id="autores">🤝 Integrantes</h2>
<table>
  <tr>
    <td align="center">
      <p>Mobile</p>
      <a href="https://github.com/nichol6s">
        <img src="https://avatars.githubusercontent.com/u/105325313?v=4" width="115px;" alt="Foto do Nicholas no GitHub"/><br>
        <sub>
          <strong>Nicholas Santos</strong>
        </sub>
      </a>
    </td>
    <td align="center">
      <p>IA</p>
      <a href="https://github.com/VitorKubica">
        <img src="https://avatars.githubusercontent.com/u/107961081?v=4" width="115px;" alt="Foto do Vitor no GitHub"/><br>
        <sub>
          <strong>Vitor Kubica</strong>
        </sub>
      </a>
    </td>
    <td align="center">
      <p>Database & C#</p>
      <a href="https://github.com/DuduViolante">
        <img src="https://avatars.githubusercontent.com/u/126472870?v=4" width="115px;" alt="Foto do Violante no GitHub"/><br>
        <sub>
          <strong>Eduardo Violante</strong>
        </sub>
      </a>
    </td>
    <td align="center">
      <p>Java</p>
      <a href="https://github.com/pedrocpacheco">
        <img src="https://avatars.githubusercontent.com/u/112909829?v=4" width="115px;" alt="Foto do Pedro no github"/><br>
        <sub>
          <strong>Pedro</strong>
        </sub>
      </a>
    </td>
    <td align="center">
        <p>DevOps & Compliance</p>
        <a href="https://github.com/biasvestka">
        <img src="https://avatars.githubusercontent.com/u/126726456?v=4" width="115px;" alt="Foto da Beatriz GitHub"/><br>
        <sub>
            <strong>Beatriz Svestka</strong>
        </sub>
      </a>
    </td>
  </tr>
</table>

## 🚀 Iniciando o projeto
```sh
#Clone o repositorio
$ git clone https://github.com/pedrocpacheco/SolarSync_GS_Java

#Clique com o botão direito na classe ApiAnallyzerApplication
#Run as -> Java Application
```
### 🎥 Vídeo Pitch
https://youtu.be/od8EunHgmUY

### 🎥 Vídeo Explicativo Projeto Java
https://youtu.be/L-YYX8WWB8I

## Links LocalHost 🏠:
---

### Acessar páginas HTML 📄:

#### Página HTML de Clientes 🧑‍💼:
http://localhost:8080/clientes

#### Páginas HTML de Empresas 🏢:
http://localhost:8080/empresas

#### Página HTML de Serviços 🤝:
http://localhost:8080/servicos

---

### Acessar Endpoints API 🧩:

#### Endpoint da API de Registro de Usuário do Sprint Security 🔒
http://localhost:8080/auth/register 

#### Endpoint da API de Login de Usuário do Sprint Security 🔑
http://localhost:8080/auth/login

#### Endpoint da API de Clientes 🧑‍💼:
http://localhost:8080/api/clientes

#### Endpoint da API de Empresas 🏢:
http://localhost:8080/api/empresas

#### Endpoint da API de Serviços 🤝:
http://localhost:8080/api/servicos

### Endpoint para Análise do Spring AI 🧠:
https://localhost:8080/springai/generate/{id_servico}


## Links Deploy 🌐:
---

### Acessar páginas HTML 📄:

#### Página HTML de Clientes 🧑‍💼: 
https://projeto-java-production.up.railway.app/clientes

#### Páginas HTML de Empresas 🏢:
https://projeto-java-production.up.railway.app/empresas

#### Página HTML de Serviços 🤝:
https://projeto-java-production.up.railway.app/servicos

---

### Acessar Endpoints API 🧩:

#### Endpoint da API de Registro de Usuário do Sprint Security 🔒
http://projeto-java-production.up.railway.app/auth/register 

#### Endpoint da API de Login de Usuário do Sprint Security 🔑
http://projeto-java-production.up.railway.app/auth/login

#### Endpoint da API de Clientes 🧑‍💼:
https://projeto-java-production.up.railway.app/api/clientes

#### Endpoint da API de Empresas 🏢:
https://projeto-java-production.up.railway.app/api/empresas

#### Endpoint da API de Serviços 🤝:
https://projeto-java-production.up.railway.app/api/servicos

### Endpoint para Análise do Spring AI 🧠:
https://projeto-java-production.up.railway.app/springai/generate/{id_servico}

## Explicação

Devido a plano de testes do Railway, e instabilidade da plataforma é capaz que o Deploy não esteja disponível na hora da avaliação. Normalmente o mesmo é reiniciado após inatividade, por isso também existem os endpoints via localhost.

![Foto Deploy](assets/deploy.png)

![Foto Página](assets/pagina.png)

## Exemplo de Análise da IA 🤖:

A nossa inteligencia artificial análise a Entidade Servico, que é o relacionamento entre uma entidade Cliente e Empresa, para entender se tal servico entre os dois (o fornecedor e receptor de energia) faz sentido de existir.

Para esse contexto, vamos considerar.

#### Exemplo de Cliente 🧑‍💼:
![Foto Deploy](assets/cliente.png)

#### Exemplo de Cliente 🏢:
![Foto Deploy](assets/empresa.png)

#### Exemplo de Serviço 🤝:
![Foto Deploy](assets/servico.png)

#### Retorno da IA Após analise 🧠:
![Foto Deploy](assets/ia.png)

- Perceba que a IA 🧠 foi capaz de entender que o Cliente 🧑‍💼 precisa de mais energia do que a Empresa 🏢 consegue gerar

- Perceba que a IA 🧠 foi capaz de perceber que o Cliente 🧑‍💼 e a Empresa 🏢 estão em continentes diferentes

- Perceba que a IA 🧠 foi capaz de analisar que o Cliente 🧑‍💼 deseja apenas alugar paineis solares, enquanto a Empresa 🏢 apenas deseja vende-los

Nossa inteligência artificial 🧠 é capaz de entender os serviços 🤝 que serão realmente funcionais.

## Arquivos Bruno para Testes de API

Na pasta docs, você pode acessar o arquivo da SolarSync contendo todas as requisições HTTP já criadas na plataforma Bruno.

![Foto Deploy](assets/bruno.png)
