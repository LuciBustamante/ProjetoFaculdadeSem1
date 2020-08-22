package com.pucpr;

public class FuncionarioConcursado extends Funcionario {

    public int tpAno;

    public FuncionarioConcursado(int cod, double wage, int tpAno) {
        this.cod = cod;
        this.wage = wage;
        this.tpAno = tpAno;
    }

    public void imprimeFuncionario() {

        System.out.println("------ Funcionário Concursado ------");
        super.imprimeFuncionario();
        System.out.println("Salário Mensal: " + this.salarioMensal());

        double somaDependente = 0;
        for (Dependente d : this.filhos) {
            System.out.println("Idade do dependente: " + d.idade);
        }

    }

    public double salarioBonus() {
        return this.wage + (tpAno * 200);
    }

    public double calculaGratifDependente() {
        return this.contarFilhosIdadeLimite(21) * 100;
    }

    public double salarioMensal() {
        return this.salarioBonus() + this.calculaGratifDependente();
    }
}
