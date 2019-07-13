package br.estudo.mrktplc.model;

public class CompraRespostaDto {

    private Integer cdCompra;

    private boolean registradaComSucesso;

    private boolean estahPaga;

    public CompraRespostaDto(Integer cdCompra, boolean registradaComSucesso) {
        this.cdCompra = cdCompra;
        this.registradaComSucesso = registradaComSucesso;
        this.estahPaga = false;
    }

    public Integer getCdCompra() {
        return cdCompra;
    }

    public boolean isRegistradaComSucesso() {
        return registradaComSucesso;
    }

    public boolean isEstahPaga() {
        return estahPaga;
    }

    @Override
    public String toString() {
        return "CompraRespostaDto{" +
                "cdCompra:" + cdCompra +
                ", registradaComSucesso:" + registradaComSucesso +
                ", estahPaga:" + estahPaga +
                '}';
    }
}
