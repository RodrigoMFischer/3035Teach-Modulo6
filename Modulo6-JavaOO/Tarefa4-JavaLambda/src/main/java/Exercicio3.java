import java.util.List;

public class Exercicio3 {
    public static void main(String[] args) {
        List<String> listaOriginal = List.of("java", "python", "c++", "javascript", "ruby", "php");

        List<String> listaAlterada = listaOriginal.stream()
                .map(s -> s.toUpperCase())
                .toList();

        System.out.println("Lista em maiúsculas: " + listaAlterada);
    }
}
