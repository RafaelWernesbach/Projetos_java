
package armas;

import personagens.Personagem;

public class Revolver implements Arma_IF {
    @Override
    public void usar(Personagem alvo) {
        if (alvo.estaVivo()) {
            System.out.println("Disparando com o revolver!");
            int danoCausado = causarDano();
            alvo.receberDano(danoCausado);
        } else {
            System.out.println("Não é possível atacar um personagem morto!");
        }   
    
    }
    @Override
public int causarDano(){
    return 120;
}
}
