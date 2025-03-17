package Introducao;

public class PrimitivoOperadores {
    public static void main(String[] args) {
        int numero1 = 10;
        double numero2 = 20;
        double resultado = numero1/numero2;

        System.out.println(resultado);


        // %
        int resto = 21 % 7;
        System.out.println(resto);

        //< > <= >= ==, =!

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 20;
        boolean isDezDiferenteDez = 10 != 12;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);

        // &&(AND), || (or), !(NOT)

        int idade = 35;
        float salario = 3500;

        boolean isDentroDaLeiMaiorQueTrinta = idade  > 30 && salario >= 4612;
        
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >=3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationCincoCompravel: " + isPlaystationCincoCompravel);

        // = += -= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);
        int contador2 = 0;
        System.out.println(++contador2);
    }
}


