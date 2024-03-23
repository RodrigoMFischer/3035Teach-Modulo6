class TesteFormas {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Retangulo retangulo = new Retangulo(4, 6);

        System.out.println("Detalhes do círculo: " + circulo);
        System.out.println("Área do círculo: " + circulo.calcularArea());

        System.out.println("Detalhes do retângulo: " + retangulo);
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
    }
}