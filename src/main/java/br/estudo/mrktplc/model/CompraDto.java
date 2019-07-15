package br.estudo.mrktplc.model;

import br.estudo.mrktplc.model.orm.Compra;

import java.util.List;
import java.util.stream.Collectors;

public class CompraDto {

    private Integer codigo;

    private Double valor;

    private boolean estaPaga;

    public CompraDto(Compra compra) {
        this.codigo = compra.getCodigo();
        this.valor = compra.getValor();
        this.estaPaga = compra.getEstaPaga();
    }

    public static List<CompraDto> getCompras(List<Compra> compras) {
        return compras.stream().map(CompraDto::new).collect(Collectors.toList());
    }

    public Integer getCodigo() { return this.codigo; }

    public Double getValor() { return this.valor; }

    public boolean getEstaPaga() { return this.estaPaga; }


}
