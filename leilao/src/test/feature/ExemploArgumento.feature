#language: pt
@pt
Funcionalidade: Autenticação com argumentos

  Esquema do Cenário: Login
    Dado O utilizador esta na página de autenticação
    Quando Insere o username "userargumento" e password "passargumento" submete
    Então É apresentada a Dashboard da aplicação