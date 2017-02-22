/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigbellyburgers;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class Burger {
    private String BreadRollType;
    private String meat;
    private double price;
    private ArrayList<Ingredient> ingredientes;
    protected int limAdditions;

    public Burger(String BreadRollType, String meat, double price) {
        this.BreadRollType = BreadRollType;
        this.meat = meat;
        this.ingredientes = new ArrayList<>();
        this.price= price;
        this.limAdditions=4;
    }

    public String getBreadRollType() {
        return BreadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBreadRollType(String BreadRollType) {
        this.BreadRollType = BreadRollType;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
    
    public boolean setAddition(Ingredient add){
        if(this.ingredientes.size()<=limAdditions){
        return this.ingredientes.add(add);
        }else{
            System.out.println("Limit exceeded");
            return false;}
    }
    
    public boolean setAddition(String name, double price){
        if (this.ingredientes.size()<=limAdditions){
        return this.ingredientes.add(new Ingredient(name,price));
        }else{
            System.out.println("Limit exceeded");
            return false;}
        }
    
    public void getTotal (){
        double total = 0;
        
        System.out.println("This is a  "+this.meat+ "burguer"+ " in "+this.BreadRollType+"with a base price of "+ this.price);
        
        total += this.price;
        
        for(Ingredient tempIngredient : this.ingredientes){
            System.out.println("plu"+ tempIngredient.getNombre()+" at "+ tempIngredient.getPrecio());
                tempIngredient.getPrecio();
                total += tempIngredient.getPrecio();
        }
        
        System.out.println("With a grand total of "+total);
    }
    }
    

