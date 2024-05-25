
 
package atividaderosa02;

import java.util.Random;
import java.util.Scanner;

class Guerreiro {
    private String nome;
    private int qtVidas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int setVidas() {
        Random rand = new Random();
        qtVidas = rand.nextInt(4) + 9; // Entre 9 e 12 vidas
        return qtVidas;
    }

    public String prologoIntroducao() {
       
        return "Olá, Guerreiro " + nome + "! Você possui " + qtVidas + " vidas.";
    }

    public int loadLevel1() {
        Scanner scanner = new Scanner(System.in);
        int segredo = new Random().nextInt(100) + 1;

        System.out.println("Neste desafio, o Oráculo lhe dará dicas sobre um número secreto entre 1 e 100.");
        System.out.print("Digite seu palpite: ");
        int palpite = scanner.nextInt();

        if (palpite == segredo) {
            System.out.println("Parabéns! Você acertou o segredo.");
            return 0;
        } else {
            System.out.println("O segredo é " + (palpite < segredo ? "MAIOR" : "MENOR") + " do que seu palpite.");
            return 1;
        }
    }

    public int loadLevel2(int opcao) {
        int guerreiro = new Random().nextInt(6);
        int oraculo = new Random().nextInt(6);
        int soma = guerreiro + oraculo;

        if ((soma % 2 == 0 && opcao == 0) || (soma % 2 != 0 && opcao == 1)) {
            System.out.println("Você ganhou! A soma (" + soma + ") é " + (soma % 2 == 0 ? "PAR" : "ÍMPAR") + ".");
            return 0;
        } else {
            System.out.println("Você perdeu! A soma (" + soma + ") é " + (soma % 2 == 0 ? "PAR" : "ÍMPAR") + ".");
            return 1;
        }
    }

    public String vidaExtra() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Você quer pedir por uma vida extra? (Digite 'Sim' ou 'Não'): ");
        return scanner.nextLine();
    }

    public boolean decidirVidaExtra(String pedidoVidaExtra) {
        return pedidoVidaExtra.equalsIgnoreCase("Sim") && pedidoVidaExtra.split(" ").length > 5;
    }
}
