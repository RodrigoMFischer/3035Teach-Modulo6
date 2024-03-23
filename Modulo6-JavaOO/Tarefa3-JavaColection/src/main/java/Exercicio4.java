import java.util.ArrayList;
import java.util.HashSet;

public class Exercicio4 {
    public static void main(String[] args) {
        ArrayList<String> palavrasArrayList = new ArrayList<>();
        palavrasArrayList.add("gato");
        palavrasArrayList.add("cachorro");
        palavrasArrayList.add("pássaro");
        palavrasArrayList.add("peixe");
        palavrasArrayList.add("gato");

        HashSet<String> palavrasHashSet = new HashSet<>(palavrasArrayList);

        System.out.println("Elementos do HashSet:");
        palavrasHashSet.forEach( item -> System.out.println(item));

        ArrayList<String> palavrasArrayList2 = new ArrayList<>(palavrasHashSet);

        System.out.println("\nElementos do ArrayList resultante:");
        palavrasArrayList2.forEach( item -> System.out.println(item));

        System.out.println("\nA ordem dos elementos mudou durante as conversões?");
        System.out.println("Ordem no ArrayList original: " + palavrasArrayList);
        System.out.println("Ordem no ArrayList resultante: " + palavrasArrayList2);
        System.out.println("Na conversão de arrayList para HashSet os elementos perderam a ordem de inserção.");
        System.out.println("Na conversão de HashSet para ArrayList os elementos mantiveram a ordem do HashSet.");

    }
}