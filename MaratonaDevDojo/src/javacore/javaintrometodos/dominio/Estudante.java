package javacore.javaintrometodos.dominio;

public class Estudante {
    public String nome = "Cuscuz";
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println("_________________");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
    
}
