
package bridge;


public class Monitores implements Telas{
String nome;
boolean power = false;
    public Monitores(String nome){
        this.nome = nome;
    }

    
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
    }
    

