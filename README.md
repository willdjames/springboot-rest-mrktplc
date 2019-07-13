# springboot-rest-mrktplc
Serviço de registro de compra e encaminhamento de pagamento

* Implementações:
- [ ] POST /compras | body:{cdCliente, cdCompra, valorCompra}
- [ ] GET /clientes/{id}/compras | das compras do cliente
- [ ] Console do H2
- [ ] ORM do banco de dados e inserts
- [ ] MDB (Produtor) do envio da compra para fila de pagamento
- [ ] MDB (Consumidor) do recebimento do pagamento
- [ ] Atualização do pagamento da compra no BD
