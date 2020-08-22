package com.pucpr;

import java.util.ArrayList;

public class Funcionario {
    public int cod;
    public double wage;
    protected ArrayList<Dependente> filhos = new ArrayList<Dependente>();

    public boolean adicionaDependente(Dependente d){
        if(filhos.size() >= 5) {
            System.out.println("Você só pode cadastrar no máximo 5 dependentes!");
            return false;
        }
        else{
            filhos.add(d);
            return true;
        }
    }

    public double contarFilhosIdadeLimite(int idade) {

        int contaFilhos = 0;
        for (Dependente dep : this.filhos) {
            if (dep.idadeLimite(idade)) {
                contaFilhos++;
            }
        }
        return contaFilhos;
    }

    public void imprimeFuncionario(){
        System.out.println("Código do Funcionário: " + this.cod);
    }

    public double salarioMensal(){
        return 0;
    }
}
