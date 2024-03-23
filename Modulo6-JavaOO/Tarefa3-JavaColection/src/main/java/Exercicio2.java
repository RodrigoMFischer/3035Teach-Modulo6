import java.util.HashSet;
import java.util.Set;

public class Exercicio2 {
    public static void main(String[] args) {
        Set<String> cores = new HashSet<>();

        cores.add("Vermelho");
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Amarelo");
        cores.add("Laranja");

        System.out.println("Tamanho do HashSet: " + cores.size());

        boolean corAdicionada = cores.add("Vermelho");
        if (!corAdicionada) {
            System.out.println("A cor 'Vermelho' já existe no conjunto. Elementos duplicados não são permitidos.");
        }

        System.out.println("Remoção da cor verde : " + cores.remove("Verde"));

        String corBuscada = "Amarelo";
        if (cores.contains(corBuscada)) {
            System.out.println("A cor '" + corBuscada + "' está no conjunto.");
        } else {
            System.out.println("A cor '" + corBuscada + "' não está no conjunto.");
        }

        System.out.println("Cores no conjunto:");
        cores.forEach(cor -> System.out.println("Cor no conjunto: " + cor));
    }
}
