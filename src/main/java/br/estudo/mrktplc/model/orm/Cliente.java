package br.estudo.mrktplc.model.orm;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cli_cd")
    private Integer codigo;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cli_cd")
    private List<Compra> compras;

    public Cliente(){}
}
