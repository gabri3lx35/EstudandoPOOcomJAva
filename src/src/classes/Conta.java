package src.classes;

public class Conta {
    private String nomeDono;
    private int numConta;
    private String tipo;
    private int saldo;
    private boolean status;
    private int taxaConta;

    public Conta(String nomeDono, int numConta, String tipo, int saldo) {
        this.nomeDono = nomeDono;
        this.numConta = numConta;
        this.tipo = tipo;
        this.saldo = saldo;
        if(this.tipo == "cp"){
            this.status = true;
            this.taxaConta = 12;
            this.tipo = "ContaPoupança";
        }else if (this.tipo == "cc") {
            this.status = true;
            this.taxaConta = 15;
            this.tipo = "ContaCorrente";
        }else {
            this.status = false;
            this.tipo = "Error/Tipo de conta não definido";
        }

    }
    public void fecharConta(){
        if(this.saldo == 0 && this.status == true){
            this.status = false;
        }
    }
    public void pagarTaxa(){
        if(this.status){
            if(this.saldo > this.taxaConta){
                this.saldo = this.saldo - this.taxaConta;
            }else {
                System.out.println("Não tem saldo suficiente");
            }
        }else {
            System.out.println("Sua conta está fechada,"+this.nomeDono+"Abra sua conta para poder pagar sua taxa");
        }
    }
    public void ver(){
        System.out.println("Nome do dono: "+this.nomeDono);
        System.out.println("Número da donta: "+this.numConta);
        System.out.println("Tipo da conta: "+this.tipo);
        System.out.println("Saldo da conta: "+this.saldo);
        System.out.println("Status da conta [Aberta/Fechada]: "+this.isStatus());
        System.out.println("Valor da taxa Mensal da conta: "+this.taxaConta);
    }
    public void sacar(int valor){
        if(this.saldo > valor && this.status == true){
           this.saldo = this.saldo - valor;
        }else {
            System.out.println("Sua conta esta fechada "+this.nomeDono+" não pode sacar uma valor com a conta fechada");
        }
    }

    public void depositar(int valor){
        if(this.status){
            this.saldo = this.saldo + valor;
        }else {
            System.out.println("Sua conta esta fechada"+this.nomeDono+"Você não pode deposiar uma valor com a conta fechada");
        }
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String isStatus() {
        if(this.status){
            return "Conta Aberta";
        }else {
            return "Conta Fechada";
        }
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
