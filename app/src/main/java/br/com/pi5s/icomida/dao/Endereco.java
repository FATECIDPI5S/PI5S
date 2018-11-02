package br.com.pi5s.icomida.dao;

public class Endereco {
    private String key;
    private String tipoEndereco;
    private String tipoLogradouro;
    private String logradouro;
    private Integer numero;
    private String cep;
    private String cidade;
    private String estado;
    private DataHoraAtualizacao dataHoraAtualizacao;

    public Endereco() {}

    public Endereco(String key, String tipoEndereco, String tipoLogradouro, String logradouro, Integer numero, String cep, String cidade, String estado, DataHoraAtualizacao dataHoraAtualizacao) {
        this.key = key;
        this.tipoEndereco = tipoEndereco;
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.dataHoraAtualizacao = dataHoraAtualizacao;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(String tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public DataHoraAtualizacao getDataHoraAtualizacao() {
        return dataHoraAtualizacao;
    }

    public void setDataHoraAtualizacao(DataHoraAtualizacao dataHoraAtualizacao) {
        this.dataHoraAtualizacao = dataHoraAtualizacao;
    }
}
