package src.classes;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniver(){
        if (this.getIdade() > 0) {
            this.setIdade(this.getIdade() + 1);
        }else {
            System.out.println("ERROR, idade não definida");
        }
    }

    public void status(){
        System.out.println("######################");
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Sexo: "+getSexo());
        System.out.println("######################");
    }

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.setSexo(this.sexo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
       if(this.sexo == "M" || this.sexo == "m"){
            this.sexo = "Masculino";
       }else if(this.sexo == "F" || this.sexo == "f"){
           this.sexo = "Feminino";
       }else {
           this.sexo = "ERROR, sexo não definido";
       }
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
