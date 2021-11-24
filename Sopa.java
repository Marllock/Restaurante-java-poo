//Nome - Marcello Vieira Benites Ra: 2209845
public class Sopa extends Prato implements Soma{

    //variaveis globais
    private String tipo = "";
    private String descricao = "";
    private String classificacao = "";
    private int codigo;

    
    public double soma(double preco, double preco2){
        double soma;

        soma= preco + preco2;
        return soma;
    }


    //metodos construtores
public Sopa(){
    super();
}

    public Sopa(String tipo, String descricao, String classificacao,int codigo,String nome,double preco) {
        super(nome, preco);
        this.tipo = tipo;
        this.descricao = descricao;
        this.classificacao = classificacao;
        this.codigo = codigo;
    }

   
 
    //getters
    public String getTipo() {
        return tipo;
    }
    public String getDescricao() {
    return descricao;
    }
    public String getClassificacao() {
        return classificacao;
    }
    public int getCodigo() {
        return codigo;
    }

    //setters
    public void setTipo(String tipo){
    this.tipo = tipo;
    }
    public void setDescricao(String descricao){
    this.descricao = descricao;
    }
    public void setClassificacao(String classificacao){
        this.classificacao = classificacao;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    @Override
    public String toString() {
        return "Sopa:"+ "Nome=" + getNome() + "\npreco=" +  getPreco() + "tipo=" + tipo + " \ndescricao=" + descricao + " \nclassificacao=" + classificacao + " \ncodigo=" + codigo;
    }

}
