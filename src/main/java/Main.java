import model.Aluno;
import model.Curso;
import model.Endereco;
import model.Instituicao;
import service.AlunoService;
import service.CursoService;
import service.InstituicaoService;

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

        Endereco endereco1 = new Endereco(1, "Rua A", "90000-000", 100, "Sem complemento", "Centro");
        Endereco endereco2 = new Endereco(2, "Rua B", "10000-000", 200, "Sem complemento", "Centro");
        Endereco endereco3 = new Endereco(3, "Rua C", "20000-000", 300, "Sem complemento", "Centro");
        Endereco endereco4 = new Endereco(4, "Rua D", "30000-000", 400, "Sem complemento", "Centro");

        AlunoService alunoService = new AlunoService();
        Aluno aluno1 = alunoService.criarAluno(1,"Felipe Machado","12512521",endereco1,1);
        Aluno aluno2 = alunoService.criarAluno(2,"Mairy Eduardo","4636364",endereco2,2);
        Aluno aluno3 = alunoService.criarAluno(3,"Alexandre","67447",endereco3,3);

        System.out.println(" --- Buscando aluno por nome");
        Aluno alunoPorNome = alunoService.buscarAlunoPorNome("Alexandre");
        System.out.println("Aluno " + alunoPorNome.getNome() + " ("
                + alunoPorNome.getMatricula() + ") encontrado com sucesso.");
        System.out.println(" ---");


        //CursoService cursoService= new CursoService();


    }
}
