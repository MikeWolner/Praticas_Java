import java.util.InputMismatchException;
import java.util.Scanner;

public class Equacao {
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);
        double a = 0.0,b = 0.0, c = 0.0, d = 0.0;
        try{
            a = myObj.nextDouble();
            b = myObj.nextDouble();
            c = myObj.nextDouble();
            d = (b*b) - 4  * a * c;
            myObj.close();
        }catch(InputMismatchException e){
            System.err.println("Não é número");
        }

        if (a == 0 && b == 0 && c == 0){System.out.println("Igualdade confirmada 0=0");}
        else if (a == 0 && b==0){System.out.println("Coeficientes informados incorretamente");}
        else if (a == 0) {System.out.println("Esta e uma equacao de primeiro grau. X = " +(-1*c / b));}
        else{
            System.out.println("Esta e um equacao de segundo grau");
            if (d < 0) {System.out.println("Esta equacao nao possui raizes reais: Delta = " + d);}
            else if (d == 0) {System.out.println("Esta equacao possui duas raizes iguais: X = " +(-1*b / (2*a)));}
            else if (d > 0) {
                System.out.println("Esta equacao possui duas raizes diferentes");
                System.out.println("Delta: " + d);
                System.out.println("x'  = " +(-1*b + Math.sqrt((b*b) - 4 * a * c))/2);
                System.out.println("x'' = " +(-1*b - Math.sqrt((b*b) - 4 * a * c))/2);
            }
        }

    }
}