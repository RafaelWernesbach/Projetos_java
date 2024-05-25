
package personagens;

public class DragaoAlado extends Personagem {
    public DragaoAlado(){
        this.hp = 300;
    }
    @Override
    void desenhar() {
        System.out.println("Um terrivel dragão alado surge dos céus\nDerrote ele!!!");
    }
    // Dragões voam naturalmente
    void voar() {
        System.out.println("O dragão alado está voando majestosamente!");
    }
}
