# Sistema de Gestão de Usuários e Posts NoSQL

## 📖 Introdução
Este projeto é uma aplicação desenvolvida com Java Spring Boot no MongoDB. O sistema permite a realização de operações CRUD (Criar, Ler, Atualizar e Excluir) para gerenciar informações de **Usuários** e **Posts**. Além disso, o sistema fornece funcionalidades para buscar posts com base em título e realizar uma pesquisa avançada de posts filtrados por data.

## 💻 Tecnologias Utilizadas
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring Boot](https://img.shields.io/badge/spring%20boot-6DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![Postman](https://img.shields.io/badge/postman-FF6C37.svg?style=for-the-badge&logo=postman&logoColor=white) ![MongoDB](https://img.shields.io/badge/mongodb-%232F8A53.svg?style=for-the-badge&logo=mongodb&logoColor=white)

### Funcionalidades
- **CRUD de Usuários:** Adicionar, visualizar, atualizar e remover usuários.
- **CRUD de Posts:** Gerenciar posts com informações como título, conteúdo e data de criação.
- **Pesquisa de Posts:** Buscar posts pelo título.
- **Busca Completa de Posts:** Realizar pesquisa avançada de posts, filtrando por texto e datas (mínima e máxima).
- **Teste de API:** Usar o Postman para interagir com as APIs de forma fácil e eficiente.

## Como Configurar e Executar
Para configurar e executar o projeto:

1. **Configurar o Ambiente:**
   - Instale o [Spring Tool Suite (STS)](https://spring.io/tools) (ou use sua IDE favorita).
   - Clone o repositório do projeto em sua máquina local.

2. **Configurar o Banco de Dados:**
   - O projeto utiliza o **MongoDB** para o armazenamento de usuários e posts. Certifique-se de ter o MongoDB rodando localmente ou use um serviço em nuvem.
   - As configurações do MongoDB estão definidas no arquivo `application.properties`.

3. **Executar o Projeto:**
   - Abra o projeto no STS.
   - Execute a classe principal do Spring Boot (`Application.java`).
   - Use o Postman para interagir com as APIs.

### Telas do Sistema
Aqui estão algumas telas principais do sistema:

- **Interação com a API usando Postman:**
  ![postmanPosts](https://github.com/user-attachments/assets/665cd93a-bd32-4c5c-870e-71c13838c1e8)
  ![postmanUsers](https://github.com/user-attachments/assets/9347ddb1-128b-43ce-b776-7226a996d250)


- **Console MongoDB:**
  ![mongo](https://github.com/user-attachments/assets/d6d66d65-c821-4e59-9ff3-8e578c80b622)


## 🛠️ API Endpoints

### **Usuários:**
- `GET /users` - Lista todos os usuários.
- `POST /users` - Cria um novo usuário.
- `PUT /users/{id}` - Atualiza um usuário existente.
- `DELETE /users/{id}` - Remove um usuário.

### **Posts:**
- `GET /posts` - Lista todos os posts.
- `POST /posts` - Cria um novo post.
- `PUT /posts/{id}` - Atualiza um post existente.
- `DELETE /posts/{id}` - Remove um post.

### **Pesquisas de Posts:**
- `GET /posts/titlesearch?text=` - Pesquisa posts pelo título.
- `GET /posts/fullsearch?text=` - Pesquisa avançada de posts por texto e data (mínima e máxima).


