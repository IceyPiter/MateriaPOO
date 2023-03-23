import java.util.Scanner;

public class ClassScanner {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);//Prepara entrada de dados

        System.out.println("Entrada formatada - Classe Scanner");//Exibe mensagem inicial
        System.out.print("Imforme o nome da pessoa: ");//Mensagem de orientação
        int i = s.nextInt();//Declaração e inicializção da variável
        System.out.println("O valor do inteiro digitado é = " + i);//Exibe valor lido


    //    System.out.println("Digi: ");//Mensagem de orientação
    //    String i = s.String();//Declaração e inicializção da variável
    //    System.out.println("O valor do inteiro digitado é = " + i);//Exibe valor lido

    //    System.out.println("Digite um valor inteiro: ");//Mensagem de orientação
    //    String i = s.nextInt();//Declaração e inicializção da variável
    //    System.out.println("O valor do inteiro digitado é = " + i);//Exibe valor lido

    //    System.out.println("Digite um valor inteiro: ");//Mensagem de orientação
    //   int i = s.nextInt();//Declaração e inicializção da variável
    //    System.out.println("O valor do inteiro digitado é = " + i);//Exibe valor lido
        s.close();//Fecha objeto leitor
    }
}
