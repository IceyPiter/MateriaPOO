<h1>Atividade 01</h1>

<h2>Passos para resolução</h2>

- Import do Scanner
- Criação da classe Atv01
- Começa o do para pelo menos uma execução
- Começa o try, para tentar executar
- Printa mensagem e coloca o cursor naoutra linha
- Inicializa a mensagem como input na outra linha
- Catch para capturar erros
- Cria while para condição do "Do"
- Quando condição for falsa, printa mensagem da soma

<h3>Código</h3>

~~~~
import java.util.Scanner;
public class Atv01{
   public static void main(String args[]){
      float i = -1, soma = 0;//inicia as variaveis
      Scanner s = new Scanner(System.in);//Abre novo scanner
      do {//começa o do para pelo menos uma execução
          try {//começa o try, para tentar executar
              System.out.println("Qual número deseja somar no momento digite \"0\" para somar tudo: ");
              i = s.nextFloat();
              soma += i;
          } catch (Exception e) {//se ocorrer um erro, pega o erro volta ao inicio
              s.nextLine();
          }
      } while (i != 0);//cria a condição de execução do Do
          System.out.printf("a soma é %f", soma);
    }
}
~~~~
