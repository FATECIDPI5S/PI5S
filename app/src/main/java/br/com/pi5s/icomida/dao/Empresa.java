package br.com.pi5s.icomida.dao;

import java.util.Date;
import java.util.List;

public class Empresa {
    private String key;
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private String inscricaoEstadual;
    private String empresaMatriz;
    private Date criacao;
    private Date ultimaAtualizacao;

    public Empresa () {}

    public Empresa(String razaoSocial, String nomeFantasia, String cnpj, String inscricaoEstadual, DataHoraAtualizacao dataHoraAtualizacao, Empresa empresaMatriz, List<Endereco> enderecos, List<Contato> contatos) {
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;

        if (null != dataHoraAtualizacao){
            this.criacao = dataHoraAtualizacao.getCriacao();
            this.ultimaAtualizacao = dataHoraAtualizacao.getUltimaAtualizacao();
        }

        if (null != empresaMatriz)
            this.empresaMatriz = empresaMatriz.key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getEmpresaMatriz() {
        return empresaMatriz;
    }

    public void setEmpresaMatriz(String empresaMatriz) {
        this.empresaMatriz = empresaMatriz;
    }

    public Date getCriacao() {
        return criacao;
    }

    public void setCriacao(Date criacao) {
        this.criacao = criacao;
    }

    public Date getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(Date ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
}


