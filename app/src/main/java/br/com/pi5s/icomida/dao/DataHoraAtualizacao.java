package br.com.pi5s.icomida.dao;

import java.util.Date;

public class DataHoraAtualizacao {
    private Date criacao;
    private Date ultimaAtualizacao;
    private Date exclusao;

    public DataHoraAtualizacao() {}

    public DataHoraAtualizacao(Date criacao, Date ultimaAtualizacao, Date exclusao) {
        this.criacao = criacao;
        this.ultimaAtualizacao = ultimaAtualizacao;
        this.exclusao = exclusao;
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

    public Date getExclusao() {
        return exclusao;
    }

    public void setExclusao(Date exclusao) {
        this.exclusao = exclusao;
    }
}
