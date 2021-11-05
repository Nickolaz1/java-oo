public class App {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro("Porsche", 300);
        Carro carro2 = new Carro("Ferrari", 350);
        System.out.println(carro1.toString());
        System.out.println(carro2.toString());
        Carro.setVelocidadeLimite(150);
        System.out.println(carro1.toString());
        System.out.println(carro2.toString());
    }
}
