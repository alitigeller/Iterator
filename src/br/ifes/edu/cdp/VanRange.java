/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.cdp;

/**
 *
 * @author 20111bsi0170
 */
public class VanRange implements Iterator<Vehicle>{
    private Vehicle[] vans;
        private int index;
    
    
    
    public VanRange(){
        vans = new Vehicle[3];
        
        vans[0] =  new BoxVan(new StandardEngine(1600));
                vans[0] =  new BoxVan(new StandardEngine(2000));
                vans[0] =  new Pickup(new TurboEngine(2200));
                 index = 0;
    }
    
    public Vehicle[] getRange()
    {
        return vans;
        }

     @Override
    public boolean hasNext() {
       if(vans[index] != null)
      {
          return true;
      }
        return false;
    }

    @Override
    public Vehicle next() 
    {
        Vehicle temp = vans[index];
            index++;
        return temp; 
    }

    @Override
    public void remove() {
        
    while(this.hasNext())
    {
    vans[index] = vans[index+1]; 
    
    }
    
    }
    
}
