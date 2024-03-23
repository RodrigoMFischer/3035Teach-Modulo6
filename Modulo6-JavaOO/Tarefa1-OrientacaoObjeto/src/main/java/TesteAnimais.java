class TesteAnimais {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Cachorro", "Au au");
        Gato gato1 = new Gato("Gato", "Miau");

        cachorro1.fazerSom(); // Saída: Cachorro faz: Au au
        gato1.fazerSom();      // Saída: Gato faz: Miau

        System.out.println(cachorro1.toString());
        System.out.println(gato1.toString());
    }
}