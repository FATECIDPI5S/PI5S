package br.com.pi5s.icomida.dao;

public class Contato {
    private String key;
    private String tipoContato;
    private String titulo;
    private String descricao;
    private DataHoraAtualizacao dataHoraAtualizacao;

    public Contato() {}

    public Contato(String key, String tipoContato, String titulo, String descricao, DataHoraAtualizacao dataHoraAtualizacao) {
        this.key  = key;
        this.tipoContato = tipoContato;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataHoraAtualizacao = dataHoraAtualizacao;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(String tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public DataHoraAtualizacao getDataHoraAtualizacao() {
        return dataHoraAtualizacao;
    }

    public void setDataHoraAtualizacao(DataHoraAtualizacao dataHoraAtualizacao) {
        this.dataHoraAtualizacao = dataHoraAtualizacao;
    }
}
