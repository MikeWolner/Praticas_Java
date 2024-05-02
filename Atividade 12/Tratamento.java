package Atividade_12;
import java.util.Scanner;

public class Tratamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o dividendo: ");
        int dividendo = scanner.nextInt();
        
        System.out.print("Digite o divisor: ");
        int divisor = scanner.nextInt();
        
        try {
            int resultado = Divisor.divide(dividendo, divisor);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        scanner.close();
    }
}

class Divisor {
    public static int divide(int dividendo, int divisor) throws ArithmeticException {
        if (dividendo == 0 || divisor < 10) {
            throw new ArithmeticException("Dividendo igual a zero ou divisor menor que 10.");
        }
        return dividendo / divisor;
    }
}

