package br.estudo.mrktplc.business;

import br.estudo.mrktplc.model.CompraForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CompraService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public CompraForm salvar(final CompraForm compra) {
        log.debug(compra.toString());

        return compra;
    }
}
