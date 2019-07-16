package br.estudo.mrktplc.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Value("${fila.processo.pagamento}")
    private String FILA_PROCESSO_PAGAMENTO;

    @Bean
    public Queue criaFilaDeProcessamentoPagamento(){
        return new Queue(FILA_PROCESSO_PAGAMENTO, true);
    }

    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory){
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(criaJsonRabbitParaEnvio());
        return rabbitTemplate;
    }

    @Bean
    public Jackson2JsonMessageConverter criaJsonRabbitParaEnvio(){
        return new Jackson2JsonMessageConverter();
    }

    public String getFILA_PROCESSO_PAGAMENTO() {
        return FILA_PROCESSO_PAGAMENTO;
    }
}
