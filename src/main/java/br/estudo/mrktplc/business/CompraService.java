package br.estudo.mrktplc.business;

import br.estudo.mrktplc.model.CompraForm;
import br.estudo.mrktplc.model.orm.Cliente;
import br.estudo.mrktplc.model.orm.Compra;
import br.estudo.mrktplc.repository.ClienteJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CompraService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ClienteJpaRepository repository;

    @Transactional
    public Cliente salva(final CompraForm compra) {

        Compra novaCompra = compra.getNovaCompra();

        Cliente clienteQueCompra = repository.findByDocumento(compra.getDocCliente());

        if(clienteQueCompra != null){
           clienteQueCompra.salva(novaCompra);
        }else{
            clienteQueCompra = new Cliente(compra.getDocCliente(), novaCompra);
            repository.saveAndFlush(clienteQueCompra);
        }

        return clienteQueCompra;
    }
}
