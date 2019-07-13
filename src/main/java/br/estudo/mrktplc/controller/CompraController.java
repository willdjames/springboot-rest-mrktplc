package br.estudo.mrktplc.controller;

import br.estudo.mrktplc.business.CompraService;
import br.estudo.mrktplc.model.CompraForm;
import br.estudo.mrktplc.model.CompraRespostaDto;
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
    public ResponseEntity<CompraRespostaDto> salvarCompraApi(@RequestBody CompraForm novaCompra){

        CompraForm compraRegistrada = compraService.salvar(novaCompra);

        boolean registradaComSucesso = false;

        if(compraRegistrada != null) registradaComSucesso = true;

        CompraRespostaDto resposta = new CompraRespostaDto(novaCompra.getCdCompra(), registradaComSucesso);

        return ResponseEntity.status(HttpStatus.CREATED).body(resposta);
    }
}
