/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigbellyburgers;

/**
 *
 * @author Alumno
 */
public class HealthyBurger extends Burger{

    public HealthyBurger(String meat, double price) {
        super("Brown type", meat, price);
        limAdditions = 6;
    }
    
    @Override
    public void getTotal(){
        System.out.println("This is a Healthy Burger");
        super.getTotal();
    }
}
