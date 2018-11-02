package br.com.pi5s.icomida.dao;

public class Mesa {
    private Integer key;
    private String identificacao;
    private DataHoraAtualizacao dataHoraAtualizacao;

    public Mesa() {}

    public Mesa(Integer key, String identificacao, DataHoraAtualizacao dataHoraAtualizacao) {
        this.key = key;
        this.identificacao = identificacao;
        this.dataHoraAtualizacao = dataHoraAtualizacao;
    }

    public Integer getCodigo() {
        return key;
    }

    public void setCodigo(Integer codigo) {
        this.key = codigo;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public DataHoraAtualizacao getDataHoraAtualizacao() {
        return dataHoraAtualizacao;
    }

    public void setDataHoraAtualizacao(DataHoraAtualizacao dataHoraAtualizacao) {
        this.dataHoraAtualizacao = dataHoraAtualizacao;
    }
}
