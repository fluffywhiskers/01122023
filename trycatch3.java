import java.util.Scanner;

public class trycatch3 {
    public static void main(String[] args) {
        try {
        Scanner scIdade = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        short idade = scIdade.nextShort();
        scIdade.close();

        if (idade > 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
            }   catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e);
    }
    }
}
