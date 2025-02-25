package javacore.IntroClasses.test;

import javacore.IntroClasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();

        estudante.nome = "Ameixa";
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println("----------------");
        System.out.println(estudante1.sexo);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.nome);
    }

}
