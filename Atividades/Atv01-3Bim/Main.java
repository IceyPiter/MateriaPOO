public class Main {
    public static void main(String[] args) {
        Cachorro cachorro;
        Passaro passaro;
        cachorro = new Cachorro("Astoufo", 85, "Desconhecida");
        passaro = new Passaro("Wilton", 107, "Ghost Eagle");
        System.out.println(cachorro.raca);
        System.out.println(cachorro.nome);
        System.out.println(cachorro.idade);
        System.out.println(passaro.cor);
        System.out.println(passaro.nome);
        System.out.println(passaro.idade);
        cachorro.emitirSom();
        cachorro.mover();
        passaro.emitirSom();
        passaro.voar();
    }
}
