
package bridge;


public abstract class Controles {
    public Dispositivos dispositivo;
    public Telas tela;
    public Controles(Dispositivos dispositivo){
        this.dispositivo  = dispositivo;
        this.tela = tela;
    }
    
    void LigaDesliga(Dispositivos dispositivo){
        
        System.out.print("Dispositivo ");
        if(dispositivo.setPower())
        {
            System.out.print("Desligado");
        }
        else
        { 
            System.out.print("Ligado");
        }
        
    }
    
    
    
    
}
