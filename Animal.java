public class Animal {
    private String nome;
    private String raca;
    private double peso;

    public Animal(String nome, String raca, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
    }

    public void dormir()
    {
        System.out.println("Estou dormindo...");
    }

    public void comer(String comida)
    {
        System.out.println("Estou comendo... " + comida + "!" );
    }

    public void fazerBarulho(String barulho)
    {
        System.out.println("Barulho: " + barulho);
    }

    public void printar() {
        System.out.println(nome);
    }
}