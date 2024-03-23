import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numerosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .toList();

        System.out.println("Números pares: " + numerosPares);
    }
}