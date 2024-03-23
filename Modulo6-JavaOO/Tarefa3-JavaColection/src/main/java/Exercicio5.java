import java.util.ArrayList;
import java.util.HashSet;

public class Exercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(6);
        numeros.add(7);
        numeros.add(10);
        numeros.add(11);

        System.out.println("Numeros inseridos no ArrayList: " + numeros);

        numeros.removeIf(numero -> numero % 2 == 0);

        System.out.println("ArrayList após remoção de numeros pares: " + numeros);

        HashSet<Integer> numerosImpares = new HashSet<>(numeros);
        System.out.println("HashSet com numeors impares: " + numerosImpares);

        int numeroBuscado = 7;
        if (numerosImpares.contains(numeroBuscado)) {
            System.out.println("O número " + numeroBuscado + " está presente no HashSet.");
        } else {
            System.out.println("O número " + numeroBuscado + " não está presente no HashSet.");
        }
    }
}