import java.util.Scanner;

/**
 * Se XP < 1000 → Ferro
 * XP entre 1000 e 2000 → Bronze
 * XP entre 2001 e 5000 → Prata
 * XP entre 5001 e 8000 → Ouro
 * XP > 8000 → Platina
 */
public class VerificadorDeNivel {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o quanto de experiencia você adquiriu para saber seu elo onde.");
            System.out.println("============ TABELA DE ELO ============");
            System.out.println("*       0 ATÉ 1000 = FERRO            *");
            System.out.println("*       1000 ATÉ 2000 = BRONZE        *");
            System.out.println("*       2001 ATÉ 5000 = PRATA         *");
            System.out.println("*       5001 ATÉ 8000 = OURO          *");
            System.out.println("*       8000 ATÉ INFINITY = PLATINA   *");
            System.out.println("=======================================");
            System.out.print("Digite aqui...\n");

            try {
                Double experiencia = scanner.nextDouble();

                if (experiencia < 0) {
                    throw new Exception("Erro. Volte e digite um valor positivo.");
                } else if (experiencia <= 1000) {
                    System.out.println("Ferro");
                } else if (experiencia <= 2000) {
                    System.out.println("Bronze");
                } else if (experiencia <= 5000) {
                    System.out.println("Prata");
                } else if (experiencia <= 8000) {
                    System.out.println("Ouro");
                } else {
                    System.out.println("Platina");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
