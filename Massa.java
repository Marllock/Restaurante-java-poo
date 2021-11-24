public class Massa extends Prato implements Soma{

     //variaveis globais
     private String tipo = "";
     private String descricao = "";
     private String classificacao = "";
     private String ingrediente ="";
     private int codigo;
 
     //metodos construtores
         public Massa(String nome,double preco, String tipo, String descricao, String classificacao,int codigo,String ingrediente) {
             super(nome, preco);
            this.tipo = tipo;
            this.descricao = descricao;
            this.classificacao = classificacao;
            this.codigo = codigo;
            this.ingrediente = ingrediente;
     }

     public double soma(double preco, double preco2){
        double soma;

        soma= ((preco + preco2)* 0.1 +(preco + preco2)) ;// gorjeta do garçom!!!
        return soma;
     }
 
     public Massa(){

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
     public String getIngrediente() {
         return ingrediente;
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
     public void setIngrediente(String ingrediente){
         this.ingrediente = ingrediente;
     }
     public void setCodigo(int codigo){
         this.codigo = codigo;
     }
     @Override
    public String toString() {
        return "Massa:"+"Nome="+getNome()+"\npreco="+ getPreco() + "\ntipo=" + tipo + " \ndescricao=" + descricao + " \nclassificacao=" + classificacao + "\n ingrediente=" + ingrediente + " \ncodigo=" + codigo ;
    }
}
