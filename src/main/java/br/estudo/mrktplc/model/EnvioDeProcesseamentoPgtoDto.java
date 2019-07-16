package br.estudo.mrktplc.model;

import br.estudo.mrktplc.model.orm.Cliente;
import br.estudo.mrktplc.model.orm.Compra;

import java.io.Serializable;
import java.util.Comparator;

public class EnvioDeProcesseamentoPgtoDto implements Serializable {

    private String docCliente;

    private Integer cdCompra;

    private double valorCompra;

    public EnvioDeProcesseamentoPgtoDto(Cliente clienteQueCompra) {
        docCliente = clienteQueCompra.getDocumento();
        Compra ultimaCompra = getUltimaCompra(clienteQueCompra);
        cdCompra = ultimaCompra.getCodigo();
        valorCompra = ultimaCompra.getValor();
    }

    private Compra getUltimaCompra(Cliente clienteQueCompra) {
        return clienteQueCompra.getCompras().stream().max(Comparator.comparing(Compra::getCodigo)).get();
    }


    public Integer getCdCompra() {
        return cdCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public String getDocCliente() {
        return docCliente;
    }
}
