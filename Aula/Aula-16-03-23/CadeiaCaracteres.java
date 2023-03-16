
public class CadeiaCaracteres {
    public static void main(String arg[]){
        String nome = "Pedro",
            sobrenome = " Moraes";
        String nomeCompleto = nome + sobrenome;
        System.out.println("Nome Completo: " + nomeCompleto);
        System.out.println("Tamanho String: " + nomeCompleto.length());
        System.out.println("PITER PARKER: " 
        + nomeCompleto.equals("Piter Parker"));
        System.out.println("Igual a PEDRO MORAES: " 
        + nomeCompleto.equalsIgnoreCase("Pedro Moraes"));
    }
}
