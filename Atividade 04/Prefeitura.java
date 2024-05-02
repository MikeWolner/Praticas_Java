import java.util.Scanner;

public class Prefeitura {
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);
        double 
        salar = 0,
        maxSalar = 0;

        int 
        filho = 0,
        maxFilhos = 0, 
        q = -1;

        do {
            maxSalar += salar;
            maxFilhos += filho;
            q++;
            
            System.out.println("Digite o salario");
            salar = myObj.nextDouble();

            System.out.println("digite a quantidade de filhos");
            filho = myObj.nextInt();
            
        } while(salar >= 0);
        myObj.close();

        System.out.println((q));
        System.out.println("Media salarial: " + maxSalar/q);
        System.out.println("Media de filhos: " + maxFilhos/q);
        
        

    

    }
}
