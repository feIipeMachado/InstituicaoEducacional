package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {

    private List<Disciplina> listaDisciplinas;

    public Professor(int id, String nome, String documento, Endereco endereco, BigDecimal salario, List<Disciplina> listaDisciplinas) {
        super(id, nome, documento, endereco, salario);
        this.listaDisciplinas = new ArrayList<>();
    }

    public List<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public void setListaDisciplinas(List<Disciplina> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }
}
