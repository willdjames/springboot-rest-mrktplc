package br.estudo.mrktplc.business;

import br.estudo.mrktplc.mdb.PagamentoMdb;
import br.estudo.mrktplc.model.PagamentoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoMdb pagamentoMdb;

    public void enviaParaFilaDePagamentos(PagamentoDto pagamento){
        pagamentoMdb.enviaParaFilaDePagamentos(pagamento);
    }
}
