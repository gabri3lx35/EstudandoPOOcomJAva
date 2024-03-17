package aulas;

import src.classes.Aluno;
import src.classes.Livro;
import src.classes.Livro02;
import src.classes.Pessoa;

public class Aula05 {
    public static void main(String[] args) {
        Aluno gabriel = new Aluno("gabriel",18,"M","leitor");
        Livro02 Livro= new Livro02("Aventuras de um dev java","Javeiro",2357,gabriel);
        gabriel.fazerAniver();
        gabriel.status();
        Livro.abrir();
        Livro.avançarPag();
        Livro.voltarPag();
        Livro.folhear();
        Livro.voltarPag();
        Livro.folhear();
        Livro.status();
    }
}
