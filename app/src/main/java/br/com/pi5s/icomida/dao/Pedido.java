package br.com.pi5s.icomida.dao;

import java.util.List;

public class Pedido {
    private String key;
    private double subtotal;
    private double taxaGarcom;
    private double valorTotal;
    private Mesa mesa;
    private Funcionario funcionario;
    private DataHoraAtualizacao dataHoraAtualizacao;
    private List<PedidoItem> pedidosItens;

    public Pedido() {}

    public Pedido(String key, double subtotal, double taxaGarcom, double valorTotal, Mesa mesa, Funcionario funcionario, DataHoraAtualizacao dataHoraAtualizacao, List<PedidoItem> pedidosItens) {
        this.key = key;
        this.subtotal = subtotal;
        this.taxaGarcom = taxaGarcom;
        this.valorTotal = valorTotal;
        this.mesa = mesa;
        this.funcionario = funcionario;
        this.dataHoraAtualizacao = dataHoraAtualizacao;
        this.pedidosItens = pedidosItens;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTaxaGarcom() {
        return taxaGarcom;
    }

    public void setTaxaGarcom(double taxaGarcom) {
        this.taxaGarcom = taxaGarcom;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public DataHoraAtualizacao getDataHoraAtualizacao() {
        return dataHoraAtualizacao;
    }

    public void setDataHoraAtualizacao(DataHoraAtualizacao dataHoraAtualizacao) {
        this.dataHoraAtualizacao = dataHoraAtualizacao;
    }

    public List<PedidoItem> getPedidosItens() {
        return pedidosItens;
    }

    public void setPedidosItens(List<PedidoItem> pedidosItens) {
        this.pedidosItens = pedidosItens;
    }
}
