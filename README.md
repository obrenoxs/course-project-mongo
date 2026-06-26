# Workshop MongoDB API

API REST desenvolvida com **Java + Spring Boot + MongoDB**, com foco no aprendizado de bancos de dados NoSQL, modelagem de documentos e construção de APIs RESTful.

O projeto simula uma pequena rede social, permitindo o gerenciamento de usuários, publicações e comentários, explorando relacionamentos entre documentos utilizando **MongoDB**.

---

## Tecnologias utilizadas

* Java
* Spring Boot
* Spring Data MongoDB
* MongoDB
* Maven
* Postman

---

## Conceitos praticados

* Desenvolvimento de APIs REST
* Integração com MongoDB
* Modelagem de documentos NoSQL
* Relacionamentos utilizando `@DBRef`
* Objetos embarcados (Embedded Documents)
* DTO (Data Transfer Object)
* Tratamento de exceções
* Pesquisa por texto
* Consultas customizadas com `@Query`
* Busca por intervalo de datas
* Organização em camadas (Controller, Service, Repository)

---

## Estrutura do projeto

### Usuários

Cada usuário possui:

* id
* nome
* email
* lista de publicações

### Publicações

Cada publicação contém:

* título
* conteúdo
* data
* autor
* comentários

### Comentários

Cada comentário armazena:

* texto
* data
* autor

---

## Funcionalidades

### Usuários

* Listar usuários
* Buscar usuário por ID
* Inserir usuário
* Atualizar usuário
* Remover usuário
* Listar publicações de um usuário

### Publicações

* Buscar publicação por ID
* Buscar publicações pelo título
* Pesquisa completa utilizando:

  * título
  * conteúdo
  * comentários
  * intervalo de datas

---

## Endpoints

### Usuários

| Método | Endpoint          |
| ------ | ----------------- |
| GET    | /users            |
| GET    | /users/{id}       |
| POST   | /users            |
| PUT    | /users/{id}       |
| DELETE | /users/{id}       |
| GET    | /users/{id}/posts |

### Publicações

| Método | Endpoint                 |
| ------ | ------------------------ |
| GET    | /posts/{id}              |
| GET    | /posts/titlesearch?text= |
| GET    | /posts/fullsearch        |

Exemplo:

```
GET /posts/fullsearch?text=viagem&minDate=2018-03-20&maxDate=2018-03-25
```

---

## Objetivo do projeto

O principal objetivo foi aprender como modelar aplicações utilizando bancos de dados NoSQL, entendendo quando utilizar documentos embarcados, referências entre documentos e consultas específicas do MongoDB dentro do ecossistema Spring Boot.

---

## Aprendizados

Durante o desenvolvimento foram praticados conceitos importantes como:

* criação de APIs REST com Spring Boot;
* integração com MongoDB;
* modelagem de documentos;
* utilização de DTOs para reduzir acoplamento;
* consultas personalizadas utilizando regex e filtros por data;
* organização da aplicação em camadas;
* tratamento centralizado de exceções.

---

## Autor

**Breno Souza**

Projeto desenvolvido como parte dos estudos em Java, Spring Boot e MongoDB.
