package src.classes;

public class Livro {
    public String nome;
    public String autor;
    public String genero;
    public int paginas;
    protected boolean aberto =false;
    private int paginaslidas=0;

    public  void abrirLivro(){
        this.aberto = true;
    }
    public void fecharLivro(){
        this.aberto = false;
    }
    public void estudar(){
        if(this.aberto){
            System.out.println("Começando a estudar");
        }else{
            System.out.println("Ops, Como vou estudar com o livro fechado");
        }
    }

    public int ler(int QuantasPaginasForamLidas){
        if(!this.aberto){
            System.out.println("Você não pode ler com o livro fechado");
            return 1;
        }
        if(QuantasPaginasForamLidas > this.paginas){
            this.paginaslidas = this.paginas;
        }else {
            this.paginaslidas = QuantasPaginasForamLidas;
        }
        return 0;
    }
    public void status(){
        System.out.println("Nome do livro: "+this.nome);
        System.out.println("Nome do autor: "+this.autor);
        System.out.println("Genero do livro: "+this.genero);
        System.out.println("Numero de paginas: "+this.paginas);
        System.out.println("Numero de paginas lidas: "+this.paginaslidas);

    }




}
