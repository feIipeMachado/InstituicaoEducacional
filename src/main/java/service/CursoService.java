package service;

import model.Aluno;
import model.Curso;
import model.Disciplina;

public class CursoService {

    public Curso criarCurso(int id, String nome) {
        Curso novoCurso = new Curso(id, nome);
        return novoCurso;
    }

    public void adicionarDisciplina(Curso curso, Disciplina disciplina) {
        curso.getListaDisciplinas().add(disciplina);
    }

    public void removerDisciplina(Curso curso, Disciplina disciplina) {
        curso.getListaDisciplinas().remove(disciplina);
    }

    public void removerDisciplinaPorId(Curso curso, int id) {
        Disciplina disciplinaParaRemover = curso.getListaDisciplinas().stream()
                .filter(disciplina -> disciplina.getId() == id)
                .findFirst()
                .get();

        curso.getListaDisciplinas().remove(disciplinaParaRemover);
    }

    public void listarDisciplinasDoCurso(Curso curso) {
        System.out.println("-------Listando disciplinas do curso--------");

        for (Disciplina disciplina : curso.getListaDisciplinas()) {
            System.out.println("Nome: " + disciplina.getNome());
            System.out.println("ID: " + disciplina.getId());
            System.out.println("---------------------------------");
        }

    }

    public void matricularAluno(Aluno aluno, Curso curso) {
        curso.getListaAlunos().add(aluno);
    }

    public void listarAlunosDoCurso (Curso curso) {
        System.out.println("-------Listando alunos do curso--------");

        for (Aluno aluno : curso.getListaAlunos()) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Matricula: " + aluno.getMatricula());
            System.out.println("---------------------------------");
        }
    }

    public void vincularAlunoAoCurso(Curso curso, Aluno alunoParaVincular) {
        curso.getListaAlunos().add(alunoParaVincular);
    }

}
