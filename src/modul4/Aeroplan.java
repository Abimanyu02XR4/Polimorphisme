/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

/**
 *
 * @author ASUS
 */
public class Aeroplan extends Vehicle {
    @Override
    public void walk(){
        System.out.println("Aeroplan is Flaying");
    }
    
    @Override
    public void fuel(){
        System.out.println("Fuels");
    }
    public static void main(String[] args){
        Aeroplan garuda= new Aeroplan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
    
}
