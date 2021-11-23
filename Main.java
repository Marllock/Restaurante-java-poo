//Nome - Marcello Vieira Benites Ra: 2209845
public class Main {
    public static void main(String args[]) {//classloader
        
        int conts = 0, contm = 0, x = 1, i = 0;
        Sopa s = new Sopa();
        Massa m = new Massa();
        Leitura l = new Leitura();
        
        while(x != 0){
            System.out.println("\n-------MENU------");
            System.out.println("\nDigite 1 para adicionar uma sopa");
            System.out.println("\nDigite 2 para adicionar uma massa");
            System.out.println("\nDigite 3 para mostrar os pratos");
            System.out.println("\nDigite 0 para encerrar");
            
            x = (Integer.parseInt(l.entDados(""))); 
            switch(x){

                case 1:

                s.setPreco(Double.parseDouble(l.entDados("Informe o preco:")));
                s.setNome(l.entDados("Informe o nome do prato:"));
                s.setTipo(l.entDados("Informe o tipo do prato:"));
                s.setDescricao(l.entDados("Informe a descricao do prato:"));
                s.setClassificacao(l.entDados("Informe a descricao do prato:"));
                s.setCodigo(Integer.parseInt(l.entDados("Informe o preco:")));
                conts++;
                break;
                
                case 2:
                    m[contm].setPreco(Double.parseDouble(l.entDados("Informe o preco:")));
                    m[contm].setNome(l.entDados("Informe o nome do prato:"));
                    m[contm].setTipo(l.entDados("Informe o tipo do prato:"));
                    m[contm].setDescricao(l.entDados("Informe a descricao do prato:"));
                    m[contm].setClassificacao(l.entDados("Informe a descricao do prato:"));
                    m[contm].setCodigo(Integer.parseInt(l.entDados("Informe o preco:")));
                    m[contm].setIngrediente(l.entDados("Informe o ingrediente principal do prato:"));
                    contm++;
                    break;

                case 3:
                    for(i = 0;i >= conts; i++){
                        System.out.println(s[i].toString());
                    }
                    for(i = 0;i >= contm; i++){
                        System.out.println(m[i].toString());
                    }

            }
        }
        
    
    
    
    
    /* s.setPreco(Double.parseDouble(l.entDados("Informe o preco:")));
    s.setNome(l.entDados("Informe o nome do prato:"));
    
        s.setTipo(l.entDados("Informe o Tipo do prato:"));
        s.setDescricao(l.entDados("Informe a descricao do prato:"));

        System.out.println("\nPreco do prato:" + s.getPreco());
        System.out.println("\nNome do prato:" + s.getNome());

        System.out.println("\nTipo do prato:" + s.getTipo());
        System.out.println("\nDescricao do prato:" + s.getDescricao());
        */

    }//fim do main
}
