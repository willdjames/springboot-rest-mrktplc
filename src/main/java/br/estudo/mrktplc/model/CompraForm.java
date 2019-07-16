package br.estudo.mrktplc.model;

import br.estudo.mrktplc.model.orm.Compra;

import java.io.Serializable;

public class CompraForm implements Serializable {

    private String docCliente;

    private Double valorCompra;

    public String getDocCliente() { return docCliente; }

    public Double getValorCompra() {
        return valorCompra;
    }

    public Compra getNovaCompra() {
        return new Compra(this.getValorCompra());
    }

    @Override
    public String toString() {
        return "CompraForm{" +
                "docCliente:" + docCliente +
                ", valorCompra:" + valorCompra +
                '}';
    }
}
