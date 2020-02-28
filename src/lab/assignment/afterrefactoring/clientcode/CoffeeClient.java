package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.AmericanoCoffee;
import lab.assignment.afterrefactoring.MochaCoffee;
import lab.assignment.afterrefactoring.CapuccinoCoffee;
import lab.assignment.afterrefactoring.CoffeeTemplate;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeTemplate coffee = new MochaCoffee();
        coffee.makeCoffee();

        System.out.println("********************");


        coffee = new CapuccinoCoffee();
        coffee.makeCoffee();

        System.out.println("********************");

        coffee = new AmericanoCoffee();
        coffee.makeCoffee();
    }

}
