Descrição:
1° Import da Biblioteca
2° Criação de classe
3° Criação da função main
4° Adição do print
5° Criação do imput

- Código Java:
package Atividades.AtvTeste.notebook;
import java.util.Scanner; //Importe da biblioteca Scanner

public class AtvTeste{ //Criação da classe atvTeste
    public static void main(String[] args) { //Cria a funcao main
        System.out.println("Realizado com Sucesso"); //Mostra a mensagem na tela
        Scanner line = new Scanner(System.in); //Cria o input
        String out = line.nextLine(); //Pede a saida
    }
} 
