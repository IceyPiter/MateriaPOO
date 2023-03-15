Descrição:
- Import da Biblioteca
- Criação de um While
- Adição do print
- Criação do input
- Cria o input para proxima linha

Código Java:  
~~~~
import java.util.Scanner;//importa a biblioteca Scanner

while(true){//cria um while para várias execuções
    System.out.printf("Digite alguma coisa ai :D"); //Mostra a mensagem na tela  
    Scanner line = new Scanner(System.in); //Cria o input  
    String out = line.nextLine(); //Pede input para proxima linha
}  
