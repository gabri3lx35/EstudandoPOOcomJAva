package aulas;

import src.classes.Livro;

public class Aula01Ex {
    public static void main(String[] args) {
        Livro livro = new Livro("gabriel", "Aventuras de gabriel", "Aventura",1256);
        livro.abrirLivro();
        livro.status();
        livro.ler(1257);
        livro.status();
    }

}
