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

    public void removerAlunoPorMatricula(int matricula) {
        Aluno alunoParaRemover = listaAlunos.stream()
                .filter(aluno -> aluno.getMatricula() == matricula)
                .findFirst()
                .get();

        if (alunoParaRemover == null) {
            System.out.println("Aluno não encontrado");
        } else {
            listaAlunos.remove(alunoParaRemover);
            System.out.println("Aluno removido com sucesso");
        }

    }

    public Aluno buscarAlunoPorNome(String nome) {
        Aluno buscarAlunoPorNome = listaAlunos.stream()
                .filter(aluno -> aluno.getNome() == nome)
                .findFirst()
                .get();

        return buscarAlunoPorNome;
    }

    public Aluno buscarAlunoPorMatricula(int matricula) {
        Aluno buscarAlunoPorMatricula = listaAlunos.stream()
                .filter(aluno -> aluno.getMatricula() == matricula)
                .findFirst()
                .get();

        return buscarAlunoPorMatricula;
    }

}