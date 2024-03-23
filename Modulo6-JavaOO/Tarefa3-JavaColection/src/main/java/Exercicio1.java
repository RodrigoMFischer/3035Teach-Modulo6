import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();

        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Uva");
        frutas.add("Pêssego");

        System.out.println("Tamanho do ArrayList: " + frutas.size());

        System.out.println("Terceiro elemento: " + frutas.get(2));

        frutas.remove(0);

        String buscaFruta = "Laranja";
        if (frutas.contains(buscaFruta)) {
            System.out.println(buscaFruta + " existe na lista.");
        } else {
            System.out.println(buscaFruta + " não existe na lista.");
        }

        System.out.println("Lista de frutas:");
        frutas.forEach( item -> System.out.println("Item da lista: " + item));
    }
}

