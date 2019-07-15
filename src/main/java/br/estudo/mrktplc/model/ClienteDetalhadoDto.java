package br.estudo.mrktplc.model;

import br.estudo.mrktplc.model.orm.Cliente;

import java.util.List;

public class ClienteDetalhadoDto {

    private String documento;

    private List<CompraDto> compras;

    public ClienteDetalhadoDto(Cliente clienteDetalhado) {
        documento = clienteDetalhado.getDocumento();
        compras = CompraDto.getCompras(clienteDetalhado.getCompras());
    }

    public String getDocumento() {
        return documento;
    }

    public List<CompraDto> getCompras() {
        return compras;
    }
}
