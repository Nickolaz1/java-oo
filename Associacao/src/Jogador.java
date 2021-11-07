public class Jogador {
    
    private String nome;
    private Time time;
    
    public Jogador(String nome) {
        this.nome = nome;
    }

    public Jogador(String nome, Time time) {
        this.nome = nome;
        this.time = time;
    }

    public void imprimir(){
        System.out.println("--- JOGADOR ---");
        System.out.println(nome);
        System.out.println(time.getNome());
        System.out.println("");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

}
