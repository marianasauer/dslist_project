# dslist_project

# DSList - Backend

DSList é uma aplicação de backend construída durante o Intensivão Java Spring, um evento organizado pela DevSuperior.

A aplicação é uma pesquisa de jogos que permite aos usuários encontrar informações sobre diferentes jogos. Os usuários podem realizar buscas com base no gênero e classificação dos jogos. A aplicação também possui um endpoint especial que permite a ordenação personalizada da lista de jogos.

## Modelo Conceitual
![dslist-model](https://github.com/marianasauer/dslist_project/assets/105138712/7e3d670b-a5cf-4b84-8379-5276d7b68fc0)

## Endpoints
- GET /games: Recupera a lista de jogos.
- GET /games/{id}: Recupera um jogo pelo seu ID.
- GET /games/lists: Recupera as categorias das listas de jogos.
- GET /games/lists/{id}: Recupera uma lista pelo seu ID, mostrando os jogos dentro dessa categoria.
- POST /lists/replacement: Organiza a lista de acordo com a preferência do usuário.

## Resposta da API
![<img width="671" alt="id" src="https://github.com/marianasauer/dslist_project/assets/105138712/d130dff8-082b-4126-bcfc-1b6b5d3b4bf6">)

## Tecnologias Utilizadas
### Backend
- Java
- Spring Boot
- H2 Console
- JPA / Hibernate
- Maven

## Implantação em Produção
- Banco de Dados: PostgreSQL

## Como Executar o Projeto
Pré-requisitos: Java 17

# Clonar o repositório
git clone https://github.com/marianasauer/dslist_project

# Acessar a pasta do projeto de backend
cd dslist-backend

# Executar o projeto
./mvnw spring-boot:run

## Autor
[Mariana Sauer]
