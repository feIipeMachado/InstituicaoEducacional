import model.*;
import service.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Endereco endereco1 = Endereco.builder()
                .id(1).rua("Rua A").cep("90000-000").numero(100).complemento("Sem complemento").bairro("Centro")
                .build();

        Endereco endereco2 = Endereco.builder()
                .id(2).rua("Rua B").cep("10000-000").numero(200).complemento("Sem complemento").bairro("Centro")
                .build();

        Endereco endereco3 = Endereco.builder()
                .id(3).rua("Rua A").cep("20000-000").numero(300).complemento("Sem complemento").bairro("Centro")
                .build();

        Endereco endereco4 = Endereco.builder()
                .id(4).rua("Rua A").cep("30000-000").numero(400).complemento("Sem complemento").bairro("Centro")
                .build();

        InstituicaoService instituicaoService = new InstituicaoService();
        Instituicao instituicao1 = instituicaoService.criarInstituicao("Fundatec");

        CursoService cursoService = new CursoService();
        Curso curso1 = cursoService.criarCurso(1, "Técnico em Informática");
        Curso curso2 = cursoService.criarCurso(2, "Técnico em Enfermagem");

        instituicaoService.vincularCursoAInstituicao(instituicao1, curso1);
        instituicaoService.vincularCursoAInstituicao(instituicao1, curso2);

        instituicaoService.listarCursosDaInstituicao(instituicao1);

        DisciplinaService disciplinaService = new DisciplinaService();
        Disciplina disciplina1 = disciplinaService.criarDisciplina(1,"LP1");
        Disciplina disciplina2 = disciplinaService.criarDisciplina(2,"LP2");
        Disciplina disciplina3 = disciplinaService.criarDisciplina(3,"LP3");
        Disciplina disciplina4 = disciplinaService.criarDisciplina(4,"DevWeb1");
        Disciplina disciplina5 = disciplinaService.criarDisciplina(5,"DevWeb2");
        Disciplina disciplina6 = disciplinaService.criarDisciplina(6,"Primeiros cuidados");

        AlunoService alunoService = new AlunoService();
        Aluno aluno1 = alunoService.criarAluno(1,"Felipe Machado","12512521",endereco1,1);
        Aluno aluno2 = alunoService.criarAluno(2,"Mairy Eduardo","4636364",endereco2,2);
        Aluno aluno3 = alunoService.criarAluno(3,"Alexandre","67447",endereco3,3);

        ProfessorService professorService = new ProfessorService();
        Professor professor1 = professorService.criarProfessor(1,"Lucas", "236235364", endereco1);
        Professor professor2 = professorService.criarProfessor(2,"Felipe Vargas", "124142142", endereco2);
        Professor professor3 = professorService.criarProfessor(1,"Giovanni", "464754", endereco3);
        Professor professor4 = professorService.criarProfessor(1,"Matheus", "79879", endereco1);
        Professor professor5 = professorService.criarProfessor(1,"Luiz", "5688565", endereco4);

        instituicaoService.matricularAluno(instituicao1,aluno1);
        instituicaoService.matricularAluno(instituicao1,aluno2);
        instituicaoService.matricularAluno(instituicao1,aluno3);

        instituicaoService.contratarProfessor(instituicao1,professor1, BigDecimal.valueOf(500));
        instituicaoService.contratarProfessor(instituicao1,professor2, BigDecimal.valueOf(600));
        instituicaoService.contratarProfessor(instituicao1,professor3, BigDecimal.valueOf(700));
        instituicaoService.contratarProfessor(instituicao1,professor4, BigDecimal.valueOf(800));
        instituicaoService.contratarProfessor(instituicao1,professor5, BigDecimal.valueOf(900));

        instituicaoService.listarAlunosDaInstituicao(instituicao1);
        instituicaoService.listarProfessoresDaInstituicao(instituicao1);

        cursoService.adicionarDisciplina(curso1, disciplina1);
        cursoService.adicionarDisciplina(curso1, disciplina2);
        cursoService.adicionarDisciplina(curso1, disciplina3);
        cursoService.adicionarDisciplina(curso1, disciplina4);
        cursoService.adicionarDisciplina(curso1, disciplina5);
        cursoService.adicionarDisciplina(curso2, disciplina6);

        cursoService.listarDisciplinasDoCurso(curso1);


        cursoService.vincularProfessorAoCurso(curso1, professor1);
        cursoService.vincularProfessorAoCurso(curso1, professor2);
        cursoService.vincularProfessorAoCurso(curso1, professor3);
        cursoService.vincularProfessorAoCurso(curso1, professor4);
        cursoService.vincularProfessorAoCurso(curso2, professor5);

        cursoService.vincularProfessorADisciplina(curso1,professor1,disciplina3);
        cursoService.vincularProfessorADisciplina(curso1,professor4,disciplina4);
        cursoService.vincularProfessorADisciplina(curso1,professor4,disciplina5);
        cursoService.vincularProfessorADisciplina(curso1,professor2,disciplina1);
        cursoService.vincularProfessorADisciplina(curso1,professor3,disciplina2);
        cursoService.vincularProfessorADisciplina(curso2,professor5,disciplina6);

        cursoService.listarProfessoresDoCurso(curso1);


        cursoService.matricularAluno(aluno1,curso1);
        cursoService.matricularAluno(aluno2,curso1);
        cursoService.matricularAluno(aluno3,curso2);

        cursoService.listarAlunosDoCurso(curso1);






    }
}
