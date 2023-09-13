package model;

import java.math.BigDecimal;
import java.util.List;

public class Professor extends Funcionario {

    private Curso curso;
    private List<Disciplina> listaDisciplinas;


    public Professor(int id, String nome, String documento, Endereco endereco, BigDecimal salario) {
        super(id, nome, documento, endereco, salario);
    }
}
