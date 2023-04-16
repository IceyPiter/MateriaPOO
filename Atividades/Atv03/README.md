<h1>Atividade 03</h1>

<h2>Passos para resolução</h2>
- Import da classe JOptionPane
- Criação da public class, e método main
- Definição dos valores por meio do showInputDialog
- If para testar valores nulos
- Transformação da String dos valores para float
- if para testar se valores são validos
- Caso não seja valido, Mostra mensagem de problema
- Execução do calculo da media, e Impressão do calcula via showMessageDialog
- Catch para captura de erros
- Caso seja executado algum cancel, mostra mensagem "Operação cancelada" via showMessageDialog

<h3>Código Java</h3>

~~~~
import javax.swing.JOptionPane;
public class Atv03 {
    public static void main(String[] args) {
        String nota1 = JOptionPane.showInputDialog("Forneça a Nota da 1º Prova, números de 0-10");
        String nota2 = JOptionPane.showInputDialog("Forneça a Nota da 2º Prova, números de 0-10");
        String nota3 = JOptionPane.showInputDialog("Forneça a Nota do trabalho, números de 0-10");
        
        if (nota1 != null && nota2 != null && nota3 != null){
            try{
                float a = Float.parseFloat(nota1);
                float b = Float.parseFloat(nota2);
                float c = Float.parseFloat(nota3);
                if(a > 10 || b > 10 || c > 10){
                    JOptionPane.showMessageDialog(null,"Informe apenas número igual ou abaixo de 10");
                }else{
                    float media = (a + b + c)/3;
                    JOptionPane.showMessageDialog(null, "A Média das notas é " + media);
            }   

            }catch(NumberFormatException erro){
                JOptionPane.showMessageDialog(null,"Digite apenas valores possiveis: " + erro);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Operação cancelada");
        }
    }
}
~~~~
