public class Carro{

    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite;

    // 0 - Bloco de inicialização static é executado quando a JVM carregar a classe
    // 1 - Alocando espaço em memoria pro objeto
    // 2 - Cada atributo da classe é criado e inicializado com os valores default ou pré definidos
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    //bloco de inicialização static
    static{
        System.out.println("Executado somente uma vez");
        velocidadeLimite = 250;
    }

    //bloco de inicialização
    {
        System.out.println("Executado toda vez que um objeto é criado");
    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    @Override
    public String toString() {
        return "Carro [nome=" + nome + ", velocidadeMaxima=" + velocidadeMaxima + ", velocidadeLimite=" + velocidadeLimite + "]";
    }
    
}