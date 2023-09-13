package model;

import java.math.BigDecimal;

public abstract class Funcionario extends Pessoa {

    private BigDecimal salario;

    public Funcionario(int id, String nome, String documento, Endereco endereco, BigDecimal salario) {
        super(id, nome, documento, endereco);
        this.salario = salario;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
