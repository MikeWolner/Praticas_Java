package Atividade_07;

import java.util.Scanner;

public class VetorMenorMaior {
    public void VetorMenor(String[] args) {
        Scanner myObj = new Scanner(System.in);

        double[] numeros = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = myObj.nextDouble();
        }
        myObj.close();

        double menor = numeros[0];
        double maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("Menor" + menor);
        System.out.println("Maior" + maior);
    }    
}
