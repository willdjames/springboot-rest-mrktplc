package br.estudo.mrktplc.model.orm;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(
        name = "tb_cliente",
        uniqueConstraints = {@UniqueConstraint(columnNames = "cli_doc", name = "docUnique")}
)
public class Cliente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cli_cd")
    private Integer codigo;

    @Column(name = "cli_doc")
    private String documento;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "cli_cd")
    private List<Compra> compras = new ArrayList<>();

    public Cliente(){}

    public Cliente(String documento, Compra compra) {
        this.documento = documento;
        this.compras.add(compra);
    }

    public void salva(Compra novaCompra) {
        this.compras.add(novaCompra);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDocumento() {
        return documento;
    }

    public List<Compra> getCompras(){
        return this.compras;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo:" + codigo +
                ", documento:'" + documento +
                '}';
    }
}
