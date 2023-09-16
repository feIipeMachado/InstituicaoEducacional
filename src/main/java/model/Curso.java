package model;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private List<Disciplina> listaDisciplinas;
    private List<Aluno> listaAlunos;

    private List<Professor> listaProfessores;
    private int id;
    private String nome;

    public Curso(int id, String nome) {
        this.listaDisciplinas = new ArrayList<>();
        this.listaAlunos = new ArrayList<>();
        this.listaProfessores = new ArrayList<>();
        this.id = id;
        this.nome = nome;
    }

    public List<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public void setListaDisciplinas(List<Disciplina> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
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

    public List<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void setListaProfessores(List<Professor> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }
}
