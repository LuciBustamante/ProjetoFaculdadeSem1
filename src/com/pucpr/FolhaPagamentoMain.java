package com.pucpr;

import java.util.ArrayList;
import java.util.Scanner;

public class FolhaPagamentoMain {

    public static ArrayList<Funcionario> funcionarios;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de funcionário que receberão a folha de pagamento: ");
        int qdtFolhaPgto = teclado.nextInt();
        teclado.nextLine();

        funcionarios = new ArrayList<Funcionario>();

        int cont = 0;
        while (cont < qdtFolhaPgto) {

            System.out.println("Informe o código do funcionário: ");
            int cod = teclado.nextInt();
            teclado.nextLine();

            System.out.println("Informe o tipo: ");
            System.out.println("1 - Concursado");
            System.out.print("2 - Temporário\n");
            int imTipo = teclado.nextInt();
            teclado.nextLine();

            System.out.println("Informe o valor do salário: ");
            double wage = teclado.nextDouble();teclado.nextLine();

            System.out.println("Quantos dependentes este funcionário possuí? ");
            int qtdFilhos = teclado.nextInt();teclado.nextLine();

            ArrayList<Dependente> filhos = new ArrayList<Dependente>();

            int i = 0;
            while (i < qtdFilhos) {
                System.out.println("Dependente: " + i);

                System.out.println("Informe a idade: ");
                int idadeDep = teclado.nextInt();teclado.nextLine();

                Dependente d = new Dependente(idadeDep);
                filhos.add(d);

                i++;
            }



            if (imTipo == 1) {

                System.out.println("Informe quantos ANOS de trabalho: ");
                int tpAno = teclado.nextInt();teclado.nextLine();

                FuncionarioConcursado funcionario = new FuncionarioConcursado(cod, wage, tpAno);

                for (Dependente d : filhos) {
                    funcionario.adicionaDependente(d);
                }
                funcionarios.add(funcionario);

            } else {

                System.out.println("Informe quantos MESES de trabalho: ");
                int tpMeses = teclado.nextInt();
                teclado.nextLine();

                FuncionarioTemporario funcionario = new FuncionarioTemporario(cod, wage, tpMeses);

                for (Dependente d : filhos){
                    funcionario.adicionaDependente(d);
                }
                funcionarios.add(funcionario);
            }
            cont++;
        }

        for (Funcionario funcionario : funcionarios) {
            funcionario.salarioMensal();
        }
        for (Funcionario funcionario : funcionarios) {
            funcionario.imprimeFuncionario();
        }

    }
}