public class Passaro extends Ave{
    String cor;
    public void emitirSom(){System.out.println("Vc é calvo Henrique");}
    public void voar(){System.out.println("More high");}
    Passaro(String nome,int idade,String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
}
