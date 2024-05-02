package Atividade_08;

public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int valor = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }
        //exibir
        System.out.println("----------------Matriz------------------");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }

        //diagonal
        System.out.println("---------------------diagonal--------------------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((i == 0 || i == matriz.length - 1) && j == 0) {
                    int temp = matriz[i][j];
                    matriz[i][j] = matriz[i][matriz[i].length - 1];
                    matriz[i][matriz[i].length - 1] = temp;
                } else if ((i == 1 || i == matriz.length - 2) && j == 1) {
                    int temp = matriz[i][j];
                    matriz[i][j] = matriz[i][matriz[i].length - 2];
                    matriz[i][matriz[i].length - 2] = temp;
                }
            }
        }
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }

        //exibir pares
        System.out.println("----------------Apenas Pares------------------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i % 2 == 0) {
                    if (matriz[i][j] % 2 == 0) {
                        System.out.print(matriz[i][j] + "\t");
                    } else {
                        System.out.print("x\t");
                    }
                } else {
                    System.out.print("x\t");
                }
            }
            System.out.println();
        }

        //invertida
        System.out.println("----------------Invertida------------------");
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
