public class Cachorro extends Mamifero {
    String raca;
    public void emitirSom(){System.out.println("Vc é calvo Henrique");}
    public void mover(){System.out.println("To the left");}
    Cachorro(String nome,int idade,String raca){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }
}