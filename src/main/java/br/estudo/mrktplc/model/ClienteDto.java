package br.estudo.mrktplc.model;

import br.estudo.mrktplc.model.orm.Cliente;

import java.util.List;
import java.util.stream.Collectors;

public class ClienteDto {

    private Integer codigo;

    private String documento;

    public ClienteDto(Cliente cliente) {
        codigo = cliente.getCodigo();
        documento = cliente.getDocumento();
    }

    public static List<ClienteDto> getTodosClientes(List<Cliente> todosClientes) {
        return todosClientes.stream().map(ClienteDto::new).collect(Collectors.toList());
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDocumento() {
        return documento;
    }
}
