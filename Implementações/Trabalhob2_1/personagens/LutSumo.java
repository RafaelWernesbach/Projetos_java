
package personagens;

public class LutSumo extends Personagem {
    public LutSumo(){
        this.hp = 400;
    }
    
    @Override
    public void desenhar() {
        System.out.println("Um grande lutador de sumô surge.");
    }
    @Override
    public void voar(Personagem alvo) {
        System.out.println("eu acho que um lutador de sumô não voa...");
    }
}
