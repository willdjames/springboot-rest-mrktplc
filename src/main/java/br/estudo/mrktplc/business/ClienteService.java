package br.estudo.mrktplc.business;

import br.estudo.mrktplc.model.orm.Cliente;
import br.estudo.mrktplc.repository.ClienteJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteJpaRepository clienteJpaRepository;

    public List<Cliente> buscaTodosClientes() {
        return clienteJpaRepository.findAll();
    }

    public Cliente buscaTodasComprasDoCliente(String documento){
        return clienteJpaRepository.buscaComprasDoCliente(documento);
    }
}
