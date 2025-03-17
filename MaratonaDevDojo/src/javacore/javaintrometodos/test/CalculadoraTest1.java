package javacore.javaintrometodos.test;

import javacore.javaintrometodos.dominio.Calculator;

public class CalculadoraTest1 {
    public static void main(String[] args) {
        Calculator calculadora = new Calculator();

        calculadora.somaDoisNumeros();
        System.out.println("Finalizando calculadora");
        calculadora.subtraiDoisNumeros();
    }
}
