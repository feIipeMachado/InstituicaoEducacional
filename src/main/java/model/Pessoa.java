package model;

public abstract class Pessoa {
    private int id;
    private String nome;
    private String documento;
    private Endereco endereco;

    public Pessoa(int id, String nome, String documento, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
