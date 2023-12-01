import java.util.*;

public class trycatch5 {
    public static boolean validarInteger(String erro) {
        boolean retornar = false;
        if (Integer.valueOf(erro) > 2147483647) {
            throw new InputMismatchException("O valor inteiro é maior do que o permitido.");
            
        } else if (Integer.valueOf(erro) <= 2147483647) {
            System.out.println("Valor aceito.");
        } else {
            Integer[] numeros = {0,1,2,3,4,5,6,7,8,9};
            boolean achouInteiro = false;
            boolean achouString = false;
            for (int n = 0; n < erro.length(); n++) {
                achouInteiro = false;
                for (int i = 0; i < numeros.length; i++) {
                    if (numeros[i] == Integer.valueOf(erro.substring(n, n + 1))) {
                        achouInteiro = true;
                    }
                }
                if (achouInteiro == false) {
                    achouString = true;
                }
            }
            if (achouString == true) {
                throw new InputMismatchException ("Caracter não númerico na digitação. Digite novamente.");
            } else {
                System.out.println("Valor aceito pelo sistema. Prosseguindo...");
                retornar = true;
            }
        }
        return retornar;
    }
    
    public static void main(String[] args) {
        try {
            boolean identificouValor = false;
            Scanner scValor = new Scanner(System.in);
            
            while (identificouValor == false) {
                System.out.println("Digite um valor: ");
                int valor = scValor.nextInt();
                
                if (validarInteger(String.valueOf(valor)) == true) {
                    identificouValor = true;
                }
            }
            scValor.close();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e);
        }
    }

}
