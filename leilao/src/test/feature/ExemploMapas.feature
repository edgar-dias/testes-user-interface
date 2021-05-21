#language: pt
@pt
Funcionalidade: Autenticação com mapas

  Cenário: Login
    Dado O utilizador esta na página de autenticação
    Quando Insere o username e password de um mapa e submete
      | username | Pedro  |
      | password | xxxio  |
      | idade    |     20 |
      | morada   | Lisboa |
    Então É apresentada a Dashboard da aplicação
