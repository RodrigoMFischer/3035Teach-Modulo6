import java.util.function.Predicate;

public class Exercicio2 {
    public static void main(String[] args) {
        int numero = 104677;

        Predicate<Integer> isPrimo = n -> {
            if (n <= 1) {
                return false;
            }
            if (n == 2) {
                return true;
            }
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        if (isPrimo.test(numero)){
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }

    }
}
