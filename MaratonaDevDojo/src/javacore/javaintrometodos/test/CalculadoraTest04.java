package javacore.javaintrometodos.test;

import javacore.javaintrometodos.dominio.Calculator;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculator calculadora = new Calculator();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDOisNumeros(num1, num2);
        System.out.println("Dentro do CalculadoraTest04");
        System.out.println("num1 " +num1);
        System.out.println("num2 " +num2);
    }
    
}
