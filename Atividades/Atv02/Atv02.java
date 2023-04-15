/**
 * Atv01
 */
import java.util.Scanner;
public class Atv02 {
        public static void main(String args[]) {
            Scanner s = new Scanner(System.in); // Cria variavel para classe Scanner
            System.out.print("Informe um número inteiro ");//Imprime a mensagem "Informe um número Inteiro"
            int f = s.nextInt();//Coloca o cursor na mesma linha com entrada de dados


            System.out.println("Informe um número Inteiro: ");//Imprime a mensagem "Informe um número Inteiro" indo para proxima linha
            int b = s.nextInt();//Coloca o cursor na proxima linha com entrada de dados
            System.out.println("Informe um número Inteiro: ");//Imprime a mensagem "Informe um número Inteiro" indo para proxima linha
            int c = s.nextInt();//Coloca o cursor na proxima linha com entrada de dados
            int a = b * c;//realiza o produto das variaveis b e c para a
            System.out.printf("O resultado do produto %d x %d é %d", b, c, a);//Imprime o resultado em forma de folha de pagamento
            s.close();
        }
    }

