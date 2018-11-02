package br.com.pi5s.icomida.dao;

import java.util.List;

public class ProdutoAdicional {
    private String key;
    private String codigo;
    private String nome;
    private List<PrecoVenda> precosVenda;

    public ProdutoAdicional() {}

    public ProdutoAdicional(String key, String codigo, String nome, List<PrecoVenda> precosVenda) {
        this.key = key;
        this.codigo = codigo;
        this.nome = nome;
        this.precosVenda = precosVenda;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<PrecoVenda> getPrecosVenda() {
        return precosVenda;
    }

    public void setPrecosVenda(List<PrecoVenda> precosVenda) {
        this.precosVenda = precosVenda;
    }
}
