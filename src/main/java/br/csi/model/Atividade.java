package br.csi.model;

public class Atividade {
    private int id;
    private  String nome;

    public Atividade(int id) {
        this.id = id;
    }

    public Atividade(int id, String nome) {
        this.id = id;
        this.nome = nome;
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
}
