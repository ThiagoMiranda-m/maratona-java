package javacoreintroclasses.test;

import javacoreintroclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nomeProfessor = "Abóbora";
        professor.idadeProfessor = 60;
        professor.sexoProfessor = 'M';

        System.out.println("Nome " + professor.nomeProfessor + " idade: " + professor.idadeProfessor + " sexo: " + professor.sexoProfessor);
    }
}
