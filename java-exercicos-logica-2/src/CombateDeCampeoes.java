import java.util.Scanner;

/**
 * 1. Combate de Campeões
 * Crie um programa que simule um combate entre dois campeões. O usuário digita
 * o nome e o poder de ataque de dois campeões. O que tiver maior poder vence.
 */

public class CombateDeCampeoes { // Iniciando a classe.

    public static void main(String[] args) { // Iniciando o main.
        Scanner scanner = new Scanner(System.in); // Iniciando e declarando o nome do scanner.

        String nomePrimeiroCampeao, nomeSegundoCampeao;
        Double poderDoAtaquePrimeiroCampeao = 0.0, poderDoAtaqueSegundoCampeao = 0.0;
        // Declarando as variaveis que serao utilizadas.

        System.out.println("Digite o nome do 1º seu campeao:");
        nomePrimeiroCampeao = scanner.next();

        System.out.println("Qual o total de damage do 1º seu campeao:");
        poderDoAtaquePrimeiroCampeao = scanner.nextDouble();

        System.out.println("Digite o nome do 2º seu campeao:");
        nomeSegundoCampeao = scanner.next();

        System.out.println("Qual o total de damage do 2º seu campeao:");
        poderDoAtaqueSegundoCampeao = scanner.nextDouble();// Recolhimento de dados pelo usuário.

        combate(nomePrimeiroCampeao, nomeSegundoCampeao, poderDoAtaquePrimeiroCampeao, poderDoAtaqueSegundoCampeao);
        // chamando metodo combate onde fica a logica do programa pegando como parametro
        // as informações recolhidas pelo usuário.
        scanner.close();
    }

    public static void combate(String nomePrimeiroCampeao, String nomeSegundoCampeao,
            Double poderDoAtaquePrimeiroCampeao, Double poderDoAtaqueSegundoCampeao) {
        // Chamo as variaveis trazendo elas como parametro para serem usadas na minha
        // logica.
        if (poderDoAtaquePrimeiroCampeao.equals(poderDoAtaqueSegundoCampeao)) {
            System.out.println("Empatou");
            // No if comparei com .equals pois ao compara Doubles acontece de não armazenar
            // o valor 100% correto e com .equals é possivel dar mais acertividade.

        } else if (poderDoAtaqueSegundoCampeao < poderDoAtaquePrimeiroCampeao) {
            System.out.println("O " + nomePrimeiroCampeao + " venceu a batalha com " + poderDoAtaquePrimeiroCampeao
                    + " poder de ataque!");
            System.out.println("O " + nomeSegundoCampeao + " perdeu a batalha com " + poderDoAtaqueSegundoCampeao
                    + " poder de ataque!");
            // Nesse else if fiz outra comparação para ver se o primeiro é maior que o
            // segundo.

        } else {
            System.out.println("O " + nomeSegundoCampeao + " venceu a batalha com " + poderDoAtaqueSegundoCampeao
                    + " poder de ataque!");
            System.out.println("O " + nomePrimeiroCampeao + " perdeu a batalha com " + poderDoAtaquePrimeiroCampeao
                    + " poder de ataque!");
            // E aqui o else acaba pegando a ultima exceção que seria o segundo ser mais
            // forte que o primeiro.
        }
    }
}