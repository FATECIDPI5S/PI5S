package br.com.pi5s.icomida.dao;

import java.util.List;

public class Produto {
    private Integer codigo;
    private String nome;
    private DataHoraAtualizacao dataHoraAtualizacao;
    private List<PrecoVenda> precosVenda;

    public Produto() {}

    public Produto(Integer codigo, String nome, DataHoraAtualizacao dataHoraAtualizacao, List<PrecoVenda> precosVenda) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataHoraAtualizacao = dataHoraAtualizacao;
        this.precosVenda = precosVenda;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DataHoraAtualizacao getDataHoraAtualizacao() {
        return dataHoraAtualizacao;
    }

    public void setDataHoraAtualizacao(DataHoraAtualizacao dataHoraAtualizacao) {
        this.dataHoraAtualizacao = dataHoraAtualizacao;
    }

    public List<PrecoVenda> getPrecosVenda() {
        return precosVenda;
    }

    public void setPrecosVenda(List<PrecoVenda> precosVenda) {
        this.precosVenda = precosVenda;
    }
}
