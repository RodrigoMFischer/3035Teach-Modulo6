import java.util.Scanner;

public class ConversaoStringParaInteiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        String numeroStr = scanner.nextLine();
        System.out.println(numeroStr);
        scanner.close();

        System.out.println("Teste com String lida do teclado");
        try {
            int numeroInt = Integer.parseInt(numeroStr);
            System.out.println("Número inteiro: " + numeroInt);
        } catch (NumberFormatException e) {
            System.out.println("Erro: A string não pode ser convertida para um número inteiro.");
        } catch (NullPointerException e) {
            System.out.println("Erro: A entrada é nula.");
        }

        System.out.println("\nTeste com String null, para testar NullPointerException");
        String teste2 = null;
        try {
            if (teste2 == null) {
                throw new NullPointerException();
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
            System.out.println("Erro: A string não pode ser convertida para um número inteiro.");
        } catch (NullPointerException e) {
            System.out.println("Erro: A entrada é nula.");
        }
    }
}