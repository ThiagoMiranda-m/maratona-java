package Introducao;

public class Arrays02 {
    public static void main(String[] args) {
                  //Espaço em branco 
        //byte, short, int, lang, float, e double = 0
        //char '\u0000'
        //Boolean false
        //String null
        String []nome = {"Thiago", "Andre", "Neves", "Miranda"};

        for(int i = 0; i < nome.length; i++){
            System.out.println(nome[i]);
        }

        String [] idade = new String[2];
        idade[0] = "12";
        idade[1] = "20";

    }
    
    
}
