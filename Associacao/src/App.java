public class App {
    public static void main(String[] args) throws Exception {
        Jogador jogador1 = new Jogador("Cristiano Ronaldo");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("Neymar");

        Jogador[] jogadores1 = {jogador1};
        Jogador[] jogadores2 = {jogador2, jogador3};

        Time time1 = new Time("Manchester United");
        Time time2 = new Time("PSG");

        jogador1.setTime(time1);
        jogador2.setTime(time2);
        jogador3.setTime(time2);

        time1.setJogadores(jogadores1);
        time2.setJogadores(jogadores2);

        jogador1.imprimir();
        jogador2.imprimir();
        jogador3.imprimir();

        time1.imprimir();
        time2.imprimir();

    }
}
