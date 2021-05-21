#language: pt
@pt
Funcionalidade: Autenticação com esquema

  Esquema do Cenário: Login
    Dado O utilizador esta na página de autenticação
    Quando Insere o username "<username>" e password "<password>" submete
    Então É apresentada a Dashboard da aplicação

    Exemplos: 
      | username | password |
      | Pedro    | xxxio    |
      | Afonso   | 19jd     |
      | Diogo    | 94yh     |
