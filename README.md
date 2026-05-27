# Estudando JPA

[![Número de Linguagens](https://img.shields.io/github/languages/count/mvmomente/Estudando-JPA)]
[![Linguagem Principal](https://img.shields.io/github/languages/top/mvmomente/Estudando-JPA)]
[![Tamanho do Repositório](https://img.shields.io/github/repo-size/mvmomente/Estudando-JPA)]
[![Último Commit](https://img.shields.io/github/last-commit/mvmomente/Estudando-JPA)]

## Sobre o projeto

Estudando JPA é uma aplicação backend desenvolvida com Java e Spring Boot com foco em aprendizado de persistência de dados utilizando Spring Data JPA e MySQL.

O projeto foi criado para praticar conceitos fundamentais de APIs REST, organização em camadas e integração com banco de dados relacional.

## Tecnologias utilizadas

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Maven

## Funcionalidades

* Cadastro de usuários
* Persistência de dados com JPA
* Integração com banco MySQL
* Estruturação em arquitetura em camadas

## Arquitetura do projeto

A aplicação foi organizada utilizando separação de responsabilidades:

* `Controller` — gerenciamento dos endpoints HTTP
* `Service` — regras de negócio
* `Repository` — comunicação com banco de dados
* `Entity` — modelagem das entidades
* `DTO` — transferência de dados entre requisição e resposta

## Estrutura principal

* `UserController` — definição dos endpoints REST
* `UserService` — lógica da aplicação
* `UserRepository` — persistência de dados com JPA
* `User` — entidade de usuário
* `RegisterDto` — entrada de dados da requisição

## Objetivos de aprendizado

Este projeto foi desenvolvido para aprofundar conhecimentos em:

* Spring Boot MVC
* Desenvolvimento de APIs REST
* Spring Data JPA
* Integração com banco de dados
* Injeção de dependências
* Organização de aplicações backend
* Modelagem de entidades em Java

## Próximas melhorias

* Implementação de validações
* Tratamento global de exceções
* Criptografia de senhas
* Autenticação com Spring Security
* Documentação com Swagger/OpenAPI
* Padronização das respostas JSON

## Autor

Desenvolvido por Marcos Vinícius Momenté.
