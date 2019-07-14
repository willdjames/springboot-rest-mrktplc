package br.estudo.mrktplc.model.orm;

import javax.persistence.*;

@Entity
@Table(name = "tb_compra")
public class Compra {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comp_cd")
    private Integer codigo;

    @Column(name = "comp_valor")
    private Double valor;

    public Compra(){}

    public Compra(Double valor) {
        this.valor = valor;
    }

    public Integer getCodigo() { return this.codigo; }

    public Double getValor() { return this.valor; }

    @Override
    public String toString() {
        return "Compra{" +
                "codigo=" + codigo +
                ", valor=" + valor +
                '}';
    }
}
