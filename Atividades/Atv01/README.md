<h1>Notebook Atv01</h1>

<h3>Descrição da Atividade</h3>

- Import da Biblioteca Scanner
- Criação da classe e, sucessivamente do método Main
- Criação e inicialização das variaveis
- Criação do Scanner
- Implementação do "do While"
- Criação do try
- Implementação do Input
- Imcrementação da variavel soma com o valor dado
- Implementação do catch para tratar erros
- Implementa o método de String do Scanner, para ir a próxima linha
- Implementa o While para execução continua
- Printa a soma
- Fecha o Scanner

Código Java:  
~~~~
import java.util.Scanner;//importa a biblioteca Scanner

import java.util.Scanner;

public class Atv01 {
    public static void main(String[] args) {
        float i = -1, soma = 0;
        Scanner s = new Scanner(System.in);
        do {
            try {
                System.out.println("Qual número deseja somar no momento: ");
                i = s.nextFloat();
                soma += i;
            } catch (Exception e) {
                s.nextLine();
            }
        } while (i != 0);
            System.out.printf("a soma é %f", soma);
    s.close();
    }
}
~~~~
~~~~
/*
* IFPR - Campus Cascavel

* Curso: Técnico em informática

* Disciplina: Programação orientada à objetos

* Professor: Nelson Bellincanta

* Data da criação: 10/04/2023
*/
~~~~
