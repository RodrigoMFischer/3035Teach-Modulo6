import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Exercicio3 {
    public static void main(String[] args) {
        List<Integer> numerosArrayList = new ArrayList<>();
        Set<Integer> numerosHashSet = new HashSet<>();

        numerosArrayList.add(5);
        numerosArrayList.add(2);
        numerosArrayList.add(8);
        numerosArrayList.add(3);
        numerosArrayList.add(5);

        numerosHashSet.add(5);
        numerosHashSet.add(2);
        numerosHashSet.add(8);
        numerosHashSet.add(3);
        numerosHashSet.add(5);


        System.out.println("Elementos do ArrayList:");
        numerosArrayList.forEach( item -> System.out.println("Número da Lista:" + item));
        System.out.println("O ArrayList garante a ordem de inserção dos elementos.");

        // Imprimindo os elementos do HashSet
        System.out.println("\nElementos do HashSet:");
        numerosHashSet.forEach( item -> System.out.println("Número do conjunto: " + item));
        System.out.println("O HashSet não garante uma ordem especifica de inserção dos elementos.");
    }
}