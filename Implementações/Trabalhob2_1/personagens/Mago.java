
package personagens;

public class Mago extends Personagem {
    public Mago(){
        this.hp = 85;
    }
    @Override
    public void desenhar() {
        System.out.println("Um sabio mago surge.");
    }
    
    @Override
    public void voar(Personagem alvo) {
        System.out.println("O mago está voando com sua magia!");
    }
}
