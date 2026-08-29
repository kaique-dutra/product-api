Product API 

API REST desenvolvida em Java com Spring Boot para gerenciamento de produtos.

O projeto foi desenvolvido como parte dos meus estudos em desenvolvimento Backend, com foco na construção de APIs REST, operações CRUD, persistência de dados com JPA e integração com banco de dados.

 Tecnologias

* Java 25
* Spring Boot 4.1.1
* Spring Web
* Spring Data JPA
* Hibernate
* H2 Database
* Maven
* Git & GitHub

 Funcionalidades

A API permite:

*  Criar produtos
*  Buscar produto por ID
*  Atualizar produtos
*  Excluir produtos
*  Buscar produtos pelo nome
*  Persistir produtos utilizando JPA/Hibernate
*  Gerar IDs utilizando UUID

 Estrutura do projeto

```text
src/
├── main/
│   ├── java/
│   │   └── com/github/ccbkaique_droid/productapi/
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
```

 Modelo Product

Cada produto possui os seguintes atributos:

| Campo         | Tipo   | Descrição                           |
| ------------- | ------ | ----------------------------------- |
| `id`          | String | Identificador único gerado com UUID |
| `name`        | String | Nome do produto                     |
| `description` | String | Descrição do produto                |
| `price`       | Double | Preço do produto                    |

 Endpoints

 Criar produto

POST `/products`

Exemplo:

```json
{
  "name": "Notebook",
  "description": "Notebook para desenvolvimento",
  "price": 3500.00
}
```

Buscar produto por ID

GET `/products/{id}`

Exemplo:

```text
GET /products/550e8400-e29b-41d4-a716-446655440000
```

 Atualizar produto

PUT `/products/{id}`

Exemplo:

```text
PUT /products/550e8400-e29b-41d4-a716-446655440000
```

Body:

```json
{
  "name": "Notebook Gamer",
  "description": "Notebook atualizado",
  "price": 4500.00
}
```

Excluir produto

DELETE `/products/{id}`

Exemplo:

```text
DELETE /products/550e8400-e29b-41d4-a716-446655440000
```

Buscar produto por nome

GET `/products/search?name={name}`

Exemplo:

```text
GET /products/search?name=Notebook
```

O endpoint utiliza o parâmetro obrigatório `name` para realizar a busca.

 Banco de dados

O projeto utiliza o H2 Database para persistência dos dados durante o desenvolvimento.

A configuração do banco está localizada em:

```text
src/main/resources/application.yml
```

O projeto também possui um arquivo `data.sql` para inserção de dados iniciais.

 Como executar

 Pré-requisitos

* Java 25
* Git

O projeto possui Maven Wrapper, portanto não é necessário instalar o Maven separadamente.

 Clone o repositório

```bash
git clone git@github.com:ccbkaique-droid/product-api.git
```

Entre na pasta:

```bash
cd product-api
```

 Execute a aplicação

No Windows:

```bash
.\mvnw.cmd spring-boot:run
```

No Linux/macOS:

```bash
./mvnw spring-boot:run
```

A API estará disponível em:

```text
http://localhost:8080
```

 Testes

Para executar os testes automatizados:

 Windows

```bash
.\mvnw.cmd test
```

Linux/macOS

```bash
./mvnw test
```

Conceitos praticados

Durante o desenvolvimento deste projeto foram praticados conceitos como:

* APIs REST
* HTTP Methods
* Spring Boot
* Spring Web
* Controllers
* Request Mapping
* Request Body
* Path Variables
* Request Parameters
* CRUD
* Spring Data JPA
* JPA/Hibernate
* Entidades
* Repositories
* Persistência de dados
* UUID
* Banco de dados H2
* Maven
* Git
* GitHub

Objetivo

Este projeto faz parte do meu processo de aprendizado em desenvolvimento Backend com Java e Spring Boot, servindo como prática para construção de APIs REST e integração com banco de dados.

  Autor
Kaique Faria Dutra

GitHub: [ccbkaique-droid](https://github.com/ccbkaique-droid)
