import java.util.Scanner;//Import da classe

public class Atv08 {//Criaçaõ da classe Atv08
   public static void main(String[] args) {//Criação do método main
    boolean[] economyClass = {false, false, false, false, false};//|
    boolean[] firstClass = {false, false, false, false, false};  //|
    int a = 0;                                                   //|-- Criação e inicialização das variáveis
    int b = 0;                                                   //|
    String swithC;                                               //|
    Scanner l = new Scanner(System.in);                          //|


        while (true) {//While para execução continua
            System.out.println("1 = Primeira Classe e 2 = Classe Econômica");//Print da mensagem
            int classeAv = l.nextInt();//Leitura da entrada com inicialização de variável

            if (b == 5 && classeAv == 1){//Teste de classe cheia
                System.out.print("A Primeira Classe cheia deseja mudar para Classe Econômica(yes/no)?\n");//Print da mensagem
                swithC = l.next();//Leitura da entrada
                if (swithC.equals("yes")){//Teste da entrada
                    economyClass[a] = true;//Preenche poltrona da Classe Econômica
                    a += 1;//Incrementação da variável
                    System.out.print("Sua na poltrona da Classe economica é "+ a + "\n");//Print da mensagem
                }
                if (swithC.equals("no")) {//Teste da entrada
                    System.out.println("O próximo voo parte em 3 horas");//Print da mensagem
                }
            }

            if (classeAv == 1 && b < 5) {//Teste da classe 
                firstClass[b] = true;//Preenche a poltroca
                b += 1;//Incrementa a variável para poltrona
                System.out.print("Sua poltrona da Primeira Classe é "+ b + "\n");//Printa mensagem
            }

            if (a == 5 && classeAv == 2){//Teste de classe cheia
                System.out.print("A Classe Economica cheia deseja mudar para a Primeira Classe(yes/no)?\n");//Printa a mensagem
                swithC = l.next();//Leitura da entrada
                if (swithC.equals("yes")){//Teste da entrada
                    firstClass[b] = true;//Preenche poltrona da Primeira Classe
                    b += 1;//Incrementa a variável da poltrona
                    System.out.print("Sua poltrona da Primeira Classe é "+ b + "\n");//Printa a mensagem
                }
                if (swithC.equals("no")) {//Teste da entrada
                    System.out.println("O próximo voo parte em 3 horas");//Printa a mensagem
                }
            }

            if (classeAv == 2 && a < 5) {//Teste de Classe
                economyClass[a] = true;//Preenche a poltroca
                a += 1;//Incrementa a variável para poltrona
                System.out.print("Sua poltrona da Classe Econômica é "+ a + "\n");//Printa a mensagem
            }
            if (b == 5 && a == 5){//Teste das suas classes cheias
                System.out.print("O avião lotou");//Printa mensagem
                break;//Quebra o While
            }
        }
   }
}