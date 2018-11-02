package br.com.pi5s.icomida.dao;

import java.util.List;

public class Ambiente {
    private String key;
    private String nome;
    private Integer ordem;
    private List<Mesa> mesas;

    public Ambiente() {}

    public Ambiente(String key, String nome, Integer ordem, List<Mesa> mesas) {
        this.key = key;
        this.nome = nome;
        this.ordem = ordem;
        this.mesas = mesas;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getOrdem() {
        return ordem;
    }

    public void setOrdem(Integer ordem) {
        this.ordem = ordem;
    }

    public List<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(List<Mesa> mesas) {
        this.mesas = mesas;
    }
}
