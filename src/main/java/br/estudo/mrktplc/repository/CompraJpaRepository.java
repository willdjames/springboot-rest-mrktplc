package br.estudo.mrktplc.repository;

import br.estudo.mrktplc.model.orm.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraJpaRepository extends JpaRepository<Compra, Integer> {
}
