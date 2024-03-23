import java.util.List;

public class Exercicio4 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(100, 200, 300, 400, 500);

        int soma = numeros.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("A soma dos números é: " + soma);
    }
}
