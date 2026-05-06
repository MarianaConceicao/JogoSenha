package jogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {
        jogar();
    }

    public static void jogar() {
    	
    	Scanner sc = new Scanner(System.in);
    	
        System.out.println("|---------------------BEM VINDO!---------------------|");
        System.out.print("| Defina o tamanho da senha que você quer adivinhar: ");
        int tamanhoSenha = sc.nextInt();
        
        while (tamanhoSenha <= 0) {
            System.out.print("| Tamanho inválido! Digite um número maior que zero: ");
            tamanhoSenha = sc.nextInt();
        }

        int[] senha = preencheSenha(tamanhoSenha);
        
        System.out.println("| Tente adivinhar a senha de " + tamanhoSenha + " números entre 0 e " + (tamanhoSenha - 1) + ".  |");
        System.out.println("| Os números da senha não se repetem.                |");
        System.out.println("| Você tem tentativas ILIMITADAS!                     |");
        System.out.println("|----------------------------------------------------|");
        
        int tentativasRealizadas = 0;

        while(true) {
            tentativasRealizadas++;
            System.out.println("\n---------- Tentativa Nº " + tentativasRealizadas + " ----------");
            
            int[] tentativa = preencheTentativa(sc, tamanhoSenha);
            
            mostrar(tentativa, "Sua Tentativa");
            
            
            int numerosCorretos = verificarTentativa(senha, tentativa);
            
            
            System.out.println("\nDígitos corretos no lugar certo: " + numerosCorretos);
            
            if (numerosCorretos == tamanhoSenha) {
                System.out.println("\n=================================================");
                System.out.println("PARABÉNS! Você acertou a senha em " + tentativasRealizadas + " tentativas!");
                mostrar(senha, "A senha era");
                System.out.println("=================================================");
                break; 
            }
        }
        
        sc.close();
    }

    public static int[] preencheSenha(int tamanho) {
        List<Integer> numerosDisponiveis = new ArrayList<>();
        for (int i = 0; i < tamanho; i++) {
            numerosDisponiveis.add(i);
        }

        Collections.shuffle(numerosDisponiveis);

        int[] senha = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            senha[i] = numerosDisponiveis.get(i);
        }
        
        return senha;
    }

    public static int[] preencheTentativa(Scanner sc, int tamanho) {
        int[] tentativa = new int[tamanho];
        int limiteSuperior = tamanho - 1;

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número para a posição " + (i + 1) + " (entre 0 e " + limiteSuperior + "): ");
            tentativa[i] = sc.nextInt();

            while (tentativa[i] < 0 || tentativa[i] > limiteSuperior) {
                System.out.print("Número inválido! Tente novamente um número entre 0 e " + limiteSuperior + ": ");
                tentativa[i] = sc.nextInt();
            }
        }

        return tentativa;
    }
    
    public static void mostrar(int[] v, String nome) {
        System.out.print(nome + ": ");
        
        for (int num : v) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    
    public static int verificarTentativa(int[] s, int[] t) {
        int tamanho = s.length;
        int corretos = 0;

        
        for (int i = 0; i < tamanho; i++) {
            if (t[i] == s[i]) {
                corretos++;
            }
        }
        
        return corretos;
    }
}