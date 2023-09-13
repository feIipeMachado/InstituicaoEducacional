package model;

public class Aluno extends Pessoa {

    private int matricula;
    private Curso curso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Aluno(int id, String nome, String documento, Endereco endereco, int matricula, Curso curso) {
        super(id, nome, documento, endereco);
        this.matricula = matricula;
        this.curso = curso;
    }
}
