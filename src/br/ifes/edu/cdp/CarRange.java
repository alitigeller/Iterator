/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.cdp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 20111bsi0170
 */
public class CarRange implements Iterator<Vehicle>{
    private List<Vehicle> cars;
    private int index;
    

public CarRange(){
    cars = new ArrayList<Vehicle>();
    cars.add(new Saloon(new StandardEngine(1300)));
    cars.add(new Saloon(new StandardEngine(1600)));
    cars.add(new Coupe(new StandardEngine(2000)));
    cars.add(new Sport(new TurboEngine(2500)));
    index = 0;
}

public List<Vehicle> getRange()
{
    return cars;
}

    @Override
    public boolean hasNext() {
       if(cars.get(index) != null)
      {
          return true;
      }
        return false;
    }

    @Override
    public Vehicle next() 
    {
        Vehicle temp = cars.get(index);
            index++;
        return temp; 
    }

    @Override
    public void remove() {
 
    cars.remove(index);
    
    }

}