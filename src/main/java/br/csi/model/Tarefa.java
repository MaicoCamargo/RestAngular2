package br.csi.model;

public class Tarefa {

    private int id;
    private String nome;
    private Boolean ativo;
    private Atividade atividade;

    public Tarefa(int id, String nome, Boolean ativo, Atividade atividade) {
        this.id = id;
        this.nome = nome;
        this.ativo = ativo;
        this.atividade = atividade;
    }

    public Tarefa(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
}
