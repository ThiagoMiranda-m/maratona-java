package javacore.javaintrometodos.test;

import javacore.javaintrometodos.dominio.Calculator;

public class CalculadoraTest05 {
    public static void main(String... args) {
        Calculator calculadora = new Calculator();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
    
}
