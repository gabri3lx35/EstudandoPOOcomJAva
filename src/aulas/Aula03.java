package aulas;

import interfaces.ControleRemoto;

public class Aula03 {
    public static void main(String[] args) {
        ControleRemoto controle1 = new src.classes.ControleRemoto();
        controle1.ligar();
        controle1.pause();
        controle1.play();
        controle1.menosVolume();





        controle1.abrirMenu();
    }
}
