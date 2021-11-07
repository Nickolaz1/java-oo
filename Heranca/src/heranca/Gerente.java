package heranca;

public class Gerente extends Funcionario{

    private int senha;
    private int numeroFuncionariosGerenciados;

    public Gerente() {
    }

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public Gerente(String nome, String cpf, double salario, int senha, int numeroFuncionariosGerenciados) {
        this(nome, cpf, salario);
        this.senha = senha;
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroFuncionariosGerenciados() {
        return numeroFuncionariosGerenciados;
    }

    public void setNumeroFuncionariosGerenciados(int numeroFuncionariosGerenciados) {
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }

    @Override
    public String toString() {
        return "Gerente [cpf=" + cpf + ", nome=" + nome + ", salario=" + salario + ", numeroFuncionariosGerenciados=" + numeroFuncionariosGerenciados + ", senha=" + senha + "]";
    }    
}
