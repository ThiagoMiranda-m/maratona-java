package DevDojoPackage;
import java.util.Scanner;

public class EstruturasCondicionais04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double salarioAnual = 45000;

        if(salarioAnual < 34713){
            salarioAnual = salarioAnual * (9.70 / 100);
            System.out.println("Seu salario com taxas: "+salarioAnual);
        } else if (salarioAnual >= 34713 && salarioAnual < 68508){
            salarioAnual = salarioAnual * (37.35/100);
            System.out.println("Seu salario com taxas: "+salarioAnual);
        } else {
            salarioAnual = salarioAnual * (49.50 / 100);
            System.out.println("Seu salario com taxas: "+salarioAnual);
        }

        scan.close();
}
}
