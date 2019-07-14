package br.estudo.mrktplc.model;

public class RespostaDaCompraDto {

    private final Integer cdCompra;
    private final Double valorCompra;

    public RespostaDaCompraDto(Integer cdCompra, Double valorCompra) {
        this.cdCompra = cdCompra;
        this.valorCompra = valorCompra;
    }

    public Integer getCdCompra() {
        return cdCompra;
    }

    public Double getValorCompra() {
        return valorCompra;
    }
}
