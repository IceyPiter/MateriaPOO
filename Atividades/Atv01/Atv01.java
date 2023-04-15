import java.util.Scanner;

public class Atv01 {
    public static void main(String[] args) {
        float i = -1, soma = 0;
        Scanner s = new Scanner(System.in);
        do {
            try {
                System.out.println("Qual número deseja somar no momento: ");
                i = s.nextFloat();
                soma += i;
            } catch (Exception e) {
                s.nextLine();
            }
        } while (i != 0);
            System.out.printf("a soma é %f", soma);
    s.close();
    }
}
