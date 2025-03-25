package javacore.javaintrometodos.test;

import javacore.javaintrometodos.dominio.Funcionario;


public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Thiago");
        funcionario.setIdade(15);
        funcionario.setSalarios(new double[]{1200, 987.3, 2000});

        funcionario.imprimiDados ();
        System.out.println("-------------");
        funcionario.mediaSalario();

    }
}
