# API de Produtos

API REST desenvolvida em Java com Spring Boot para gerenciamento de produtos.

O projeto foi desenvolvido como parte dos meus estudos em desenvolvimento Backend, com foco na construção de APIs REST, operações CRUD, persistência de dados com JPA/Hibernate, integração com banco de dados e containerização da aplicação com Docker.

## Tecnologias utilizadas

- Java 25
- Spring Boot 4.1.1
- Spring Web
- Spring Data JPA
- Hibernate
- Banco de dados H2
- Maven
- Docker
- Git
- GitHub

## Funcionalidades

A API permite:

- Criar produtos
- Buscar produto por ID
- Atualizar produtos
- Excluir produtos
- Buscar produtos pelo nome
- Persistir produtos utilizando JPA/Hibernate
- Gerar IDs utilizando UUID
- Executar a aplicação em um container Docker

## Estrutura do projeto

```text
src/
├── main/
│   ├── java/
│   │   └── com/github/kaique_dutra/productapi/
│   │       ├── controller/
│   │       │   └── ProductController.java
│   │       │
│   │       ├── model/
│   │       │   └── Product.java
│   │       │
│   │       ├── repository/
│   │       │   └── ProductRepository.java
│   │       │
│   │       └── ProductapiApplication.java
│   │
│   └── resources/
│       ├── application.yml
│       └── data.sql
│
└── test/
    └── java/
Modelo de Produto

Cada produto possui os seguintes atributos:

Campo	Tipo	Descrição
id	String	Identificador único gerado com UUID
name	String	Nome do produto
description	String	Descrição do produto
price	Double	Preço do produto
Endpoints
Criar produto

POST /products

Exemplo de requisição:

{
  "name": "Notebook",
  "description": "Notebook para desenvolvimento",
  "price": 3500.00
}
Buscar produto por ID

GET /products/{id}

Exemplo:

GET /products/550e8400-e29b-41d4-a716-446655440000
Atualizar produto

PUT /products/{id}

Exemplo:

PUT /products/550e8400-e29b-41d4-a716-446655440000

Corpo da requisição:

{
  "name": "Notebook Gamer",
  "description": "Notebook atualizado",
  "price": 4500.00
}
Excluir produto

DELETE /products/{id}

Exemplo:

DELETE /products/550e8400-e29b-41d4-a716-446655440000
Buscar produto por nome

GET /products/search?name={name}

Exemplo:

GET /products/search?name=Notebook

O endpoint utiliza o parâmetro obrigatório name para realizar a busca.

Banco de dados

Atualmente, o projeto utiliza o banco de dados H2 em memória para persistência dos dados durante o desenvolvimento.

A configuração do banco está localizada em:

src/main/resources/application.yml

O projeto também possui um arquivo data.sql para inserção de dados iniciais.

Docker

A aplicação também foi containerizada utilizando Docker.

O projeto possui um Dockerfile responsável por criar a imagem da aplicação e executar o projeto dentro de um container.

Construir a imagem

Na raiz do projeto, execute:

docker build -t productapi .
Executar o container
docker run -p 8080:8080 productapi

Após iniciar o container, a aplicação estará disponível em:

http://localhost:8080

Os endpoints da API podem ser acessados normalmente através do container.

Exemplo:

GET http://localhost:8080/products/{id}
Verificar o container

Para verificar os containers em execução:

docker ps

A aplicação deverá aparecer com a porta:

0.0.0.0:8080->8080/tcp
Docker Compose

O projeto também possui um arquivo compose.yaml, permitindo executar os serviços definidos no projeto utilizando Docker Compose.

Para iniciar os serviços:

docker compose up

Para executar em segundo plano:

docker compose up -d

Para parar os serviços:

docker compose down
Como executar localmente
Pré-requisitos
Java 25
Git
Docker (opcional, caso queira executar a aplicação em container)

O projeto possui Maven Wrapper, portanto não é necessário instalar o Maven separadamente.

Clonar o projeto
git clone git@github.com:ccbkaique-droid/product-api.git
Entrar na pasta
cd product-api
Executar a aplicação
Windows
.\mvnw.cmd spring-boot:run
Linux/macOS
./mvnw spring-boot:run

A API estará disponível em:

http://localhost:8080
Testes

Para executar os testes automatizados:

Windows
.\mvnw.cmd test
Linux/macOS
./mvnw test
Conceitos praticados

Durante o desenvolvimento deste projeto foram praticados conceitos como:

Desenvolvimento de APIs REST
Métodos HTTP
Spring Boot
Spring Web
Controllers
Mapeamento de requisições
Request Body
Path Variables
Request Parameters
CRUD
Spring Data JPA
JPA/Hibernate
Entidades
Repositórios
Persistência de dados
UUID
Banco de dados H2
Maven
Docker
Dockerfile
Docker Compose
Containerização de aplicações
Git
GitHub
Objetivo

Este projeto faz parte do meu processo de aprendizado em desenvolvimento Backend com Java e Spring Boot.

O objetivo é praticar, de forma progressiva, a construção de APIs REST, implementação de operações CRUD, persistência de dados, integração com banco de dados e utilização de Docker para containerização da aplicação.

Próximos passos

Algumas melhorias planejadas para o projeto:

Substituir o banco H2 por PostgreSQL
Configurar PostgreSQL utilizando Docker
Integrar o projeto com pgAdmin
Melhorar o tratamento de exceções
Implementar validação dos dados recebidos
Criar testes automatizados para os endpoints
Documentar a API com Swagger/OpenAPI
Autor

Kaique Faria Dutra

GitHub: kaique-dutra
