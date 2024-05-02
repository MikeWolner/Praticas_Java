import java.util.InputMismatchException;
import java.util.Scanner;

public class Losango {
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("CALCULAR AREA DE LOSANGO");

        while (true) {
            try{
                System.out.println("Digite a diagonal maior");
                double DiaMa = myObj.nextDouble();
                System.out.println("Digite a diagonal menor");
                double DiaMe = myObj.nextDouble();

                myObj.close();
                
                System.out.println("A area do losango é de: " + DiaMa * DiaMe / 2);
                
            }catch (InputMismatchException e){
                System.out.println("Uma de suas variaveis não é um número");
                }
            break;
            }
        }

        
        
    }