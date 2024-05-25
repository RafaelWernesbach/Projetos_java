
package personagens;

import armas.Arma_IF;
import armas.Desarmado;
import armas.Fogo;
import armas.Magia;


public class Personagem {
    Arma_IF arma;
    int hp;

     void desenhar(){
         System.out.println("Spawn generico");
     }
    
            
    public void setArma(Arma_IF arma) {
       if (this instanceof Mago) {
        this.arma = arma;
        System.out.println(getClass().getSimpleName() + " equipou a arma " + arma.getClass().getSimpleName());
    } else if (this instanceof DragaoAlado && arma instanceof Fogo) {
        this.arma = arma;
        System.out.println(getClass().getSimpleName() + " equipou a arma " + arma.getClass().getSimpleName());
    } else if (this instanceof LutSumo && arma instanceof Desarmado) {
        this.arma = arma;
        System.out.println(getClass().getSimpleName() + " equipou a arma " + arma.getClass().getSimpleName());
    } else if ((this instanceof Soldado || this instanceof General) &&
               !(arma instanceof Magia || arma instanceof Fogo)) {
        this.arma = arma;
        System.out.println(getClass().getSimpleName() + " equipou a arma " + arma.getClass().getSimpleName());
    } else {
        System.out.println(getClass().getSimpleName() + " não pode usar essa arma!");
    }
    }
    
   public void usarArma(Personagem alvo) {
        if (arma != null) {
        System.out.println(getClass().getSimpleName() + " usa a arma");
        arma.usar(alvo);
    } else {
        System.out.println(getClass().getSimpleName() + " não possui arma equipada");
    }
    }
    
   public void correr(Personagem alvo) {
        System.out.println(alvo.getClass().getSimpleName() + " correu para longe");
    }
    
  public void voar(Personagem alvo) {
        System.out.println(alvo.getClass().getSimpleName() + " Fugiu voando para longe");
    }
    
    
  public void receberDano(int dano) {
        hp -= dano;
        System.out.println(getClass().getSimpleName() + " recebeu " + dano + " de dano! HP restante: " + hp);
        if (hp <= 0) {
            morrer();
        }
    }
    
    void morrer() {
        System.out.println(getClass().getSimpleName() + " morreu!");
    }
    
  public boolean estaVivo(){
      return hp > 0;  
}
}

