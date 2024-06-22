![image](https://github.com/rodrigo0oliveira/desafio-oaktecnologia/assets/170271521/5d046698-a0e0-4c21-babe-85cda8a39df6)

# Desafio Oak Tecnologia
Esse repositório refere-se ao desafio de programação da Oak Tecnologia onde era necessário criar um código de cadastro e listagem de produtos.

# Tecnolgias utilizadas
* Java 17
* Spring Web
* Spring Data JPA
* Banco de dados H2
* Postman para realizar requisições HTTP.
* Swagger para docummentação da API.

# Funcionalidades da API
Após estar utilizando o projeto com as instruções de como utilizar, acesse a documentação swagger para uma melhor visualização -> http://localhost:8080/swagger/index.html
* GET- Retorna todos os produtos existentes.
* POST - Inseri um novo produto.
* GET - Retorna um produto buscado por id.
* DELETE - Deleta um produto por id.

* Observação : No desafio não foi pedido as funcionalidades de buscar e deletar um produto por id,mas considerei como métodos que agregariam a aplicação.

# Como utilizar e testar a API localmente:
* O projeto foi desenvolvido em um ambiente Linux Debian 11 e usando a IDE Spring Tools Suite,mas caso esteja em outro sistema operacional ou IDE não terá problemas.
# Requisitos necessários:
* JDK 17 ou superior.
* Maven
* Git
* Alguma IDE, por exemplo : STS,Eclipse ,Intellij,etc.

# Clonando e executando na IDE Spring Tools Suite
Abra um terminal e execute o seguinte comando:
* 1 -  Clone o repositório -> git clone https://github.com/rodrigo0oliveira/desafio-OakTecnologia.git
  
* 2 -  Importe o projeto para o Spring Tools Suite (STS):
* Abra o STS.
* Vá para File > Import > Maven > Existing Maven Projects.
* Selecione o diretório onde o projeto foi clonado (nome-do-repositorio) e clique em Finish.

* 3- Atualize o projeto Maven:
* Clique com o botão direito no projeto na aba Package Explorer.
* Selecione Maven > Update Project... e marque Force Update of Snapshots/Releases. Clique em OK.

* 4 - Execute o projeto:
* Clique com o botão direito no projeto na aba Package Explorer.
* Selecione Run As > Spring Boot App.

* Se tudo estiver configurado corretamente, você verá a aplicação rodando no console do STS e poderá acessá-la em http://localhost:8080

# Contribuição 
Se você gostaria de contribuir com este projeto ou indicar melhorias, por favor siga os passos abaixo:
* Faça um fork do projeto
* Crie uma branch para sua feature (git checkout -b feature/nova-feature)
* Commit suas alterações (git commit -m 'Adiciona nova feature')
* Envie para a branch (git push origin feature/nova-feature)
* Abra um Pull Request

# Contato 

Rodrigo Lucas - rodrigo.coelho@maisunifacisa.com.br
