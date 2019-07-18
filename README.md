# springboot-rest-mrktplc
Serviço de registro de compra e encaminhamento de pagamento

* Implementações:
- [X] Criar projeto no spring initializr
- [X] POST /compras | body:{docCliente, valorCompra}
- [X] GET /clientes | listar todos clientes
- [X] GET /clientes/{id}/compras | das compras do cliente
- [X] POST /pagamentos | body:{docCliente, cdCompra, valorCompra} efetua pagamento da compra
- [X] Console do H2
- [X] ORM do banco de dados e inserts
- [X] Persistencia da compra
- [X] MDB (Produtor) do envio da compra para fila de pagamento
- [ ] MDB (Consumidor) do recebimento do pagamento
- [ ] Atualização do pagamento da compra no BD
- [ ] Empacotar em container Docker

* Para executar a aplicação com Maven Plugin:
    > $ mvnw spring-boot:run

* Ou se você ja empacotou com o maven, pode executar usando java -jar:
    > $ java -jar target/mrktplc-1.0-SNAPSHOT.jar

* Para o serviço /pagametos é preciso, (e recomendo) ter um container Docker de uma imagem de RabbitMQ em execução.
  Execute para baixar a imagem e iniciar um container:
    > $ docker run -d --hostname my-rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3-management

  Faça o login no painel admin do rabbitMQ: http://container-ip:15672
    usuario:guest / senha:guest

  Crie uma fila com nome 'fila_processo_pagamento' ou que seja o mesmo que a variável do application.properties fila.processo.pagamento



### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
