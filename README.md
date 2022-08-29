# Desafio validador de senha

Desafio proposto pelo processo seletivo Itaú. Trata-se de um REST API para validação de senha considerando os seguintes critérios:
- Nove ou mais caracteres
- Ao menos 1 dígito
- Ao menos 1 letra minúscula
- Ao menos 1 letra maiúscula
- Ao menos 1 caractere especial
  - Considere como especial os seguintes caracteres: !@#$%^&*()-+
- Não possuir caracteres repetidos dentro do conjunto
- Não deve possuir espaços em branco

## A solução

Foi desenvolvida uma aplicação Java com Framework Spring Boot que disponibiliza um endpoint para a verificação da senha ("/password/isValid").
A aplicação está dividida em 2 partes: Controller e Service. No Controller (com.itidigital.backendChallenge.controller.PasswordController) é recebida a requisição que será tratada pela camada de serviço (composta pelas classes do pacote com.itidigital.backendChallenge.service).

Na camada service, temos a classe principal responsável por chamar os validadores (com.itidigital.backendChallenge.service.PasswordService) e os validadores específicos de cada uma das regras impostas (com.itidigital.backendChallenge.service.validators).

O objetivo desta divisão foi reduzir o aclopamento possibilitanto a reutilização dos códigos verificadores em outras áreas do código no futuro. Além disso, numa possível manutenção futura, torna-se mais fácil acessar diretamente a parte do código responsável por uma determinada regra.

## Testando a aplicação
### Pré-requisitos
- Java 8 ou superior
- Maven (utilizado no build do projeto)

### Buildando a aplicação
Na raiz do projeto, deve-se executar o comando "mvn clean install". Este comando realiza os testes initários e cria a .jar da aplicação.

### Subindo a API
Agora que geramos o .jar usado na execução, vamos entrar na página target com o comando "cd target" e executar o comando "java -jar backendChallenge-0.0.1-SNAPSHOT.jar"

A partir deste momento, nossa aplicação já está disponpivel na porta 8080.

### Exemplo de requisição

GET: localhost:8080/password/isValid

Body da reqisição:
{
    "password":"AbTp9!fok"
}
