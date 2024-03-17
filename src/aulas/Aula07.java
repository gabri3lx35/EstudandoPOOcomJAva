package aulas;

import src.classes.Aluno;
import src.classes.Bolsista;
import src.classes.Visitante;

public class Aula07 {
    public static void main(String[] args) {
        Visitante visitante = new Visitante("gabriel",19,"m");
        Aluno a1 = new Aluno("gabriel",31,"m","Matematica");
        Bolsista b1 = new Bolsista("gabriel2.0",23,"m","fisica");
        b1.setBolsa(50);
        b1.pagarMensalidade();
        a1.pagarMensalidade();
    }
}
