# sgv
Sistema Gerenciador de Vendas
Sistema-exemplo para os alunos da disciplina de Programação Orientada a Objetos em Java.

1- Desinstale qualquer jdk existente;
1- Instale a JDK da Oracle (java 17)
2- Instale o NetBeans
3- Clone o projeto
    a- Clique em: Team -> Git -> Clone...
    b- coloque o seguinte endereço: https://github.com/pablorangel82/sgv.git. Não é necessário usuario e senha;
    c- finish

4- Clique com o botão direito sobre o projeto. Clique em "build project"
5- Agora, clique com o botão direito sobre o projeto. Clique em "Run"
6- Abra o navegador. Escreva o endereço: https://localhost:8443/h2-console
7- Coloque no campo JDBC URL: jdbc:h2:~/db
8- Coloque no campo user: sgv
9- Coloque no campo password: 123  
10- Cole o seguinte comando na caixa de comandos: 

insert into Usuario (login,senha, papel, id) values
('admin','$2a$10$K6PG.YUsSpMT/LOyPpeB5eUVdPImfDfSH.N0xLHAC1NbgbIBhraHe','ADMIN',1);

11- Clique no botão run (botão verde);

12- No navegador, escreva o endereço: https://localhost:8443/.
13- Logue com o usuario admin e senha 123
14- Pronto! Sistema configurado!
