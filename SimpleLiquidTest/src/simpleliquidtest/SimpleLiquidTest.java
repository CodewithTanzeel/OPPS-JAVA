/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simpleliquidtest;
import java.util.Random;

class Liquid {
    double amount; // in ml
    Liquid(double amount) {
        this.amount = amount;
    }
    void add(double ml) {
        amount += ml;
        System.out.println("Added liquid. Total: " + amount + "ml");
    }
    void remove(double ml) {
        amount -= ml;
        System.out.println("Removed liquid. Left: " + amount + "ml");
    }
    void removeAll() {
        System.out.println("Removed all " + amount + "ml of liquid");
        amount = 0;
    }
}
class Coffee extends Liquid {
    Coffee(double amount) {
        super(amount);
    }
    @Override
    void add(double ml) {
        super.add(ml);
        System.out.println("(This was coffee)");
    }
    void swirl() {
        System.out.println("Swirling the coffee!");
    }
}
class Milk extends Liquid {
    Milk(double amount) {
        super(amount);
    }
    @Override
    void remove(double ml) {
        super.remove(ml);
        System.out.println("(This was milk)");
    }
}
public class SimpleLiquidTest {
    public static void main(String[] args) {
        Liquid[] liquids = new Liquid[10];
        Random rand = new Random();
        // Filling array with random liquids
        for (int i = 0; i < liquids.length; i++) {
            int choice = rand.nextInt(3); // 0, 1, or 2 
            if (choice == 0) {
                liquids[i] = new Liquid(100);
            } else if (choice == 1) {
                liquids[i] = new Coffee(150);
            } else {
                liquids[i] = new Milk(200);
            }
        }// Test all liquids
        for (Liquid liquid : liquids) {
            System.out.println("\n--- Testing " + liquid.getClass().getSimpleName() + " ---");
            liquid.add(50);
            liquid.remove(30);
            liquid.removeAll();
            // Special coffee behavior
            if (liquid instanceof Coffee) {
                ((Coffee)liquid).swirl();
            }
        }
    }
}
