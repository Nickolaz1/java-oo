import fonte.Pessoa;
import fonte.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        String nome = "José";
        String universidade = "Harvard";
        String curso = "DS";
        Pessoa aluno = new Aluno(nome, universidade, curso);
        aluno.imprime();
    }
}
