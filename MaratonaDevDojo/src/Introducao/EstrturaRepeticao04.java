package Introducao;

public class EstrturaRepeticao04 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        double valorParcela;
        int numeroParcelas;

        for(numeroParcelas = 1; numeroParcelas <= valorTotal; numeroParcelas++){
            valorParcela = valorTotal / numeroParcelas;

            if(valorParcela >= 1000){
                System.out.println("Parcela " +numeroParcelas+ " R$ "+valorParcela);
            } else{
                break;
            }
        }
    }
}
