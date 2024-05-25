
package personagens;


public class General extends Personagem {
    public General(){
        this.hp = 110;
    }
    @Override
    void desenhar() {
        System.out.println("Um poderoso general aparece.");
    }
    
    @Override
    public void voar(Personagem alvo){
        System.out.println("O general não voa...");
    }
    
}
