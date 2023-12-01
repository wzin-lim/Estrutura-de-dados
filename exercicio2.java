package arraysatividade;

import java.util.Scanner;


public class Exercicio_2 {
    public static void main(String[] args) {
        // Inicialização dos vetores
        try (Scanner scanner = new Scanner(System.in)) {
            // Inicialização dos vetores
            int[] numeros = new int[20];
            int[] pares;
            int[] impares;
            int contPares = 0;
            int contImpares = 0;
            
            // Leitura dos números e separação entre pares e ímpares
            for (int i = 0; i < 20; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
                
                if (numeros[i] % 2 == 0) {
                    contPares++;
                } else {
                    contImpares++;
                }
            }
            
            // Inicialização dos vetores de pares e ímpares
            pares = new int[contPares];
            impares = new int[contImpares];
            
            // Preenchimento dos vetores de pares e ímpares
            contPares = 0;
            contImpares = 0;
            for (int i = 0; i < 20; i++) {
                if (numeros[i] % 2 == 0) {
                    pares[contPares++] = numeros[i];
                } else {
                    impares[contImpares++] = numeros[i];
                }
            }
            
            // Impressão dos vetores
            System.out.println("\nNúmeros Digitados:");
            for (int num : numeros) {
                System.out.print(num + " ");
            }
            
            System.out.println("\n\nNúmeros Pares:");
            for (int num : pares) {
                System.out.print(num + " ");
            }
            
            System.out.println("\n\nNúmeros Ímpares:");
            for (int num : impares) {
                System.out.print(num + " ");
            }
        }
    }
}