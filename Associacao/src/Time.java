public class Time {
    
    private String nome;
    private Jogador[] jogadores;
    
    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprimir(){
        System.out.println("--- TIME ---");
        System.out.println(nome);
        if(jogadores == null) 
            return;
        for(Jogador jogador : jogadores)
            System.out.println(jogador.getNome());
        System.out.println("");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
