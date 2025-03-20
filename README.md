# Projeto MongoDB com Spring Boot

## Descrição
Este projeto é uma aplicação Java utilizando Spring Boot e MongoDB. O objetivo é demonstrar as principais diferenças entre paradigmas orientados a documentos e relacionais, além de implementar operações CRUD e associações entre objetos.

## Objetivos
- Compreender as diferenças entre bancos de dados orientados a documentos e relacionais
- Implementar operações de CRUD
- Refletir sobre decisões de design para um banco de dados orientado a documentos
- Implementar associações entre objetos (aninhados e referenciados)
- Realizar consultas com Spring Data e MongoRepository

## Tecnologias Utilizadas
- Java
- Spring Boot
- MongoDB
- Spring Data MongoDB

## Configuração do Ambiente
### Instalação do MongoDB
#### Windows
1. Acesse [MongoDB Community Server](https://www.mongodb.com/try/download/community)
2. Baixe e instale a versão completa
3. Configure o ambiente:
   - Crie a pasta `C:\data\db`
   - Adicione `C:\Program Files\MongoDB\Server\<versão>\bin` ao PATH
4. Teste no terminal executando `mongod`

#### macOS
1. Instale o Homebrew ([brew.sh](https://brew.sh))
2. Execute `brew install mongodb`
3. Crie e configure a pasta `/data/db`:
   ```sh
   sudo mkdir -p /data/db
   sudo chown -Rv $(whoami) /data/db
   ```
4. Teste no terminal executando `mongod`

### Configuração do Projeto
1. Clone o repositório:
   ```sh
   git clone <URL_DO_REPOSITORIO>
   cd <NOME_DO_PROJETO>
   ```
2. Configure o MongoDB no `application.properties`:
   ```properties
   spring.data.mongodb.uri=mongodb://localhost:27017/workshop_mongo
   ```
3. Compile e execute o projeto:
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

## Estrutura do Projeto
```
project-root/
├── src/
│   ├── main/
│   │   ├── java/com/example/
│   │   │   ├── domain/        # Entidades
│   │   │   ├── dto/           # Data Transfer Objects
│   │   │   ├── repository/    # Repositórios MongoDB
│   │   │   ├── service/       # Serviços
│   │   │   ├── resource/      # Controllers REST
│   │   │   ├── config/        # Configuração e inicialização do banco
├── pom.xml                    # Dependências do projeto
└── README.md                   # Documentação
```

## Endpoints Disponíveis
### Usuários
- **GET /users** - Lista todos os usuários
- **GET /users/{id}** - Retorna um usuário pelo ID
- **POST /users** - Insere um novo usuário
- **DELETE /users/{id}** - Remove um usuário
- **PUT /users/{id}** - Atualiza um usuário

### Posts
- **GET /posts/{id}** - Obtém um post por ID
- **GET /users/{id}/posts** - Lista os posts de um usuário

## Contato
Para mais informações, consulte a documentação do Spring Boot e MongoDB nos links abaixo:
- [Spring Boot Reference](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [MongoDB Manual](https://www.mongodb.com/docs/manual/)

