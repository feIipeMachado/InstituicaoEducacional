package service;

import model.Aluno;
import model.Endereco;

import java.util.List;

public class AlunoService {

    private List<Aluno> listaAlunos;

    public Aluno criarAluno (int id, String nome, String documento, Endereco endereco, int matricula) {
        Aluno novoAluno = new Aluno(id,nome,documento,endereco,matricula, null);
        return novoAluno;
    }


}