
package atividaderosa02;

import java.util.Scanner;

class Estado {
    private String nome;
    private Guerreiro warrior;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void iniciarJogo() {
        warrior = new Guerreiro();
        warrior.setNome(nome);
        int vidas = warrior.setVidas();
        System.out.println(warrior.prologoIntroducao());

        int vidasPerdidas = 0;

        while (vidasPerdidas < vidas) {
            int resultadoLevel1 = warrior.loadLevel1();
            vidasPerdidas += resultadoLevel1;

            if (vidasPerdidas >= vidas) {
                System.out.println("Você perdeu o jogo.");
                break;
            }

            System.out.println("Você ainda tem " + (vidas - vidasPerdidas) + " vidas.");
            System.out.println("A próxima fase é um jogo de PAR ou ÍMPAR com o Oráculo.");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Escolha (0 para PAR, 1 para ÍMPAR): ");
            int escolha = scanner.nextInt();
            int resultadoLevel2 = warrior.loadLevel2(escolha);

            if (resultadoLevel2 == 0) {
                System.out.println("Você ganhou o jogo!");
                break;
            }

            if (vidas - vidasPerdidas == 1) {
                System.out.println("Você tem apenas 1 vida restante!");
                String pedidoVidaExtra = warrior.vidaExtra();

                if (warrior.decidirVidaExtra(pedidoVidaExtra)) {
                    vidas++;
                    System.out.println("Você ganhou uma vida extra!");
                }
            }
        }
    }
}









