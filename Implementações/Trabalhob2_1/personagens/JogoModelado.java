
package personagens;

import armas.Arma_IF;
import java.util.Scanner;
import armas.Fuzil;
import armas.Magia;
import armas.Faca;
import armas.Fogo;
import armas.Revolver;
import armas.Desarmado;
import armas.Escopeta;

public class JogoModelado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        boolean encerrar = false;
        

        
        System.out.println("Escolha seu personagem ou saia do programa");
        System.out.println("1. Mago");
        System.out.println("2. Soldado");
        System.out.println("3. Lutador de Sumo");
        System.out.println("4. General");
        System.out.println("5. Encerrar Programa");
            Personagem jogador = null;
            Personagem vilao = null;

        
        escolha = scanner.nextInt();
        switch(escolha) {
                case 1:
                    jogador = new Mago();
                    jogador.desenhar();
                    escolherArma(jogador, scanner);
                    vilao = new DragaoAlado();
                    vilao.desenhar();
                    iniciarCombate(jogador, vilao, scanner);

                    break;
                case 2:
                    jogador = new Soldado();
                    jogador.desenhar();
                    escolherArma(jogador, scanner);
                    vilao = new DragaoAlado();
                    vilao.desenhar();
                    iniciarCombate(jogador, vilao, scanner); 
                    break;
                case 3:
                    jogador = new LutSumo();
                    jogador.desenhar();
                    escolherArma(jogador, scanner);
                    vilao = new DragaoAlado();
                    vilao.desenhar();
                    iniciarCombate(jogador, vilao, scanner);
                    break;
                case 4:
                    jogador = new General();
                    jogador.desenhar();
                    escolherArma(jogador, scanner);
                    vilao = new DragaoAlado();
                    vilao.desenhar();
                    iniciarCombate(jogador, vilao, scanner);
                    break;
                case 5:
                    System.out.println("Programa encerrado");
                    encerrar = true; // Encerra o programa
                    
                    break;
                default:
                    System.out.println("Escolha inválida!");
                    
                    break;
            }
        
        
        }
       
       private static void escolherArma(Personagem personagem, Scanner scanner) {
        System.out.println("Escolha a arma para " + personagem.getClass().getSimpleName() + ":");
        System.out.println("1. Fuzil");
        System.out.println("2. Magia");
        System.out.println("3. Faca");
        System.out.println("4. Fogo");
        System.out.println("5. Revolver");
        System.out.println("6. Desarmado"); 
        System.out.println("7. Escopeta");
        
       int escolhaArma = scanner.nextInt();

        Arma_IF arma = null;

        switch (escolhaArma) {
            case 1:
                arma = new Fuzil();
                break;
            case 2:
                arma = new Magia();
                break;
            case 3:
                arma = new Faca();
                break;
            case 4:
                arma = new Fogo();
                break;
            case 5:
                arma = new Revolver();
                break;
            case 6:
                arma = new Desarmado();
                break;
            case 7:
                arma = new Escopeta();
                break;
            default:
                System.out.println("Escolha de arma inválida!");
                break;
        }

        if (arma != null) {
            personagem.setArma(arma);
        }
    }
        private static void iniciarCombate(Personagem jogador, Personagem vilao, Scanner scanner) {
        boolean continuar = true;
        vilao.setArma(new Fogo());
        int flag = 0;
        while (continuar) {
            System.out.println("Escolha uma ação para o seu personagem:");
            System.out.println("1. Atacar");
            System.out.println("2. Voar");
            System.out.println("3. Correr");

            int acao = scanner.nextInt();

            switch (acao) {
                case 1:
                    jogador.usarArma(vilao);
                    break;
                case 2:
                    jogador.voar(jogador);
                    flag = 1;
                    break;
                case 3:
                    jogador.correr(jogador);
                    flag = 1;
                    break;
                default:
                    System.out.println("Escolha inválida!");
                    break;
            }

            
            if (jogador.hp <= 0) {
                System.out.println("Você perdeu!");
                continuar = false;
            } else if (vilao.hp <= 0) {
                System.out.println("Você venceu!");
                continuar = false;
                
            }else if (flag == 1){
                System.out.println("Você fugiu");
                continuar = false;
            } else {
                System.out.println("O combate continua...");
                vilao.usarArma(jogador);
            }
        }
    }

         
    }

