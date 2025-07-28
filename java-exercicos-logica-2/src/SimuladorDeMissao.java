import java.util.Scanner;

/**
 * 2. Simulador de Missão
 * 
 * Implemente um menu com 3 missões:
 * 1 - Caçar Monstros (For)
 * 
 * 2 - Defender a Base (While)
 * 
 * 3 - Patrulhar a Rota (Do While)
 * 
 * Cada missão imprime uma sequência de ações.
 */
public class SimuladorDeMissao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Iniciando a classe scanner.

        int selecioneOpcao = 0;
        // Inicialização da váriavel que será reponsável pelo menu.
        // Optei por int para seguir o que foi pedido no enunciado.

        String sair;
        // Inicialização da váriavel que será utilizada para sair do loop PATRULHAR
        // TROPA.

        System.out.println("Bem vindo ao League of Basics, selecione uma das opçoes abaixo para fazer o básico:");
        System.out.println("==== Menu League of Basics ====");
        System.out.println("[1] - Caçar Monstro");
        System.out.println("[2] - Defender a Base");
        System.out.println("[3] - Patrulhar Rota");
        System.out.println("===============================");
        System.out.print("Escolha uma opção:");
        // Menu que será apresentado para o usuário.
        while (true) {
            try {
                // Try/Catch para tratamento de possiveis erros de digitação do usuário.

                selecioneOpcao = scanner.nextInt();
                // Solicitação do input do usuário.

                limparTerminal();
                // Classe para limpar o terminal
                break;
            } catch (Exception e) {
                System.out.println("Você digitou algo inválido. Tente novamente com um número.");
                System.exit(0);
            }
        }
        switch (selecioneOpcao) {
            // Recebeu como parametro a váriavel SELECIONE OPCAO
            // Como temos algumas opções à escolher optei por fazer um switch case.

            case 1:
                // No primeiro case é a caça aos monstros.

                System.out.println("=== Vamos caçar alguns monstros! ===");
                System.out.println("Quantos monstros voce quer farmar?");
                System.out.print("Digite aqui a quantidade:");
                // Aqui eu fiz uma interação com o usuário para que ele passe o numero de farm
                // que ele quer realizar, com um pequeno menu.

                int quantidadeDeMinions;
                // Inicializo a variavel fora do for para que ele mantenha o valor.

                quantidadeDeMinions = scanner.nextInt();
                // Solicito ao usuário a quantidade, utilizo int pois no lol não existe metade
                // de um farm, geralmente é somado de um a um ou tem alguns monstros que
                // equivalem a dois.

                limparTerminal();
                // Classe para limpar o terminal

                for (int i = 0; i < quantidadeDeMinions; i++) {
                    // faço um laço for para que mostre ao usuário que ele está farmando um a um.

                    System.out.println("Farmou " + (i + 1) + ((i + 1) == 1 ? " minion" : "minions"));
                    // Utilização do ternário para falar que o primeiro minion é no singular e
                    // apartir do segundo é plural

                }
                break;
            // Break incerrando o programa

            case 2:
                // No segundo caso eu fiz uma interação com o usuário para defendermos a base.

                System.out.println("=== Vamos defender a base! ===");
                System.out.println("Quantos inimigos vc precisa derrotar para defender a base?");
                System.out.print("Digite a quantidade aqui:");
                // Um pequeno menu para o usuário digitar quantos inimigos ele vai ter que
                // bater para proteger a base.

                int quantidadeDeInimigos;
                int quantidadeDeInimigosDerrotados = 0;
                // Variaveis iniciada fora do while para não dar conflito na lógica dentro do
                // while, quantidadeDeInimigos armazena o valor inputado pelo usuário e
                // quantidadeDeInimigosDerrotados será armazenado o incremento toda vez que um
                // inimigo for eliminado.

                quantidadeDeInimigos = scanner.nextInt();
                // Solicito a quantidade de inimigos a serem eliminados.

                limparTerminal();
                // Classe para limpar o terminal
                System.out.println("Sua base esta sendo invadida!\nVoce precisa eliminar " + quantidadeDeInimigos
                        + " inimigos para nao perder a partida!");
                // Mostrei ao usuário que os dados que ele digitou realmente estão armazenados e
                // que a batalha vai começar.
                while (quantidadeDeInimigos != 0) {
                    // Aqui começa, a lógica aqui é manter o loop enquanto a quantidade de inimigos
                    // for diferente de 0.

                    quantidadeDeInimigos--;
                    // Faço um decremento dos inimigos para para mostrar no print que um inimigo ja
                    // foi derrotado.
                    quantidadeDeInimigosDerrotados++;
                    // Faço um incremento para mostrar no print quantos inimigos ja foram
                    // eliminados.
                    if (quantidadeDeInimigosDerrotados <= 1) {
                        // Fiz essa pequena lógica para mostrar o primeiro inimigo derrotado mantendo o
                        // portugues. Ou seja se quantidadeDeInimigosDerrotados for menor ou igual a um
                        // vai entrar aqui, a ideia é passar apenas uma vez.

                        System.out.println(
                                quantidadeDeInimigosDerrotados + "º inimigo derrotado ainda faltam "
                                        + quantidadeDeInimigos);
                        // Print com os valores concatenados

                    } else if (quantidadeDeInimigosDerrotados > 1 && quantidadeDeInimigos != 0) {
                        // Else if para manter a interação com os valores normais sem ser o primeiro

                        System.out.println(quantidadeDeInimigosDerrotados + " inimigos foram derrotados ainda"
                                + (quantidadeDeInimigos == 1 ? " falta " : " faltam ")
                                + quantidadeDeInimigos);
                        // Aqui a gente fez a interação com variaveis concatenadas
                        // Concatenei com ternário e deu certo kkkk que doidera

                    } else {
                        System.out.println("Todos os " + quantidadeDeInimigosDerrotados
                                + " inimigos foram derrotados, pode descansar guerreiro!");
                    }
                }
                System.out.println("Parabéns!\nVocê eliminou todos os inimigos e salvou a base!");
                // Ao final de tudo uma mensagem de que eliminamos todos os adversários.

                break;
            // Break incerrando o programa

            case 3:
                do {
                    // Usei do while para printar a patrulha até o usuário querer finalizar o
                    // programa.

                    System.out.println("=== A patrulha vai começar! ===");
                    System.out.println("Saindo da base...");
                    System.out.println("Indo para a lane...");
                    System.out.println("Trocando uns socos...");
                    System.out.println("Farmando...");
                    System.out.println("Voltando para a base...");
                    System.out.println("=== A patrulha foi finalizada! ===");
                    // Interção visual com o usuário.

                    System.out.print("Digite 'S' para sair do loop da patrulha:");
                    // Solicito o S para sair do (do while) programa e finalizar

                    sair = scanner.next();
                    // Input do usuário/interção

                    limparTerminal();
                    // Classe para limpar o terminal

                } while (!sair.equalsIgnoreCase("S"));
                // Condição para sair do programa, equanto a string "sair" for diferente de 'S'
                // ignorando o Caps ele vai continuar printando e continuando a patrulha.

                System.out.println("FIM!");
                // Ao sair printa uma mensagem de fim.

                break;
            // Break incerrando o programa

            default:
                System.out.println("Opção não encontrada, tente novamente!");
                // Mensagem se o usuário digitar algo que não seja o solicitado.

                break;
            // Break incerrando o programa
        }
        scanner.close();
        // Fechamento da nossa classe scanner.
    }

    public static void limparTerminal() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
