package aulas;

import src.classes.Conta;

public class Aula02 {
    public static void main(String[] args) {
        Conta contacp = new Conta("gabriel", 578, "cp",1450);
        Conta contacc = new Conta("Deoxy",650,"cc",80000);
        System.out.println(contacp.isStatus());
        contacp.ver();
        contacc.ver();
        contacc.pagarTaxa();
        contacc.depositar(1000);
        contacc.ver();
        contacc.sacar(70000);
        contacc.ver();
    }
}
