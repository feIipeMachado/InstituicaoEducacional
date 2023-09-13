package model;

import java.util.ArrayList;
import java.util.List;

public class Instituicao {

    private String nome;
    private List<Curso> listaCursos;

    private List<Aluno> listaAlunos;

    private List<Professor> listaProfessores;

    public Instituicao(String nome) {
        this.nome = nome;
        this.listaCursos = new ArrayList<>();
        this.listaAlunos = new ArrayList<>();
        this.listaProfessores = new ArrayList<>();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> cursos) {
        this.listaCursos = cursos;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public List<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void setListaProfessores(List<Professor> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }
}
