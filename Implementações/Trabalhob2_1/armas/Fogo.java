
package armas;

import armas.Arma_IF;
import personagens.Personagem;

public class Fogo implements Arma_IF {
    @Override
    public void usar(Personagem alvo) {
        int danoCausado = causarDano();
        alvo.receberDano(danoCausado);
        System.out.println("Soltando fogo pela boca!");
    }

    @Override
    public int causarDano() {
        return 45;
    }
}
