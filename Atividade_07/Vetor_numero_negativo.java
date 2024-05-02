package Atividade_07;

import java.util.Scanner;

public class Vetor_numero_negativo {
    public void Vetor_negativo () {
        Scanner myObj = new Scanner(System.in);

        double[] numeros = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero real: ");
            numeros[i] = myObj.nextDouble();
        }
        myObj.close();
        System.out.print("Posições com números negativos: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                System.out.print(i + " ");
            }
        }

    }
}