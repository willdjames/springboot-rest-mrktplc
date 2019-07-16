package br.estudo.mrktplc.model;

import java.io.Serializable;

public class PagamentoDto implements Serializable {

    private String docCliente;
    private Integer cdCompra;
    private double valor;

    public String getDocCliente() {
        return docCliente;
    }

    public Integer getCdCompra() {
        return cdCompra;
    }

    public double getValor() {
        return valor;
    }
}
