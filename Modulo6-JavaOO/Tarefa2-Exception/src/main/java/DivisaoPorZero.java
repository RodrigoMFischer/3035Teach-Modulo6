import java.util.Scanner;

public class DivisaoPorZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numerador:");
        int numerador = scanner.nextInt();

        System.out.println("Digite o denominador:");
        int denominador = scanner.nextInt();

        scanner.close();

        try {
            int resultado = dividir(numerador, denominador);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
    }

    public static int dividir(int numerador, int denominador) {
        return numerador / denominador;
    }
}
