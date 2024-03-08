package src.classes;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String caregoria;
    private int vitorias, derrotas, empates;

    public void apresentar(){
        System.out.println("--------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos a vcs o Lutador "+this.getNome());
        System.out.println("Diretamente da "+this.getNacionalidade()+" Com "+this.getAltura()+" Altura");
        System.out.println("Com "+this.getIdade()+" Anos");
        System.out.println("Pessando "+this.getPeso()+" Kg");
        System.out.println("Vitorias: "+this.getVitorias());
        System.out.println("Derrotas: "+this.getDerrotas());
        System.out.println("Empates: "+this.getEmpates());

    }
    public void status(){
        System.out.println("--------------------------------------");
        System.out.println(this.getNome()+" é um peso "+this.getCaregoria());
        System.out.println("Ganhou: "+this.getVitorias()+" Vezes");
        System.out.println("Perdeu: "+this.getDerrotas()+" Vezes");
        System.out.println("Empatou : "+this.getEmpates()+" Vezes");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCaregoria();
    }

    public String getCaregoria() {
        return caregoria;
    }

    private void setCaregoria() {
        if(this.peso < 52.2){
            this.caregoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.caregoria = "Leve";
        }else if(this.peso <= 83.9){
            this.caregoria = "Médio";
        }else if(this.peso <= 120.2){
            this.caregoria = "Pessado";
        }else {
            this.caregoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
