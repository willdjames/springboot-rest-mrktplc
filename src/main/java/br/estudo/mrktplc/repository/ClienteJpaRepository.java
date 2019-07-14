package br.estudo.mrktplc.repository;

import br.estudo.mrktplc.model.orm.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteJpaRepository extends JpaRepository<Cliente, Integer> {

    Cliente findByDocumento(String documento);
}
