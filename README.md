# springboot-rest-mrktplc
Serviço de registro de compra e encaminhamento de pagamento

* Implementações:
- [X] Criar projeto no spring initializr
- [X] POST /compras | body:{cdCliente, cdCompra, valorCompra}
- [ ] GET /clientes/{id}/compras | das compras do cliente
- [ ] Console do H2
- [ ] ORM do banco de dados e inserts
- [ ] MDB (Produtor) do envio da compra para fila de pagamento
- [ ] MDB (Consumidor) do recebimento do pagamento
- [ ] Atualização do pagamento da compra no BD


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
