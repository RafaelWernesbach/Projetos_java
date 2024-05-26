
package armas;

import personagens.Personagem;


public class Escopeta implements Arma_IF {
    @Override
    public void usar(Personagem alvo) {
        if (alvo.estaVivo()) {
            System.out.println("Chumbando com a escopeta!!!");
            int danoCausado = causarDano();
            alvo.receberDano(danoCausado);
        } else {
            System.out.println("Ele ta morto, mas essa arma é tao quebrada q ele morre dnv!");
        }   
    
    }
    
    @Override
public int causarDano(){
    return 100000;
}
}
