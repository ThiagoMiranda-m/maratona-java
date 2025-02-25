package javacoreintroclasses.test;

import javacoreintroclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 19;
        estudante.sexo = 'M';
        estudante.nome = "Thiago";

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }

}
