
package personagens;

/**
 *
 * @author BRAIA
 */
public class Soldado extends Personagem {
    public Soldado(){
        this.hp = 100;
    }
    @Override
    public void desenhar() {
        System.out.println("Um valente  soldado chega no campo de batalha.");
    }
    
    @Override
    public void voar(Personagem alvo){
        System.out.println("Um soldado não é capaz de voar");
    }
}
