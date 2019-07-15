package br.estudo.mrktplc.controller;

import br.estudo.mrktplc.business.ClienteService;
import br.estudo.mrktplc.model.ClienteDetalhadoDto;
import br.estudo.mrktplc.model.ClienteDto;
import br.estudo.mrktplc.model.orm.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<ClienteDto>> buscaTodosClientes(){

        List<Cliente> clientesCadastrados = clienteService.buscaTodosClientes();

        List<ClienteDto> respostaComTodosClientes =  ClienteDto.getTodosClientes(clientesCadastrados);

        return ResponseEntity.status(HttpStatus.OK).body(respostaComTodosClientes);
    }

    @GetMapping("/{documento}/compras")
    public ResponseEntity<ClienteDetalhadoDto> todasComprasDoCLiente(@PathVariable String documento){
        Cliente clienteDetalhado = clienteService.buscaTodasComprasDoCliente(documento);

        if(clienteDetalhado == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        ClienteDetalhadoDto respostaClienteDetalhado = new ClienteDetalhadoDto(clienteDetalhado);

        return ResponseEntity.status(HttpStatus.OK).body(respostaClienteDetalhado);
    }
}
