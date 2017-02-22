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

    public DeluxeBurger(String BreadRollType, String meat, double price, Ingredient ingrediente1, Ingredient ingrediente2) {
            
        super(BreadRollType, meat, price);
        super.limAdditions=2;
        this.setAddition(ingrediente1);
        this.setAddition(ingrediente2);
    }
    
    public DeluxeBurger(String BreadRollType, String meat, double price, String name1, double price1, String name2, double price2) {
            
        super(BreadRollType, meat, price);
        super.limAdditions=2;
        this.setAddition(name1,price1);
        this.setAddition(name2,price2);
    }
    
    @Override
    public void getTotal(){
        System.out.println("This is a deluxe burger");
        super.getTotal();
    }
}
