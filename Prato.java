//Nome - Marcello Vieira Benites Ra: 2209845
public class Prato {

    //variaveis globais
    private double preco = 0.0;
    private String nome = "";

    //metodo construtor
    public Prato(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Prato(){
        
    }

    // Método getters

    public double getPreco() {
        return preco;
    }

    public String getNome() {
    return nome;
    }

   
    //Métodos setters 

    public void setPreco(Double preco){
    this.preco = preco;
    }
    public void setNome(String nome){
    this.nome = nome;
    }
    

}
