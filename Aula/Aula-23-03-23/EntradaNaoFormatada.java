import java.io.IOException;//importação da classe
//IOException para tratar exceções

public class EntradaNaoFormatada{
    public static void main(String args[]) throws
    IOException{//Cláusula thows permite que um erro seja descartado, mesmo que ele ocorra
        System.out.println("Entrada Não Formatada!");
        //Mensagem inicial
        System.out.print("Pressione um caractere: ");
        //Mensagem de orientação
        int i = System.in.read();
        //lê um caractere como inteiro
        System.out.println("ASCII = " + i);
    }
}