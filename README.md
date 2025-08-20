# 📚 FórumHub - Challenge Back End

![Java](https://img.shields.io/badge/Java-17-orange?logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green?logo=springboot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build-red?logo=apachemaven&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue?logo=mysql&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-Security-purple?logo=jsonwebtokens&logoColor=white)

Bem-vindo ao **FórumHub**, um projeto desenvolvido como parte do **Challenge Back End** da Alura.  
O objetivo é replicar o funcionamento de um fórum no nível de **back end**, criando uma **API REST** com operações de **CRUD** para gerenciamento de tópicos.

---

## 🚀 Descrição

Um fórum é um espaço onde os participantes de uma plataforma podem interagir, colocando perguntas e respostas sobre diferentes assuntos.  
No FórumHub, construímos a API responsável por tratar os dados desse ambiente, armazenando e relacionando:

- Tópicos  
- Usuários  
- Respostas  

Nosso foco é o **desenvolvimento back end**, explorando conceitos de **persistência, autenticação e boas práticas REST**.

---

## 📌 Funcionalidades

A API implementa operações de **CRUD** para tópicos:

- ✅ Criar um novo tópico  
- ✅ Listar todos os tópicos  
- ✅ Consultar um tópico específico  
- ✅ Atualizar um tópico existente  
- ✅ Deletar um tópico  

Além disso:  
- ✔️ Autenticação e autorização de usuários  
- ✔️ Validações conforme regras de negócio  
- ✔️ Banco de dados relacional para persistência  

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+**  
- **Spring Boot** (Web, Security, Data JPA)  
- **Maven**  
- **Hibernate**  
- **Banco de Dados Relacional** (MySQL ou PostgreSQL)  
- **JWT** para autenticação  

---

## 📂 Estrutura do Projeto

src/main/java/com/forumhub
┣ 📂 controller # Controladores REST
┣ 📂 model # Entidades do domínio
┣ 📂 repository # Interfaces JPA
┣ 📂 service # Regras de negócio
┗ 📂 config # Configurações (segurança, etc.)


---

## ⚙️ Pré-requisitos

Antes de rodar a aplicação, você precisa ter instalado:

- [Java 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)  
- [Maven](https://maven.apache.org/)  
- [MySQL](https://dev.mysql.com/downloads/) ou [PostgreSQL](https://www.postgresql.org/download/)  

---

## ▶️ Como Executar o Projeto

1. Clone este repositório:  
   ```bash
   git clone https://github.com/seu-usuario/forumhub.git
   ```
2. Entre no diretório do projeto:
```bash
  cd forumhub
```

3. Configure o banco de dados no arquivo application.properties ou application.yml.

4. Rode a aplicação com o Maven:
```bash
mvn spring-boot:run
```

5. A API estará disponível em:
```arduino
http://localhost:8080
```
### 📮 Endpoints Principais

POST /topicos → Criar tópico

GET /topicos → Listar todos os tópicos

GET /topicos/{id} → Buscar tópico por ID

PUT /topicos/{id} → Atualizar tópico

DELETE /topicos/{id} → Deletar tópico

---
### 🔐 Autenticação

O projeto utiliza JWT (JSON Web Token) para autenticação e autorização.
Para acessar as rotas protegidas:

1. Crie/registre um usuário.

2. Faça login para receber o token JWT.

3. Envie o token no header da requisição:

```makefile
Authorization: Bearer <seu_token_aqui>
```
### 📖 Aprendizados

Neste projeto, foram aplicados conceitos de:

Desenvolvimento de API RESTful com Spring Boot

CRUD completo (Create, Read, Update, Delete)

Persistência de dados com JPA/Hibernate

Validações de dados com Bean Validation

Autenticação e autorização com Spring Security + JWT

Boas práticas de organização de código

### 📝 Licença

Este projeto foi desenvolvido para fins de estudo no Challenge Back End da Alura.
Sinta-se à vontade para usar como referência!



