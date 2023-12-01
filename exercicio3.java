package arraysatividade;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o número de linhas da matriz A: ");
            int linhasA = input.nextInt();
            
            System.out.print("Digite o número de colunas da matriz A: ");
            int colunasA = input.nextInt();
            
            System.out.print("Digite o número de linhas da matriz B: ");
            int linhasB = input.nextInt();
            
            System.out.print("Digite o número de colunas da matriz B: ");
            int colunasB = input.nextInt();
            
            if (colunasA != linhasB) {
                System.out.println("As matrizes não são compatíveis para multiplicação.");
                return;
            }
            
            int[][] matrizA = new int[linhasA][colunasA];
            int[][] matrizB = new int[linhasB][colunasB];
            int[][] matrizC = new int[linhasA][colunasB];
            
            System.out.println("Digite os elementos da matriz A:");
            for (int i = 0; i < linhasA; i++) {
                for (int j = 0; j < colunasA; j++) {
                    matrizA[i][j] = input.nextInt();
                }
            }
            
            System.out.println("Digite os elementos da matriz B:");
            for (int i = 0; i < linhasB; i++) {
                for (int j = 0; j < colunasB; j++) {
                    matrizB[i][j] = input.nextInt();
                }
            }
            
            // Multiplicação das matrizes
            for (int i = 0; i < linhasA; i++) {
                for (int j = 0; j < colunasB; j++) {
                    for (int k = 0; k < colunasA; k++) {
                        matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }

            System.out.println("Resultado da multiplicação das matrizes:");
            for (int i = 0; i < linhasA; i++) {
                for (int j = 0; j < colunasB; j++) {
                    System.out.print(matrizC[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}