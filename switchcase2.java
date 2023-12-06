import java.util.*;

public class switchcase2 {
    public static void main(String[] args) {
        try {
            String[] comodos = {"Sala","Cozinha","Banheiro","Quarto","Copa"};
            Scanner sc = new Scanner(System.in);
            for (int c = 0; c < comodos.length; c++) {
                System.out.println("Código [ " + c + " ] " + comodos[c]);
            }
            System.out.println("Digite o código relacionado ao cômodo desejado para interagir com a luz");

            switch (sc.nextInt()) {
                case 0:
                    System.out.println("Luz do cômodo " + comodos[0] + " acesa.");
                    break;
                case 1:
                    System.out.println("Luz do cômodo " + comodos[1] + " acesa.");
                    break;
                case 2:
                    System.out.println("Luz do cômodo " + comodos[2] + " acesa.");
                    break;
                case 3:
                    System.out.println("Luz do cômodo " + comodos[3] + " acesa.");
                    break;
                case 4:
                    System.out.println("Luz do cômodo " + comodos[4] + " acesa.");
                    break;
            
                default:
                    System.out.println("Erro.");
                    break;
            }

            sc.close();

        } catch (Exception e) {
            System.out.println("Erro Inesperado: " + e);
        }
    }
}
