import java.util.InputMismatchException;
import java.util.Scanner;

public class Academia {
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);

        String Sexo = null;
        double Idade = 0.0;
        try {
            System.out.println("Escreva a idade");
            Idade = myObj.nextInt();
        } catch(InputMismatchException e){
            System.err.println("Valor digitado nao e numero");
            }

        System.out.println("Escreva o sexo. Apenas(H/M)");
        Sexo = myObj.next().toUpperCase();;
        myObj.close();
        

        Double tax = 0.0;
        if (Sexo.equals("H")) {
            if(Idade < 15){tax = 60.00;}
            if(Idade >= 16 && Idade <= 18) {tax = 75.00;}
            if(Idade >= 19 && Idade <= 30){tax = 90.00;}
            if(Idade >= 31 && Idade >= 40){tax = 85.00;}
            if(Idade > 40){tax = 80.00;}

        }else if (Sexo.equals("M")) {
            if(Idade < 18){tax = 60.00;}
            if(Idade >= 19 && Idade <=25){tax = 90.00;}
            if(Idade >= 26 && Idade <= 40){tax = 85.00;}
            if(Idade > 40){tax = 80.00;}
        } else{
            System.out.println("Nao e um sexo valido");
        }
        System.out.println(tax);
       
    }
}