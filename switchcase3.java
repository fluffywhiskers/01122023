import java.util.*;


public class switchcase3 {
    public static void ligarDesligarVentilador(int interruptor) {
        switch (interruptor) {
            case 0:
                System.out.println("Ventilador desligado!");
                break;
            case 1:
                System.out.println("Ventilador ligado!");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
    public static void main(String[] args) {
        try {
            boolean ventiladorLigado = false;
            boolean sair = false;
            Scanner scnLigarDesligarVentilador = new Scanner(System.in);
            String opcaoUsuario;
            while (sair == false) {
                if (ventiladorLigado == false) {
                    System.out.println("Digite \"ligar\" e tecle Enter para ligar o ventilador, ou digite \"sair\" e tecle Enter para sair");
                    opcaoUsuario = scnLigarDesligarVentilador.nextLine().toUpperCase();
                    switch (opcaoUsuario) {
                        case "LIGAR":
                            ligarDesligarVentilador(1);
                            ventiladorLigado = true;
                            break;
                        case "SAIR":
                            sair = true;
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                } else {
                    System.out.println("Digite \"desligar\" e tecle Enter para desligar o ventilador, ou digite \"sair\" e tecle Enter para sair");
                    opcaoUsuario = scnLigarDesligarVentilador.nextLine().toUpperCase();
                    switch (opcaoUsuario) {
                        case "DESLIGAR":
                            ligarDesligarVentilador(0);
                            ventiladorLigado = false;
                            break;
                        case "SAIR":
                            sair = true;
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                }
            }
            scnLigarDesligarVentilador.close();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro " + e);
        }
    }
}