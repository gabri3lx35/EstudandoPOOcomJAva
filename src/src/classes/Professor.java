package src.classes;

public class Professor extends Pessoa{
    private String especialidade;
    private  float salario;
    public Professor(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public void receberaumento(float aum){
        this.salario = getSalario() + aum;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


}
