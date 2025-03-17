package javacore.IntroClasses.test;
import java.util.Scanner;
import javacore.IntroClasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.ano = 2016;
        carro1.Modelo = 1.5;
        carro1.Nome = "Fiesta";

        carro2.ano = 2020;
        carro2.Nome = "Civic";
        carro2.Modelo = 2.0;

        carro1 = carro2;

        System.out.println("Carro 1: \nAno: " + carro1.ano + "\nModelo: " +carro1.Modelo + "\nNome: "+carro1.Nome);
        System.out.println("-----------------------------");
        System.out.println("Carro 2: \nAno: " + carro2.ano + "\nModelo: " +carro2.Modelo + "\nNome: "+carro2.Nome);

    }
}
