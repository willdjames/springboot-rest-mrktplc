package br.estudo.mrktplc.controller;

import br.estudo.mrktplc.business.PagamentoService;
import br.estudo.mrktplc.model.PagamentoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    @Autowired
    PagamentoService pagamentoService;

    @PostMapping
    public ResponseEntity<?> efetuaPagamento(@RequestBody PagamentoDto pagamento){
        pagamentoService.enviaParaFilaDePagamentos(pagamento);

        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
