package model;

import java.math.BigDecimal;

public class Diretor extends Funcionario {

    public Diretor(int id, String nome, String documento, Endereco endereco, BigDecimal salario) {
        super(id, nome, documento, endereco, salario);
    }


}
