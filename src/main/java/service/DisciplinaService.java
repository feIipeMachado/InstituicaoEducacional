package service;

import model.Disciplina;
import model.Professor;

public class DisciplinaService {


    public Disciplina criarDisciplina (int id, String nome) {
        Disciplina novaDisciplina = new Disciplina(id, nome, null);
        return novaDisciplina;
    }
}
