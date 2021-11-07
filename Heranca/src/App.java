import heranca.Funcionario;
import heranca.Gerente;

public class App {
    public static void main(String[] args) throws Exception {
        Gerente gerente = new Gerente();
        gerente.setNome("Michael Jackson");
        System.out.println(gerente.getNome());

        Funcionario funcionario = new Funcionario("Rebeca", "142536", 1500);
        Gerente gerente2 = new Gerente(funcionario.getNome(), funcionario.getCpf(), funcionario.getSalario());

        System.out.println(funcionario.toString());
        System.out.println(gerente2.toString());
    }
}
