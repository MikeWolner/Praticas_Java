import java.util.InputMismatchException;
import java.util.Scanner;

public class Apartamento {
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);

        String Tipo = null;
        int Diarias = 0;
        try {
            System.out.println("Escreva a quantidade de diarias");
            Diarias = myObj.nextInt();
        } catch(InputMismatchException e){
            System.err.println("Valor digitado nao e numero");
            }

        System.out.println("Escreva o tipo de apartamento. Apenas(S/D)");
        Tipo = myObj.next().toUpperCase();
        myObj.close();
        

        Double tax = 0.0;
        if (Tipo.equals("S")) {
            if(Diarias < 10){tax = 100.00;}
            if(Diarias >= 10 && Diarias <= 15) {tax = 90.00;}
            if(Diarias > 15){tax = 80.00;}
        }else if (Tipo.equals("M")) {
            if(Diarias < 10){tax = 140.00;}
            if(Diarias >= 10 && Diarias <=15){tax = 120.00;}
            if(Diarias > 15){tax = 100.00;}
        }else{
            System.out.println("não é um tipo");
        }
        System.out.println(tax);
    }
}
