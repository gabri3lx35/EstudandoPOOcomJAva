package aulas;

import src.classes.Livro;

public class Aula01Ex {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.autor = "gabriel";
        livro.nome = "Aventuras de gabriel";
        livro.genero = "Aventura";
        livro.paginas = 1256;
        livro.aberto = false;
        livro.status();
        livro.ler(1257);
        livro.status();
    }
}
