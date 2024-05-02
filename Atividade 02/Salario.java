import java.util.InputMismatchException;
import java.util.Scanner;

public class Salario {
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);

        try{
            System.out.println("Digite o salário mínimo atual");
            double Smin = myObj.nextDouble();
            System.out.println("Digite o salário do funcionário");
            double Sfun = myObj.nextDouble();
            myObj.close();
            if (Smin < Sfun) {
                System.out.println((Sfun / Smin)* 100 + "% Acima do salário mínimo");
            }
            else if(Smin > Sfun){
                System.out.println(Smin / Sfun * 100 + "% abaixo do salário mínimo");
            }
        } catch (InputMismatchException e){
            System.out.println("Valor inserido não é número");
        }
    
    }        
}
