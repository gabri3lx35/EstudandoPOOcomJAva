package src.aulas;

import src.classes.Caneta;

public class Aula01 {
    public static void main(String[] args) {
        Caneta caneta = new Caneta();
        caneta.cor = "azul";
        caneta.ponta = 0.5f;
        caneta.tampar();
        caneta.status();
        caneta.rabiscar();
        caneta.destampar();
        caneta.rabiscar();
    }
}
