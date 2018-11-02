package br.com.pi5s.icomida.dao;

import java.util.List;

public class Funcionario {
    private String key;
    private String cpf;
    private String rg;
    private String nome;
    private String apelido;
    private DataHoraAtualizacao horaDataAtualizacao;
    private Empresa empresa;
    private List<Endereco> enderecos;
    private List<Contato> contatos;

    public Funcionario() {}

    public Funcionario(String key, String cpf, String rg, String nome, String apelido, DataHoraAtualizacao horaDataAtualizacao, Empresa empresa, List<Endereco> enderecos, List<Contato> contatos) {
        this.key = key;
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.apelido = apelido;
        this.horaDataAtualizacao = horaDataAtualizacao;
        this.empresa = empresa;
        this.enderecos = enderecos;
        this.contatos = contatos;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public DataHoraAtualizacao getHoraDataAtualizacao() {
        return horaDataAtualizacao;
    }

    public void setHoraDataAtualizacao(DataHoraAtualizacao horaDataAtualizacao) {
        this.horaDataAtualizacao = horaDataAtualizacao;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
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
