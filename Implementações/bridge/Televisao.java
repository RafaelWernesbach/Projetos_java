
package bridge;


public class Televisao implements Dispositivos{
    String nome;
    boolean power = true;
    int volume = 100;
   
    
    

    @Override
    public String getNome() {
    return this.nome;
    }


    @Override
    public boolean setPower() {
      if(power)
      {
          power = false;
      }
      else
      {
          power = true;
      }
      return power;
    }

    @Override
    public int getVolume() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setVolume() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
