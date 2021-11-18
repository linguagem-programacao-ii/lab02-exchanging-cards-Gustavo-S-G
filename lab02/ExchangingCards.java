import java.io.IOException;
import java.util.Scanner;

public class ExchangingCards{
    public static void main(String[] args) throws IOException{
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int y;
        int contadorBetty;
        int contadorAlice;
        while (a!=0 && b !=0){
            int[] cartasAlice = new int[100001];
            int[] cartasBetty = new int[100001];
            contadorBetty = 0;
            contadorAlice = 0;

            for (int i = 0; i<a; i++){
                y = teclado.nextInt();

                cartasAlice[y]++;
            }
            for (int i = 0; i<b; i++){
                y = teclado.nextInt();

                cartasBetty[y]++;
            }

            for (int i=0; i<cartasAlice.length; i++){
                if (cartasAlice[i] != 0 && cartasBetty[i] == 0){
                    contadorAlice++;
                } else if (cartasAlice[i] == 0 && cartasBetty[i] != 0){
                    contadorBetty++;
                }
            }

            System.out.println(Math.min(contadorAlice, contadorBetty));
            a = teclado.nextInt();
            b = teclado.nextInt();
        }
        teclado.close();
    }
}