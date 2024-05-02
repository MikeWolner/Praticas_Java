import java.util.InputMismatchException;
import java.util.Scanner;

public class Celsius {
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Insira sua temperatura em Celsius");
        try{
            double C = myObj.nextDouble();
            myObj.close();
            System.out.println((C * 1.8) + 32);

        } catch (InputMismatchException e){
            System.out.println("O valor não é um número");
        }

    }
}
