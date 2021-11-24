import java.io.IOException;

//Nome - Marcello Vieira Benites Ra: 2209845
public class Main {
    public static void main(String args[]) {//classloader
        
        int x = 1;
        Sopa s = new Sopa();
        Massa m = new Massa();
        Leitura l = new Leitura();
        double conta;
        
        while(x != 0){
            System.out.println("\n-------MENU------");
            System.out.println("\nDigite 1 para adicionar uma sopa");
            System.out.println("\nDigite 2 para adicionar uma massa");
            System.out.println("\nDigite 3 para mostrar os pratos");
            System.out.println("\nDigite 4 para mostrar a soma dos precos dos pratos");
            System.out.println("\nDigite 0 para encerrar");
            
            x = (Integer.parseInt(l.entDados(""))); 
            switch(x){

                case 1:
                try{

                    s.setPreco(Double.parseDouble(l.entDados("Informe o preco:")));
                    s.setNome(l.entDados("Informe o nome do prato:"));
                    s.setTipo(l.entDados("Informe o tipo do prato:"));
                    s.setDescricao(l.entDados("Informe a descricao do prato:"));
                    s.setClassificacao(l.entDados("Informe a classificacao do prato:"));
                    s.setCodigo(Integer.parseInt(l.entDados("Informe o codigo:")));
                    break;
                }
                catch(IOException e){
                    System.out.println("\nOcorreu um erro na entrada de dados: "+erro1);

                }
                
                case 2:
                    m.setPreco(Double.parseDouble(l.entDados("Informe o preco:")));
                    m.setNome(l.entDados("Informe o nome do prato:"));
                    m.setTipo(l.entDados("Informe o tipo do prato:"));
                    m.setDescricao(l.entDados("Informe a descricao do prato:"));
                    m.setClassificacao(l.entDados("Informe a descricao do prato:"));
                    m.setCodigo(Integer.parseInt(l.entDados("Informe o preco:")));
                    m.setIngrediente(l.entDados("Informe o ingrediente principal do prato:"));
                    break;

                case 3:
                    
                    System.out.println(s.toString());
                    System.out.println(m.toString());
                
                    break;

                case 4:
                conta = m.soma(s.getPreco(), m.getPreco());
                System.out.printf("%2f",conta);

            }
        }

    }//fim do main
}
