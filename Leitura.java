//Nome - Marcello Vieira Benites Ra: 2209845
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura {

    public String entDados(String rotulo){

        InputStreamReader teclado = new InputStreamReader(System.in);//entrada do sistema
        BufferedReader input = new BufferedReader(teclado);

        System.out.println(rotulo);

        String entrada = "";

        try{
            entrada = input.readLine();
        } catch(IOException ioe){
            System.out.println("\nERRO de sistema\n");
        }

        return entrada;
    }
}