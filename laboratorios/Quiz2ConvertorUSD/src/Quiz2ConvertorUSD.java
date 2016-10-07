import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Created by kgallardo on 10/06/2016.
 */
public class Quiz2ConvertorUSD {


    public static void main(String[] args) throws IOException{

                    int cantidad;
        double usd, totaleur;

            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Bienvenido(a). Favor introduzca la cantidad a convertir: ");
            cantidad = Integer.parseInt(teclado.readLine());;


        System.out.println("Tienes " + cantidad + " centavos. ");

        usd = cantidad / 100.00;
        totaleur = cantidad * 0.89;



        System.out.println("USD = $" + usd);
        System.out.println("Total de dolares en EUR = E" + totaleur);
    }
}


