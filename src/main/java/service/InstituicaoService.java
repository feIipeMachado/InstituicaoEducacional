package service;

import model.Aluno;
import model.Curso;
import model.Instituicao;
import model.Professor;

import java.math.BigDecimal;

public class InstituicaoService {

    public Instituicao criarInstituicao(String nome) {
        return new Instituicao(nome);
    }

    public void vincularCursoAInstituicao(Instituicao instituicao, Curso cursoParaVincular) {
        instituicao.getListaCursos().add(cursoParaVincular);
    }

    public void listarCursosDaInstituicao(Instituicao instituicao) {
        System.out.println("-------Listando cursos da instituicao " + instituicao.getNome() + "---------");

        for (Curso curso : instituicao.getListaCursos()) {
            System.out.println("Nome: " + curso.getNome());
            System.out.println("ID: " + curso.getId());
            System.out.println("---------------------------------");
        }
    }

    public void listarAlunosDaInstituicao(Instituicao instituicao) {
        System.out.println("-------Listando Alunos da instituição " + instituicao.getNome() + "---------");

        for (Aluno aluno : instituicao.getListaAlunos()) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("Matricula: " + aluno.getMatricula());
            System.out.println("--------------------------------");
        }
    }

    public void listarProfessoresDaInstituicao(Instituicao instituicao) {
        System.out.println("-------Listando professores da instituição: " + instituicao.getNome());

        for (Professor professor : instituicao.getListaProfessores()) {
            System.out.println("Nome: " + professor.getNome());
            System.out.println("ID: " + professor.getId());
            System.out.println("--------------------------------");
        }
    }


    public void matricularAluno(Instituicao instituicao, Aluno aluno) {
        instituicao.getListaAlunos().add(aluno);
        System.out.println("Aluno matriculado com sucesso");
    }

    public void contratarProfessor(Instituicao instituicao, Professor professor, BigDecimal salario) {
        professor.setSalario(salario);
        instituicao.getListaProfessores().add(professor);

    }

}