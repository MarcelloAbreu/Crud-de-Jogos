# Projeto CRUD de Jogos 🎮

Este é um projeto de um sistema CRUD (Create, Read, Update, Delete) para jogos, desenvolvido com Spring Boot e Java.

## Sobre o Projeto 🎯

Este projeto foi criado com o objetivo de fornecer uma API RESTful para gerenciar um catálogo de jogos. Ele permite criar, ler, atualizar e deletar informações sobre jogos.

## Tecnologias Utilizadas 🛠️

- **Spring Boot**: Utilizado para criar a API RESTful.
- **Java**: Usado para implementar a lógica de negócios.

## Como Usar ⚙️

1. Clone este repositório para a sua máquina local.
2. Abra o projeto no seu IDE preferido (recomendamos o IntelliJ IDEA ou Eclipse).
3. Inicie a aplicação Spring Boot.
4. Acesse a API através de `localhost:8080`.

## Endpoints 🌐

- `/games`: Retorna todos os jogos.
- `/games/{id}`: Retorna o jogo com o ID especificado.
- `/games`: Cria um novo jogo (use o método POST).
- `/games/{id}`: Atualiza o jogo com o ID especificado (use o método PUT).
- `/games/{id}`: Deleta o jogo com o ID especificado (use o método DELETE).
