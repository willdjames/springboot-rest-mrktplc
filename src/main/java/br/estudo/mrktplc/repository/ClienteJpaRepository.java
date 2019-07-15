package br.estudo.mrktplc.repository;

import br.estudo.mrktplc.model.orm.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ClienteJpaRepository extends JpaRepository<Cliente, Integer> {

    Cliente findByDocumento(String documento);

    @Transactional(readOnly = true)
    @Query("SELECT c FROM Cliente c JOIN FETCH c.compras Z WHERE c.documento = :documento")
    Cliente buscaComprasDoCliente(String documento);
}
