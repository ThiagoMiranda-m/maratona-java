package Introducao;
import java.util.Scanner;

public class EstruturasCondicionais05 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    byte diaSemana = scan.nextByte();
    
    switch(diaSemana){
        case 1,7:
            System.out.println("Final de semana");
            break;
        case 2,3,4,5,6:
            System.out.println("Dia da semana");
            break;
        default:
            System.out.println("Dia invalido");
            break;
    }
    scan.close();
}
}