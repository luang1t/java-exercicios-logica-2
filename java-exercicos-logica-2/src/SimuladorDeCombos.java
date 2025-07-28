import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 * 5. Simulador de Combo
 * Pergunte quantas habilidades o jogador usou
 * 
 * Mostre um combo numerado (ex: Q, W, E, R)
 * 
 * Use for ou while
 */

public class SimuladorDeCombos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numeroHabilidadesUtilizadas = 0;
            String habilidadeDigitada;
            ArrayList<String> habilidade = new ArrayList<>();
            System.out.println("============= Bem-vindo ao simulador de combos ============");
            System.out.println("Quantas habilidade você utilizou no seu combo?");
            System.out.print("Digite aqui: ");

            while (true) {
                try {
                    numeroHabilidadesUtilizadas = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println(
                            "Você digitou algo inválido. Por favor tente novamente e digite um numero inteiro.");
                    scanner.nextLine();

                }
            }
            for (int i = 1; i <= numeroHabilidadesUtilizadas; i++) {
                while (true) {
                    System.out.println("Digite a habilidade que vc utilizou.\nEx:Q,W,E,R");

                    habilidadeDigitada = scanner.next();

                    if (habilidadeDigitada.matches("[qwerQWER]")) {
                        habilidade.add(habilidadeDigitada);
                        // Volta para o usuário digitar novamente.
                        break;
                    } else {
                        System.out.println("Erro: Digite apenas Q, W, E ou R.");
                    }
                }
            }
            System.out.println("==== COMBO EXECUTADO ====");
            for (int i = 0; i < habilidade.size(); i++) {
                System.out.println((i + 1) + " - " + habilidade.get(i).toUpperCase());
            }
        }

    }
}
