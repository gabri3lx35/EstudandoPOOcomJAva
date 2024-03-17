package src.classes;

public class Aluno extends Pessoa{
    private int mat;
    private String curso=null;

    public Aluno(String nome, int idade, String sexo, String curso) {
        super(nome, idade, sexo);
        this.curso = curso;
    }
    public void CancelarMatr(){
        System.out.println("Sua Matricula sera cancelada");
    }
    public void pagarMensalidade(){
        System.out.println("Mensalidade Paga!!");
    }
    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
