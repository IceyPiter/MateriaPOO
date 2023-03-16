 //Classe impressaõ de texto: PrimeiroPragramaJava.java
 /* IFPR - Campus Cascavel
 Disciplina: Programação Orientada  à Objetos
 Professor: Nelson BEllincanta*/
public class PrimeiroProgramaJava
{
    public static void main(String[] args)
    {

        System.out.println("Primeiro Programa em Java!");
        Ola(args);
    }
    public static void Ola(String[] args)
    {
        boolean y = false;
        for (int i = 0; y == false; i++) {
           if(i == 10){
                y = true;
             }
           else{
                System.out.println("Segundo Programa Java >:D");
           }  
        } 
        
    }
    //fim do método main
}//fim da classe PrimeiroProgramaJava
