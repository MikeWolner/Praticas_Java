package Atividade_07;

import java.util.Scanner;

public class Vetor_soma_par {
    public void Vetor_par (String args[]) {
        Scanner myObj = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = myObj.nextInt();
        }
        myObj.close();
        
        int soma = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                soma += numero;
            }
        }
        System.out.println("Soma dos pares" + soma);
    }
}


