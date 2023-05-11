<h1>Atividade 04</h1>

<h2>Passos para resolução</h2>

- Import das classes.
- Criaçaõ da classe Atv07.
- Criação do método main.
- Criação e inicialização das variáveis.
- Teste de variavel nula.
- Mudança de variáveis para inteiro.
- Incrementação das variáveis no Array.
- Criação  e inicialização da variável da mensagem.
- Implementação de método para pegar os números de forma decrescente.
- For para concatenar as notas na String da mensagem.
- Imcrementação das notas.
- Print da mensagem.
- Teste de valores válidos.
- Print da mensagem.
- Teste negativo.
- Criação e inicialização da variável para médias.
- Print da mensagem.
- Print da mensagem de erro.
- Print da mensagem.

<h3>Código Java</h3>

~~~~
import javax.swing.JOptionPane;//Import da classe
import java.util.Arrays;//Import da classe
import java.util.Collections;//Import da classe
public class Atv07 {//Criação da classe
    public static void main(String[] args) {//Criação do método main
        
        String nota1 = JOptionPane.showInputDialog("Forneça a 1° Nota, números de 0-100");//|
        String nota2 = JOptionPane.showInputDialog("Forneça a 2° Nota, números de 0-100");//|
        String nota3 = JOptionPane.showInputDialog("Forneça a 3° Nota, números de 0-100");//|-- Criação e inicialização das variáveis
        String nota4 = JOptionPane.showInputDialog("Forneça a 4° Nota, números de 0-100");//|
        String nota5 = JOptionPane.showInputDialog("Forneça a 5° Nota, números de 0-100");//|

        
        if (nota1 != null && nota2 != null && nota3 != null && nota4 != null && nota5 != null){// Teste de variavel nula
            try{
                int a = Integer.parseInt(nota1);//|
                int b = Integer.parseInt(nota2);//|
                int c = Integer.parseInt(nota3);//|-- Mudança de variáveis para inteiro
                int d = Integer.parseInt(nota4);//|
                int e = Integer.parseInt(nota5);//|

                Integer[] notas = {a , b, c, d, e};// Incrementação das variáveis no Array
                String sequencia = "A sequência de notas de forma decrescente é:  ";// Criação  e inicialização da variável da mensagem
                Arrays.sort(notas, Collections.reverseOrder());// Implementação de método para pegar os números de forma decrescente
                for (int nota : notas){// For para concatenar as notas na String da mensagem
                    sequencia = sequencia + nota + " ";// Imcrementação das notas
                }
                JOptionPane.showMessageDialog(null, sequencia);// Print da mensagem
                if(a > 100 || b > 100 || c > 100 || d > 100 || e > 100){// Teste de valores válidos
                    JOptionPane.showMessageDialog(null,"Informe apenas número igual ou abaixo de 10");// Print da mensagem
                }else{// Teste negativo
                    float media = (a + b + c + d + e)/5;// Criação e inicialização da variável para médias
                    JOptionPane.showMessageDialog(null, "A Média das notas é " + media);// Print da mensagem
            }   

            }catch(NumberFormatException erro){// Pega o Erro
                JOptionPane.showMessageDialog(null,"Digite apenas valores possiveis: " + erro);// Print da mensagem de erro
            }
        }else{// Tesre Negativo
            JOptionPane.showMessageDialog(null, "Operação cancelada");// Print da mensagem
        }
    }
}
~~~~
