package javacore.javaintrometodos.test;

import javacore.javaintrometodos.dominio.Calculator;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculator calculadora = new Calculator();
        double result = calculadora.divideDoisNumeros(20, 10);
        System.out.println(result);
        System.out.println("-----------------");
        calculadora.imprimeDivisaoDeDoisNumeros(15,0);


    }
}
