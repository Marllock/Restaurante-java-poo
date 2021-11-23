//Nome - Marcello Vieira Benites Ra: 2209845
public class Main {
    public static void main(String args[]) {//classloader
 
        
        Sopa p = new Sopa();
        Leitura l = new Leitura();
        
        p.setPreco(Double.parseDouble(l.entDados("Informe o preco:")));
        p.setNome(l.entDados("Informe o nome do prato:"));

        p.setTipo(l.entDados("Informe o Tipo do prato:"));
        p.setDescricao(l.entDados("Informe a descricao do prato:"));

        System.out.println("\nPreco do prato:" + p.getPreco());
        System.out.println("\nNome do prato:" + p.getNome());

        System.out.println("\nTipo do prato:" + p.getTipo());
        System.out.println("\nDescricao do prato:" + p.getDescricao());

    }//fim do main
}
