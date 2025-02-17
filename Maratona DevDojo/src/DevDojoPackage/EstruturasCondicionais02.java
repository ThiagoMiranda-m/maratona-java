package DevDojoPackage;
import java.util.Scanner;

public class EstruturasCondicionais02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade = scan.nextInt();
        String categoria;

        if(idade < 15){
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }  
        System.out.println(categoria);

        scan.close();
    }
}
