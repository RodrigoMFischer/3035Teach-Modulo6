import java.util.Scanner;

public class LeituraNumeroInteiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        String numeroStr = scanner.nextLine();

        try {
            int numeroInt = Integer.parseInt(numeroStr);
            System.out.println("Número inteiro: " + numeroInt);
        } catch (NumberFormatException e) {
            System.out.println("Erro: A string não pode ser convertida para um número inteiro.");
        } finally {
            System.out.println("Bloco finally executado. Encerrando o programa.");
            scanner.close();
        }
    }
}