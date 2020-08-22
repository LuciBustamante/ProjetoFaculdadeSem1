package com.pucpr;

public class FuncionarioTemporario extends Funcionario {

    public int tpMeses;

    public FuncionarioTemporario(int cod, double wage, int tpMeses) {
        this.cod = cod;
        this.wage = wage;
        this.tpMeses = tpMeses;
    }

    public void imprimeFuncionario(){

        System.out.println("------ Funcionário Temporário ------");
        super.imprimeFuncionario();
        System.out.println("Salário Mensal: " + this.salarioMensal());
        System.out.println("Quantidade de Dependentes" + this.contarFilhosIdadeLimite(18));


        int somaDependente = 0;
        for (Dependente d : this.filhos){
            System.out.println("Idade do dependente: " + d.idade);
        }

    }

    public double salarioBonus() {
        return this.wage + (tpMeses * 15);

    }
    public double calculaGratifDependente(){

        return this.contarFilhosIdadeLimite(18) * 50;
    }

    public double salarioMensal(){
        return this.salarioBonus() + this.calculaGratifDependente();
    }
}
