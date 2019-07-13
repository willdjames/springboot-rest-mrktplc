package br.estudo.mrktplc.model;

public class CompraForm {

    private Integer cdCliente;

    private Integer cdCompra;

    private Double valorCompra;

    public Integer getCdCliente() {
        return cdCliente;
    }

    public Integer getCdCompra() {
        return cdCompra;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    @Override
    public String toString() {
        return "CompraForm{" +
                "cdCliente:" + cdCliente +
                ", cdCompra:" + cdCompra +
                ", valorCompra:" + valorCompra +
                '}';
    }
}
