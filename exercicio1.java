package arraysatividade;

import java.util.Scanner;


public class Exercicio_1 {
    public static void main(String[] args){
        // Declaração e inicialização do vetor de nomes
        try (Scanner scanner = new Scanner(System.in)) {
            // Declaração e inicialização do vetor de nomes
            String[] nomes = new String[10];
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
                nomes[i] = scanner.nextLine();
            }
            
            // Solicita ao usuário que digite o nome a ser buscado
            System.out.print("Digite um nome para buscar no vetor: ");
            String nomeBuscado = scanner.nextLine();
            
            // Verifica se o nome está no vetor
            boolean encontrou = false;
            for (String nome : nomes) {
                if (nome.equalsIgnoreCase(nomeBuscado)) {
                    encontrou = true;
                    break;
                }
            }
            
            // Exibe a mensagem correspondente
            if (encontrou) {
                System.out.println("ACHEI");
            } else {
                System.out.println("NÃO ACHEI");
            }
        }
    }
}