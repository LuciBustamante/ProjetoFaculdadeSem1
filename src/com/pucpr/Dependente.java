package com.pucpr;

public class Dependente{

    public int idade;

    public Dependente(int idade){
        this.idade = idade;
    }

    public boolean idadeLimite(int idadeMax){
        return this.idade <= idadeMax;
    }

}
