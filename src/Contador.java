import java.util.Scanner;
import java.util.Locale;

/*
 * Projeto a evoluir:
    *  1. Tratamento de Excesoes
    *  2. Try Catch
 */

public class Contador{

    public static void main(String[] args) {

        double resultado;

        Scanner leia = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro número: ");
        int x = leia.nextInt();

        System.out.println("Digite o segundo número: ");
        int y = leia.nextInt();

        if(x > y){
            System.out.println("erro");
        }else{
            resultado = y-x;
            System.out.println("O seu resultado é: " + resultado + "E a repetição será: ");

            int i =0;
            while(i<=resultado){
                System.out.println(i);
                i++;

            }
        }    

    }    
}