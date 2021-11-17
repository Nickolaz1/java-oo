package fonte;

public class Aluno extends Pessoa{

    private int[] notas;
    private String universidade;
    private String curso;
    
    public Aluno() {
    }

    public Aluno(String nome, String universidade, String curso) {
        super(nome);
        this.universidade = universidade;
        this.curso = curso;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public void imprime(){
        System.out.println("Nome: " + super.getNome() + ", Universidade: " + universidade + ", Curso: " + curso);
    }   
}
