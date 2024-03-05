package src.classes;

public class Livro {
    public String nome;
    public String autor;
    public String genero;
    public int paginas;
    public boolean aberto;
    private int paginaslidas=0;

    public void estudar(){
        if(this.aberto){
            System.out.println("Começando a estudar");
        }else{
            System.out.println("Ops, Como vou estudar com o livro fechado");
        }
    }

    public void ler(int QuantasPaginasForamLidas){
        if(QuantasPaginasForamLidas > this.paginas){
            this.paginaslidas = this.paginas;
        }else {
            this.paginaslidas = QuantasPaginasForamLidas;
        }
    }
    public void status(){
        System.out.println("Nome do livro: "+this.nome);
        System.out.println("Nome do autor: "+this.autor);
        System.out.println("Genero do livro: "+this.genero);
        System.out.println("Numero de paginas: "+this.paginas);
        System.out.println("Numero de paginas lidas: "+this.paginaslidas);

    }




}
