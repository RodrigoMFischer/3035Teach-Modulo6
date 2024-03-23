class Gato extends Animal {
    public Gato(String nome, String som) {
        super(nome, som);
    }
    public void fazerSom() {
        System.out.println(getNome() + " faz: " + getSom());
    }
}