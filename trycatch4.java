import java.util.Scanner;

public class trycatch4 {
    public static void main(String[] args) {
    try {
        Scanner scQuantia = new Scanner(System.in);
        System.out.println("Digite o valor da quantia que deseja depositar");
        long quantia = scQuantia.nextLong();
        scQuantia.close();

        if (quantia > 1500000000000000000L) {
            System.out.println("Valor muito alto para depósito. Tente outro valor.");
        } else {
            System.out.println("Valor depositado com sucesso.");
        }
    } catch (Exception e) {
        System.out.println("Ocorreu um erro: " + e);
    }
 }    

}
