import model.*;
import service.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

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

        cursoService.adicionarDisciplina(curso1, disciplina1);
        cursoService.adicionarDisciplina(curso1, disciplina2);
        cursoService.adicionarDisciplina(curso1, disciplina3);
        cursoService.adicionarDisciplina(curso1, disciplina4);
        cursoService.adicionarDisciplina(curso1, disciplina5);
        cursoService.adicionarDisciplina(curso2, disciplina6);

        cursoService.listarDisciplinasDoCurso(curso1);

        Endereco endereco1 = new Endereco(1, "Rua A", "90000-000", 100, "Sem complemento", "Centro");
        Endereco endereco2 = new Endereco(2, "Rua B", "10000-000", 200, "Sem complemento", "Centro");
        Endereco endereco3 = new Endereco(3, "Rua C", "20000-000", 300, "Sem complemento", "Centro");
        Endereco endereco4 = new Endereco(4, "Rua D", "30000-000", 400, "Sem complemento", "Centro");


        ProfessorService professorService = new ProfessorService();
        Professor professor1 = professorService.criarProfessor(1,"Lucas", "236235364", endereco1);
        Professor professor2 = professorService.criarProfessor(2,"Felipe Vargas", "124142142", endereco2);
        Professor professor3 = professorService.criarProfessor(1,"Giovanni", "464754", endereco3);
        Professor professor4 = professorService.criarProfessor(1,"Matheus", "79879", endereco1);
        Professor professor5 = professorService.criarProfessor(1,"Luiz", "5688565", endereco4);


        cursoService.vincularProfessorAoCurso(curso1, professor1);
        cursoService.vincularProfessorAoCurso(curso1, professor2);
        cursoService.vincularProfessorAoCurso(curso2, professor3);
        cursoService.vincularProfessorAoCurso(curso1, professor4);
        cursoService.vincularProfessorAoCurso(curso1, professor5);



        AlunoService alunoService = new AlunoService();
        Aluno aluno1 = alunoService.criarAluno(1,"Felipe Machado","12512521",endereco1,1);
        Aluno aluno2 = alunoService.criarAluno(2,"Mairy Eduardo","4636364",endereco2,2);
        Aluno aluno3 = alunoService.criarAluno(3,"Alexandre","67447",endereco3,3);

        System.out.println(" --- Buscando aluno por nome");
        Aluno alunoPorNome = alunoService.buscarAlunoPorNome("Alexandre");
        System.out.println("Aluno " + alunoPorNome.getNome() + " ("
                + alunoPorNome.getMatricula() + ") encontrado com sucesso.");
        System.out.println(" ---");




    }
}
