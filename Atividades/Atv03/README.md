
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
                if(a > 100 || b > 100 || c > 100){
                    JOptionPane.showMessageDialog(null,"Informe apenas número abaixo de 100");
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
