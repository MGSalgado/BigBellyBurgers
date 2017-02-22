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
public class DeluxeBurger extends Burger{

    public DeluxeBurger(String BreadRollType, String meat, double price) {
        super(BreadRollType, meat, price);
        super.limAdditions=2;
        this.setAddition("Fries", 0.5);
        this.setAddition("Soda",1.0);
    }
    
    @Override
    public void getTotal(){
        System.out.println("This is a deluxe burger");
        super.getTotal();
    }
}
