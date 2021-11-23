public class Massas extends Prato{

     //variaveis globais
     private String tipo = "";
     private String descricao = "";
     private String ingrediente = "";
     private int codigo;
 
     //metodos construtores
     public Massas(String tipo, String descricao, String ingrediente) {
         this.tipo = tipo;
         this.descricao = descricao;
         this.ingrediente = ingrediente;
         
     }
 
     public Massas(String tipo, String descricao, String ingrediente,int codigo) {
         this.tipo = tipo;
         this.descricao = descricao;
         this.ingrediente = ingrediente;
         this.codigo = codigo;
     }
 
     public Massas() {
     }
     
     //getters
     public String getTipo() {
         return tipo;
     }
     public String getDescricao() {
     return descricao;
     }
     public String getIngrediente() {
         return ingrediente;
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
     public void setIngrediente(String ingrediente){
         this.ingrediente = ingrediente;
     }
     public void setCodigo(int codigo){
         this.codigo = codigo;
     }
}
