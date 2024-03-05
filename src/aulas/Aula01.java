package aulas;

import src.classes.Caneta;

public class Aula01 {
    public static void main(String[] args) {
        Caneta caneta = new Caneta("bic","azul",0.5f,1);
        caneta.status();
        System.out.println(caneta.getPonta());
    }
}
