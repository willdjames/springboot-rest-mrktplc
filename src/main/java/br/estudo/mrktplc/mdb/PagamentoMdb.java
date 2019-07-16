package br.estudo.mrktplc.mdb;

import br.estudo.mrktplc.configuration.AppConfiguration;
import br.estudo.mrktplc.model.PagamentoDto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PagamentoMdb {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private AppConfiguration appConfiguration;

    public void enviaParaFilaDePagamentos(PagamentoDto pagamento){
        rabbitTemplate.convertAndSend(appConfiguration.getFILA_PROCESSO_PAGAMENTO(), pagamento);
    }
}
