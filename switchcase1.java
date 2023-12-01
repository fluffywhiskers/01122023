import java.util.*;

public class switchcase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cores = {"Amarelo", "Azul", "Verde", "Vermelho", "Branco"};
        for (int c = 0; c < cores.length; c++) {
            System.out.println("Cor [" + c + "] - " + cores[c]);
        }
        System.out.println("Digite o código de uma das cores acima: ");
        short cor = sc.nextShort();

        switch (cor) {
            case 0:
                System.out.println("Amarelo selecionado.");
                break;
            case 1:
                System.out.println("Azul selecionado.");
                break;
            case 2:
                System.out.println("Verde selecionado.");
                break;
            case 3:
                System.out.println("Vermelho selecionado.");
                break;
            case 4:
                System.out.println("Branco selecionado.");
                break;
        
            default:
                System.out.println("Nenhuma cor selecionada.");
                break;
        }

        sc.close();
        /*System.out.println("Selecione uma cor de acordo com os números abaixo:");
        System.out.println("(1) Amarelo");
        System.out.println("(2) Azul");
        System.out.println("(3) Verde");
        System.out.println("(4) Vermelho");
        System.out.println("(5) Branco");
        
        int corSelecionada = sc.nextInt();

        sc.close();

        switch (corSelecionada) {
            case 1:
                System.out.println("Selecionou Amarelo!");
                break;
            case 2:
                System.out.println("Selecionou Azul!");
                break;
            case 3:
                System.out.println("Selecionou Verde!");
                break;
            case 4:
                System.out.println("Selecionou Vermelho!");
                break;
            case 5:
                System.out.println("Selecionou Branco!");
                break;
            default:
                System.out.println("Nenhuma opção selecionada.");
                break;
        }*/

    }
}
