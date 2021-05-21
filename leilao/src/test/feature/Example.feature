@en
Feature: Autenticacao

  Scenario: Login
    Given O utilizador esta na página de autenticação
    When Insere os dados e submete
    Then É apresentada a Dashboard da aplicação