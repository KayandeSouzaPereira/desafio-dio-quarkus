# Desafio do Quarkus Framework

Este e um projeto de api com o tema de desafio de Quarkus.

Para o projeto foi empregado o uso de diversas tecnologias baseadas no framework, microserviços em nuvem, ferramentas de analise dos serviços, 2 tipos de bancos de dados e Arquitetura cebola. 

### Ideia do projeto

Um serviço para eleições que fornece:
- Listagem de candidatos.
- Busca de candidatos por Id.
- Busca paginada de candidatos.
- Remoção de candidatos.
- Atualização de candidatos.
- Listagem de eleições.
- Inicio de uma eleição.
- Checagem do Status da eleição.
- Envio de voto para um candidato na eleição.
## Stack utilizada

- Java
- Springboot
- Quarkus
- MariaDB
- Redis
- Traefik
- Docker


## Instalação local

Utilização do Projeto em sua maquina local.

- E necessario uma configuração de variavel de ambiente JAVA de jdk17 ou maior.
- Ter o [Docker](https://www.docker.com/products/docker-desktop/) instalado na maquina.
- Caso não tenha o [Quarkus](https://pt.quarkus.io/get-started/) instalado, siga o passo-a-passo no link


Para rodar o projeto como dev utilize:
```bash

  quarkus dev
  
```

Para rodar o projeto no ambiente de container utilize:
```bash

  ./cicd-build.sh result-app
  ./cicd-build.sh voting-app
  ./cicd-build.sh election-management

  ./cicd-blue-green-deployment.sh result-app
  ./cicd-blue-green-deployment.sh voting-app
  ./cicd-blue-green-deployment.sh election-management
  
```
## Documentação

A documentação Swagger pode ser encontrada ao iniciar o projeto como dev pelo endpoint `/q/swagger-ui`.


## Adicionais

Alguns elementos foram adicionados ao projeto, o termino da implementação de CRUD nas requisições de candidatos com os itens de DELETE e GET com paginação. 
Além também foram adicionados os seguintes elementos:

[ADR](https://github.com/KayandeSouzaPereira/desafio-dio-quarkus/blob/e51a2b0b0ab81c527ab6bfc7f78dbe678093ac09/ADR-Desafio-Dio-Quarks.pdf) - Architecture Decision Record. 

[Threat Modeling](https://github.com/KayandeSouzaPereira/desafio-dio-quarkus/blob/e51a2b0b0ab81c527ab6bfc7f78dbe678093ac09/Modelagem-de-Ameacas.pdf) - Modelagem de Ameaças.
## Autores

- [@kayandesouza](https://github.com/KayandeSouzaPereira) Desenvolvedor do App

