# NaoPago

[![Número de Linguagens](https://img.shields.io/github/languages/count/mvmomente/NaoPago)]
[![Linguagem Principal](https://img.shields.io/github/languages/top/mvmomente/NaoPago)]
[![Tamanho do Repositório](https://img.shields.io/github/repo-size/mvmomente/NaoPago)]
[![Último Commit](https://img.shields.io/github/last-commit/mvmomente/NaoPago)]

## API simples de criação de usuario incluindo em banco de dados

Bem-vindo(a)! 👋 Este projeto é um pequeno estudo em Spring Boot para entender a criação de uma API REST integrada com Banco de Dados.

A ideia principal é aprender a estrutura da dependendicia JPA, sendo projetado em camadas `Controller`, `Service`, `Repository`, `Entity` e `DTO`.

## O que este projeto faz

* Cria contas com nome, senha e email
* Utiliza JPA integrado com MySql

## Como funciona

* `UserController` define os endpoints HTTP
* `UserService` contém a lógica de negócio
* `UserRepository` armazena as contas em banco de dados
* `User` representa a entidade do usuario
* `RegisterDto` é usado para entrada de dados

## Objetivo do projeto

Este repositório é um exercício de aprendizado para explorar:

* Spring Boot MVC
* Injeção de dependências
* Endpoints REST simples
* Modelos de dados com `record` e classes Java
* Salvar dados em um banco

## Próximos passos

* Evoluir para um banco de dados robusto

## Obrigado

Este projeto é um rabisco de aprendizado com Spring focado em JPA.
