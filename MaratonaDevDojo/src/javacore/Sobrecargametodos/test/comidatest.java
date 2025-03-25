package javacore.Sobrecargametodos.test;

import javacore.Sobrecargametodos.dominio.comida;

public class comidatest {
    public static void main(String[] args) {
        comida comida = new comida();
        
        comida.init("Laranja", "Fruta", 4, "Boa");
        comida.imprime();
    }
}
