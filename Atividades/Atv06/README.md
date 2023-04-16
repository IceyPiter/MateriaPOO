<h1>Atividade 04</h1>

<h2>Passos para resolução</h2>

- Import da biblioteca Scanner
- Criaçaõ da classe Atv06
- Criação do método main
- Criação da variavel para Scanner
- Printa a mensagem
- Inicialização da variavel para entrada dos dados necessarios
- Printa a mensagem
- Inicialização da variavel para entrada dos dados necessarios
- Incialização da variavel com o calcula do lucro por mês
- inicialização da variavel para quantidade de meses
- Criação do while para condição especifica
- Incrementação da variavel dos meses
- incrementação do valor depositado
- Prita a mensagem da quantidade de meses

<h3>Código Java</h3>

~~~~
import java.util.Scanner; //Import da biblioteca Scanner
public class Atv06 { //Criaçaõ da classe Atv06
    public static void main() { //Criação do método main
        Scanner s = new Scanner(System.in); //Criação da variavel para Scanner
        System.out.println("Qual a quantia que deseja depositar"); //Printa a mensagem
        double a = s.nextFloat(); //Inicialização da variavel para entrada dos dados necessarios
        System.out.println("Qual a quantia que desejaalcançar (Lucro 0,5% ao mês)"); //Printa a mensagem
        double b = s.nextFloat(); //Inicialização da variavel para entrada dos dados necessarios
        double c = (0.5/100) * a; //Incialização da variavel com o calcula do lucro por mês
        
        int  i = 0; //inicialização da variavel para quantidade de meses
        while(a < b){ //Criação do while para condição especifica
            i += 1; //Incrementação da variavel dos meses
            a += c; //incrementação do valor depositado
        }
    System.out.print("Serão necessarios " + i + "meses para alcançar o objetivo"); //Prita a mensagem da quantidade de meses

    }
}
~~~~
