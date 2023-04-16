<h1>Atividade 04</h1>

<h2>Passos para resolução</h2>

- Criação da public class Atv05.
- Criação do método main.
- Inicialização das variaveis fixas.
- Inicialização da variavel com a soma dos valores.
- Printa mensagem na tela com a soma.

<h3>Código Java</h3>

~~~~
public class BancoTrimestral {
    public static void main (String[] args) {
        double gastosJaneiro = 30000.00; 
        double gastosfevereiro   = 33030.77; //Inicialização das variaveis fixas 
        double gastosMarço = 23899.01;
        
        double gastosTrimestre = gastosJaneiro + gastosfevereiro + gastosMarço; //Inicialização da variavel com a soma dos valores
        System.out.println("O total de gastos do trimeste é R$ " + gastosTrimestre); //Printa mensagem na tela com a soma
    }
}
~~~~
