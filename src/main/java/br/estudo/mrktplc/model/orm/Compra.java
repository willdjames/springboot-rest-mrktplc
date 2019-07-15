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

    @Column(
            name = "comp_paga",
            columnDefinition = "TINYINT(1)"
    )
    private boolean estaPaga;

    public Compra(){}

    public Compra(Double valor) {
        this.valor = valor;
        this.estaPaga = false;
    }

    public Integer getCodigo() { return this.codigo; }

    public Double getValor() { return this.valor; }

    public boolean getEstaPaga() { return this.estaPaga; }

    @Override
    public String toString() {
        return "Compra{" +
                "codigo:" + codigo +
                ", valor:" + valor +
                ", estaPaga:" + estaPaga +
                '}';
    }
}
