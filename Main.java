//Nome - Marcello Vieira Benites Ra: 2209845
public class Main {
    public static void main(String args[]) {//classloader
 
        int conts = 0, contm = 0, x = 1, i = 0;
        Sopa s[] = new Sopa[10];
        Massa m[] = new Massa[10];
        Leitura l = new Leitura();

        while(x != 0){
            System.out.println("\n-------MENU------");
            System.out.println("\nDigite para adicinar o prato desejado");
            i = (Integer.parseInt(l.entDados("1-Sopa\n2-massa")));
            if(i == 1){
                s[conts].setPreco(Double.parseDouble(l.entDados("Informe o preco:")));
                s[conts].setNome(l.entDados("Informe o nome do prato:"));
                s[conts].setTipo(l.entDados("Informe o tipo do prato:"));
                s[conts].setDescricao(l.entDados("Informe a descricao do prato:"));
                s[conts].setClassificacao(l.entDados("Informe a descricao do prato:"));
                s[conts].setCodigo(Integer.parseInt(l.entDados("Informe o preco:")));
                conts++;

            }
            if(i == 2){
                m[contm].setPreco(Double.parseDouble(l.entDados("Informe o preco:")));
                m[contm].setNome(l.entDados("Informe o nome do prato:"));
                m[contm].setTipo(l.entDados("Informe o tipo do prato:"));
                m[contm].setDescricao(l.entDados("Informe a descricao do prato:"));
                m[contm].setClassificacao(l.entDados("Informe a descricao do prato:"));
                m[contm].setCodigo(Integer.parseInt(l.entDados("Informe o preco:")));
                m[contm].setIngrediente(l.entDados("Informe o ingrediente principal do prato:"));
                contm++;

            }
            x = (Integer.parseInt(l.entDados("Digite 1 para continurar adicionando\nDigite 2 para mostrar os pratos\nDigite 0 para encerrar")));
            if(x == 2){
                
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
