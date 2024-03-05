package src.classes;

import java.beans.ConstructorProperties;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;



    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String Modelo){
        this.modelo = modelo;
    }
    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor =cor;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float ponta){
        this.ponta = ponta;
    }
    public int getCarga(){
        return this.carga;
    }
    public void setCarga(int carga){
        this.carga = carga;
    }
    public boolean getEstadoTampa(){
        return this.tampada;
    }
    public void setTampada(boolean estadoDaTampa){
        this.tampada = estadoDaTampa;
    }
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Está tampada? " + (this.tampada ? "Sim" : "Não"));
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga:" + this.carga);
    }

        public void rabiscar() {
            if (this.tampada) {
                System.out.println("Sou caneta esta tampada, Tentou Rabiscar mas nada fez");
            } else {
                System.out.println("Rabiscandooo");
            }
        }
        public void tampar () {
            this.tampada = true;
        }
        public void destampar () {
            this.tampada = false;
        }

}