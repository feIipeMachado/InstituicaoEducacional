package service;

import model.Aluno;
import model.Curso;
import model.Disciplina;
import model.Professor;

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
        System.out.println("-------Listando disciplinas do curso " + curso.getNome()+ "--------");

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
        System.out.println("-------Listando alunos do curso " + curso.getNome() + "--------");

        for (Aluno aluno : curso.getListaAlunos()) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Matricula: " + aluno.getMatricula());
            System.out.println("---------------------------------");
        }
    }

    public void listarProfessoresDoCurso (Curso curso) {
        System.out.println("-------Listando professores do curso " + curso.getNome() + "--------");

        for (Professor professor : curso.getListaProfessores()) {
            System.out.println("Nome: " + professor.getNome());
            System.out.println("Disciplinas lecionadas: ");
            for (Disciplina disciplina : professor.getListaDisciplinas()) {
                System.out.println(disciplina.getNome());
            }
            System.out.println("---------------------------------");
        }
    }

    public void vincularAlunoAoCurso(Curso curso, Aluno alunoParaVincular) {
        curso.getListaAlunos().add(alunoParaVincular);
        System.out.println("Aluno " + alunoParaVincular.getNome() + " vinculado com sucesso" +
                " ao curso " + curso.getNome());
    }

    public void vincularProfessorAoCurso (Curso curso, Professor professorParaVincular){
        curso.getListaProfessores().add(professorParaVincular);
        System.out.println("Professor " + professorParaVincular.getNome() + " vinculado com sucesso" +
                " ao curso " + curso.getNome());
    }

    public void vincularProfessorADisciplina (Curso curso, Professor professor, Disciplina disciplina) {
        if (curso.getListaDisciplinas().contains(disciplina) && curso.getListaProfessores().contains(professor)) {
            professor.getListaDisciplinas().add(disciplina);
        } else {
            System.out.println("Professor " + professor.getNome() + " não está vinculado ao curso, ou " +
                    "a disciplina " + disciplina.getNome() + " não está vinculada ao curso");
        }

        //não estou confortável com esse método, certamente deve ter uma forma mais simples de fazer isso
    }

    public void DesvincularProfessorDeDisciplina(Professor professor, Disciplina disciplina) {
        if (professor.getListaDisciplinas().contains(disciplina)) {
            professor.getListaDisciplinas().remove(disciplina);
        } else {
            System.out.println("Professor " + professor.getNome() + " não está vinculado a disciplina " +
                    disciplina.getNome());
        }
    }

}
