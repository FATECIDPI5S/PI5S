package br.com.pi5s.icomida.dao;

public class PrecoVenda {
    private String key;
    private double preco;
    private DataHoraAtualizacao dataHoraAtualizacao;

    public PrecoVenda() {}

    public PrecoVenda(String key, double preco, DataHoraAtualizacao dataHoraAtualizacao) {
        this.key = key;
        this.preco = preco;
        this.dataHoraAtualizacao = dataHoraAtualizacao;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public DataHoraAtualizacao getDataHoraAtualizacao() {
        return dataHoraAtualizacao;
    }

    public void setDataHoraAtualizacao(DataHoraAtualizacao dataHoraAtualizacao) {
        this.dataHoraAtualizacao = dataHoraAtualizacao;
    }
}
