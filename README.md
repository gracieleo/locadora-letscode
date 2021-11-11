<h1 align="center">Locadora Let's Code</h1>

### Projeto final do curso de Java 

🚀 Crie um projeto em grupo usando as principais temáticas abordadas ao longo dos módulos.



- Orientação a Objetos (siga os princípios de classes, objetos, encapsulamento, separação de responsabilidade, abstração e convenções de código);
- Spring web (crie endpoints Rest e documente-os com Swagger);
- Banco de Dados (defina um modelo de dados consistente com sua aplicação).

Desejáveis:
- Páginas web dinâmicas (frontend) acessando o backend da aplicação através de @Controllers. Sugestão: use Thymeleaf.
Scripts de inicialização dos dados: defina um arquivo data.sql para realizar os inserts iniciais da aplicação.




```bash

# Para clonar este repositório:
$ git clone <https://github.com/gracieleo/locadora-letscode.git>

```

### 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [IDE Intellij](https://www.jetbrains.com/pt-br/idea/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [H2 Database]()
- [Swagger](https://swagger.io/)
- [4Devs](https://www.4devs.com.br/gerador_de_cpf) (gerador de cpf) 


### 📑 Documentação da aplicação, utilize a URL: 

http://localhost:8080/swagger-ui/index.html 

Como a documentação está com modo de segurança ativado, através das depencias do spring-boot-starter-security será necessário:

```bash
usuário:user
senha:password
```




### ☑️ API Rest para testes

```bash

rota: http://localhost:8080

```

Requisições GET: 
```bash
/clientes   		retorna lista de todos os clientes
/clientes/{id}  	retorna cliente com o id 
/locacao		retorna lista de todos as locações 
/locacao/{id}		retorna locação com o id 
/filmes			retorna lista de todos os filmes
/filmes/{codigoFilme}	retorna lista de filmes por código
/filmes/{categoria}	retorna lista de filmes por categoria

```
Requisições POST: 
```bash
/clientes/salvar  	salva dados de um cliente novo
/locacao/salvar		salva dados de uma locação nova
/filmes/salvar		salva dados de um novo filme

```
Requisições PUT: 
```bash
/clientes/{id} 		atualiza dados de um cliente 

```
Requisições DELETE: 
```bash
/clientes/{id} 		exclui dados de um cliente 

```

