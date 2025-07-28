import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
//Importei 3 bibliotecas, uma para o scanner, outra para o arraylist e outra para poder printar o erro InputMismatchException

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
            // Coloquei scanner dentro do try catch que engloba toda a aplicação para poder
            // fechar o scanner.
            int numeroHabilidadesUtilizadas = 0;
            // Declarando e iniciando a variavel que vai ser responsável por armazenar o
            // numero de habilidades utilizadas
            String habilidadeDigitada;
            // Declarando a variável que será responsavel por armazenar a hanilidade
            // utilizada
            ArrayList<String> habilidade = new ArrayList<>();
            // Declarando e iniciando o tipo do ArrayList e começando uma nova instancia.
            System.out.println("============= Bem-vindo ao simulador de combos ============");
            System.out.println("Quantas habilidade você utilizou no seu combo?");
            System.out.print("Digite aqui: ");
            // Menu para interagir com o usuário

            while (true) {
                // Fiz um while para sempre voltar se for lido uma informação inválida.
                try {
                    numeroHabilidadesUtilizadas = scanner.nextInt();
                    scanner.nextLine();
                    // Try catch para garantir que será digitado um número e não letra ou simbolos.
                    // Scanner para limpar o terminal
                    break;
                    // Quando for verdade vai finalizar o while e continuar o programa.
                } catch (InputMismatchException e) {
                    // Aqui declaro qual tipo de erro vai ser tratado.
                    System.out.println(
                            "Você digitou algo inválido. Por favor tente novamente e digite um numero inteiro.");
                    scanner.nextLine();
                    // Print para mostrar que o erro foi detectado.
                    // Scanner para limpar o terminal.

                }
            }
            for (int i = 1; i <= numeroHabilidadesUtilizadas; i++) {
                // For para fazermos a interação do combo na lista
                while (true) {
                    // While responsavel pela validação dos dados que o usuário vai digitar.
                    System.out.println("Digite a habilidade que vc utilizou.\nEx:Q,W,E,R");
                    // Print solicitando ao usuário as habilidade utilizadas.
                    habilidadeDigitada = scanner.next();
                    // Ler as habilidades utilizadas

                    if (habilidadeDigitada.matches("[qwerQWER]")) {
                        habilidade.add(habilidadeDigitada);
                        // Usei uma validação com regex para poder aceitar apenas as letras Q W E R
                        // separadas e depois adicionar na ArrayList com .add recebendo como parametro
                        // as informações fornecidas no for acima.
                        break;
                        // Utilizo break para finalizar o while.
                    } else {
                        System.out.println("Erro: Digite apenas Q, W, E ou R.");
                        // Else para se caso for digitado algo fora do regex.
                    }
                }
            }
            System.out.println("==== COMBO EXECUTADO ====");
            for (int i = 0; i < habilidade.size(); i++) {
                System.out.println((i + 1) + " - " + habilidade.get(i).toUpperCase());
                // For criado para printar nosso arraylist da forma solicitada pelo enunciado,
                // pegando como base os dados digitados e o tamanho do arraylist para interação.
            }
        }

    }
}
