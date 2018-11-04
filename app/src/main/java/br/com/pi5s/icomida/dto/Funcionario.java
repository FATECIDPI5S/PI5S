package br.com.pi5s.icomida.dto;

import java.util.List;

import br.com.pi5s.icomida.dao.Contato;
import br.com.pi5s.icomida.dao.DataHoraAtualizacao;
import br.com.pi5s.icomida.dao.Empresa;
import br.com.pi5s.icomida.dao.Endereco;

public class Funcionario {

    private String cpf;
    private String rg;
    private String nome;
    private String email;
    private String tipo;

    public Funcionario(){ };

    public Funcionario(String cpf,String rg,String nome,String email,String tipo){
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.email = email;
        this.tipo = tipo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
