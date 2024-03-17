package src.classes;

public class Funcionario extends Pessoa{

    private String setor;
    private boolean trabalhando;
    public Funcionario(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
    public void mudarTrabalho(){
        this.trabalhando = ! this.isTrabalhando();
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
