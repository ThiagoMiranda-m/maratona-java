package javacore.javaintrometodos.test;

import javacore.javaintrometodos.dominio.Funcionario;


public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Thiago";
        funcionario.idade = 15;
        funcionario.salarios = new double[]{1200, 987.3, 2000};

        funcionario.imprimiDados ();
        System.out.println("-------------");
        funcionario.mediaSalario();

    }
}
