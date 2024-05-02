import java.util.InputMismatchException;
import java.util.Scanner;

public class Raio {
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite o valor do raio");
        double pi = 3.14159265358979323846;

        try{
        Double R = myObj.nextDouble();

        myObj.close();

        double C = 2 * pi * R; //Comprimento da esfera
        double A = 4 * pi * (R * R); //Area da esfera
        double V = 1.333 * pi * (R*R*R);

        System.out.print(
        "Comprimento: " + String.format("%.2f", C)
        +"\n Area: "+ String.format("%.2f", A)
        +"\n Volume: "+ String.format("%.2f", V)
        );

        }catch(InputMismatchException e){
            System.out.println("Essa variavel nao e valida");
        }
       

       
    }
}