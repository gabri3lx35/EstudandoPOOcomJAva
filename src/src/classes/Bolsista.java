package src.classes;

public class Bolsista extends Aluno{
    private float bolsa;
    public Bolsista(String nome, int idade, String sexo, String curso) {
        super(nome, idade, sexo, curso);
    }
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de "+this.getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome()+" é bolsista pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
