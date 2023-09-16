package service;

import model.Endereco;
import model.Professor;

public class ProfessorService {

    public Professor criarProfessor(int id, String nome, String documento, Endereco endereco) {
        Professor novoProfessor = new Professor(id, nome, documento, endereco, null, null);
        return novoProfessor;
    }



}
