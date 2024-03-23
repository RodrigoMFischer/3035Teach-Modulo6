class Cachorro extends Animal {
    public Cachorro(String nome, String som) {
        super(nome, som);
    }
    public void fazerSom() {
        System.out.println(getNome() + " faz: " + getSom());
    }
}