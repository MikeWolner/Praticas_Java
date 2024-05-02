import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Math;

public class Pitagoras{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        
        try{
            System.out.println("insira o valor de b");
            double b = myObj.nextDouble();
            System.out.println("Insira o valor de c");
            double c = myObj.nextDouble();
            myObj.close();

            System.out.println("Sua hipotenusa é: " + Math.sqrt(b * b + c * c));
            
        } catch(InputMismatchException e ){
            System.out.println("Uma de suas variáveis não é um número");
        }
    }
}