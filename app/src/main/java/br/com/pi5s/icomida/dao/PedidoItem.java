package br.com.pi5s.icomida.dao;

import java.util.List;

public class PedidoItem {
    private String key;
    private double quantidade;
    private Produto produto;
    private PrecoVenda precoVenda;
    private double valorTotal;
    private String observacao;
    private List<ProdutoAdicional> produtosAdicionais;

    public PedidoItem() {}

    public PedidoItem(String key, double quantidade, Produto produto, PrecoVenda precoVenda, double valorTotal, String observacao, List<ProdutoAdicional> produtosAdicionais) {
        this.key = key;
        this.quantidade = quantidade;
        this.produto = produto;
        this.precoVenda = precoVenda;
        this.valorTotal = valorTotal;
        this.observacao = observacao;
        this.produtosAdicionais = produtosAdicionais;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public PrecoVenda getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(PrecoVenda precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public List<ProdutoAdicional> getProdutosAdicionais() {
        return produtosAdicionais;
    }

    public void setProdutosAdicionais(List<ProdutoAdicional> produtosAdicionais) {
        this.produtosAdicionais = produtosAdicionais;
    }
}
