package src.classes;

public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    public boolean tampada;

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