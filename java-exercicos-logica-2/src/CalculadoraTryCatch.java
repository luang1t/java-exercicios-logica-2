import java.util.Scanner;
//Importando a biblioteca Scanner.

/**
 * 3. Calculadora com Try/Catch
 * Peça dois números ao usuário e uma operação: + - * /
 * 
 * Use try/catch para capturar divisão por zero
 * 
 * Exiba a mensagem “Erro: divisão por zero não permitida” se acontecer
 */
public class CalculadoraTryCatch {
    public static void main(String[] args) {
        // Método principal que serve como ponto de entrada da aplicação.

        try (Scanner scanner = new Scanner(System.in)) {
            // Iniciando a instância de um objeto da classe Scanner.

            char operador;
            Double primeiroValor;
            Double segundoValor;
            // Iniciando as váriaveis que serão utilizadas no projeto.

            System.out.println("Escolha uma das operações digitando o sinal delas:\n+ , - , * ou /");

            try {
                operador = scanner.next().charAt(0);
                // Solicitando ao usuário qual operação ele deseja fazer.
                // Usando try para validar.

            } catch (Exception e) {
                System.out.println("Você digitou algo inválido. Tente novamente com os símbolos\n+ , - , * ou /");
                // Mostrando uma mensagem de erro caso o usuário escrever algo que não
                // corresponde ao que se foi solicitado.

                return;
                // Encerra o programa.

            }

            switch (operador) {
                // Utilização do switch com a váriavel 'operador' que é do tipo char para
                // selecionar a operação utilizando o símbolo da mesma.

                case '+':
                    System.out.println("Digite o primeiro valor:");
                    primeiroValor = scanner.nextDouble();
                    // Leitura do primeiro valor.

                    System.out.println("Digite o segundo valor:");
                    segundoValor = scanner.nextDouble();
                    // Leitura do segundo valor.

                    Double soma = primeiroValor + segundoValor;
                    System.out.println("Resultado da soma:\n" + primeiroValor + " + " + segundoValor + " = "
                            + soma);
                    // Soma e print do resultado.

                    break;
                // Encerra o programa depois de passar por esse case.

                case '-':
                    System.out.println("Digite o primeiro valor:");
                    primeiroValor = scanner.nextDouble();
                    // Leitura do primeiro valor.

                    System.out.println("Digite o segundo valor:");
                    segundoValor = scanner.nextDouble();
                    // Leitura do segundo valor.

                    Double subtracao = primeiroValor - segundoValor;
                    System.out.println("Resultado da subtração:\n" + primeiroValor + " - " + segundoValor + " = "
                            + subtracao);
                    // Subtração e print do resultado.

                    break;
                // Encerra o programa depois de passar por esse case.

                case '*':
                    System.out.println("Digite o primeiro valor:");
                    primeiroValor = scanner.nextDouble();
                    // Leitura do primeiro valor.

                    System.out.println("Digite o segundo valor:");
                    segundoValor = scanner.nextDouble();
                    // Leitura do segundo valor.

                    Double multiplicacao = primeiroValor * segundoValor;
                    System.out.println("Resultado da multiplicação:\n" + primeiroValor + " * " + segundoValor + " = "
                            + multiplicacao);
                    // Multiplicação e print do resultado.

                    break;
                // Encerra o programa depois de passar por esse case.

                case '/':
                    try {
                        // Iniciei um try/catch para poder passar uma mensagem de erro dizendo que não é
                        // possivel dividir por 0.

                        System.out.println("Digite o primeiro valor:");
                        primeiroValor = scanner.nextDouble();
                        // Leitura do primeiro valor.

                        System.out.println("Digite o segundo valor:");
                        segundoValor = scanner.nextDouble();
                        // Leitura do segundo valor.

                        if (segundoValor == 0) {
                            throw new ArithmeticException("Divisão por 0 não permitida");
                            // Aqui eu usei uma forma para jogar o erro 'ArithmeticException' se o
                            // segundoValor for == 0 pois ao usar double ele consegue dividir por 0 e sem
                            // lançar o erro automaticamente, retornando valores como 'Infinity',
                            // '-Infinity' ou 'NaN'.

                        } else {
                            Double resultadoDivisao = primeiroValor / segundoValor;
                            System.out.println("Resultado da divisão:\n" + primeiroValor + " / " + segundoValor + " = "
                                    + resultadoDivisao);

                            // Se o segundoValor não for == a 0 cai nesse else e faz a operação de divisão
                        }
                    } catch (ArithmeticException e) {
                        System.out.println("Erro: " + e.getMessage());
                        // vai verificar se é 'ArithmeticException e' caso o segundo numero for == 0 e
                        // printar o erro de divisão por 0
                    } catch (Exception e) {
                        System.out.println("Digitou algo que não solicitado\nErro: " + e.getMessage());
                        // Se o usuário digitar alguma letra ou simbolo nas operações exibe primeiro
                        // o'Exception e'
                    }
                    break;
                // Encerra o programa depois de passar por esse case.

                default:
                    System.out
                            .println("Você digitou algo que não corresponde ao objetivo do sistema. Tente novamente!");
                    // Default responsavel por mostrar se ele digitar algo logo no começo.

                    return;
                // Encerra o programa.

            }

            // Fecha o scanner utilizado na aplicação
        }
    }
}
