package br.estudo.mrktplc.mdb;

import br.estudo.mrktplc.configuration.AppConfiguration;
import br.estudo.mrktplc.model.EnvioDeProcesseamentoPgtoDto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProcessamentoPagamentosMdb {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private AppConfiguration appConfiguration;

    public void enviaCompraParaFilaDeProcessamentoPagamntos(EnvioDeProcesseamentoPgtoDto novaCompra){
        rabbitTemplate.convertAndSend(appConfiguration.getFILA_PROCESSO_PAGAMENTO(), novaCompra);
    }
}
