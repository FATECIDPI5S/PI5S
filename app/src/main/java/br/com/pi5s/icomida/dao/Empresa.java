package br.com.pi5s.icomida.dao;

import java.util.List;

public class Empresa {
    private String key;
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private String inscricaoEstadual;
    private DataHoraAtualizacao horaDataAtualizacao;
    private Empresa empresaMatriz;
    private List<Endereco> enderecos;
    private List<Contato> contatos;

    public Empresa () {}

    public Empresa(String key, String razaoSocial, String nomeFantasia, String cnpj, String inscricaoEstadual, DataHoraAtualizacao horaDataAtualizacao, Empresa empresaMatriz, List<Endereco> enderecos, List<Contato> contatos) {
        this.key = key;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.horaDataAtualizacao = horaDataAtualizacao;
        this.empresaMatriz = empresaMatriz;
        this.enderecos = enderecos;
        this.contatos = contatos;
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

    public DataHoraAtualizacao getHoraDataAtualizacao() {
        return horaDataAtualizacao;
    }

    public void setHoraDataAtualizacao(DataHoraAtualizacao horaDataAtualizacao) {
        this.horaDataAtualizacao = horaDataAtualizacao;
    }

    public Empresa getEmpresaMatriz() {
        return empresaMatriz;
    }

    public void setEmpresaMatriz(Empresa empresaMatriz) {
        this.empresaMatriz = empresaMatriz;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }
}
