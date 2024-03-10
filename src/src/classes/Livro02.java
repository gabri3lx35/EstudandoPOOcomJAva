package src.classes;

import interfaces.Publicacao;

public class Livro02 implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro02(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.pagAtual = 0;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.leitor = leitor;
    }

    public void status(){
        System.out.println("=================================");
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Autor: "+getAutor());
        System.out.println("Numero total de paginas: "+getTotPaginas());
        System.out.println("Pagina Atual: "+getPagAtual());
        System.out.println("Livro está aberto? "+isAberto());
        System.out.println("Leitor: "+getLeitor());
        System.out.println("==================================");
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getLeitor() {
        return this.leitor.getNome();
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhes(){

    }
    @Override
    public void abrir() {
        if(!(this.isAberto())){
            this.setAberto(true);
        }else {
            System.out.println("O livro já esta Aberto!!!");
        }
    }

    @Override
    public void fechar() {
        if (this.isAberto()){
            this.setAberto(false);
        }else {
            System.out.println("O Livro já esta fechado");
        }
    }

    @Override
    public void folhear() {
       if(this.isAberto() == true){
           if(this.getPagAtual() != this.getTotPaginas()){
               this.setPagAtual(this.getTotPaginas());
           }else {
               System.out.println("Você não pode folhear por que já esta na ultima pagina");
           }
       }else {
           System.out.println("Você não pode avançar uma pagina com o livro fechado");
       }

    }

    @Override
    public void avançarPag() {
        if(this.isAberto() == true){
            if (this.getPagAtual() < this.getTotPaginas()){
                this.setPagAtual(getPagAtual() +1 );
            }else{
                System.out.println("Você não pode avançar 1 pagina por que esta na ultima pagina");
            }
        }else {
            System.out.println("Você não pode avançar uma pagina com o livro fechado");
        }
    }

    @Override
    public void voltarPag() {
        if(this.getPagAtual() > 0){
            this.setPagAtual(this.getPagAtual()-1);
        }

    }
}
