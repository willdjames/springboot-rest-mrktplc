package br.estudo.mrktplc.controller;

import br.estudo.mrktplc.business.CompraService;
import br.estudo.mrktplc.model.CompraForm;
import br.estudo.mrktplc.model.RespostaDaCompraDto;
import br.estudo.mrktplc.model.orm.Cliente;
import br.estudo.mrktplc.model.orm.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compras")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<RespostaDaCompraDto> salvarCompraApi(@RequestBody CompraForm novaCompra){

        Cliente cliente = compraService.salva(novaCompra);

        Compra compraRealizada = cliente.getCompras().get(cliente.getCompras().size() - 1);

        RespostaDaCompraDto corpoRespostaCompra =
                new RespostaDaCompraDto(compraRealizada.getCodigo(), compraRealizada.getValor());

        return ResponseEntity.status(HttpStatus.CREATED).body(corpoRespostaCompra);
    }
}
