package javacore.Construtores.dominio;

public class comida {
    private String nome;
    private String tipo;
    private int quantidade;
    private String estado;

    public comida(String nome, String tipo, int quantidade, String estado){
        System.out.println("Dentro do construtor");
        this.nome = nome;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.estado = estado;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.quantidade);
        System.out.println(this.estado);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
