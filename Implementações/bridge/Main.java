
package bridge;

public class Main {
    public static void main(String[] args) {
        Dispositivos televisao = new Televisao();
        Supercontrole supercontrole = new Supercontrole(televisao);
        
        
        supercontrole.LigaDesliga(televisao);
    }
}
