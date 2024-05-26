/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    

