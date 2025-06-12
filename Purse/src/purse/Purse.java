/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package purse;

public class Purse {
    private int rupees;
    private int paisas;
    public Purse() {
        this.rupees = 0;
        this.paisas = 0;
    }
    public Purse(int rupees, int paisas) {
        // Handle overflow (100 paisas = 1 rupee)
        this.rupees = rupees + paisas / 100;
        this.paisas = paisas % 100;
    }
    public void resetToZero() {
        this.rupees = 0;
        this.paisas = 0;
    }
    public int convertToPaisas() {
        return this.rupees * 100 + this.paisas;
    }
    public void addMoney(int rupees, int paisas) {
        this.paisas += paisas;
        this.rupees += rupees + this.paisas / 100;
        this.paisas = this.paisas % 100;
    }
    public void deleteMoney(int rupees, int paisas) {
        int totalCurrent = this.convertToPaisas();
        int toRemove = rupees * 100 + paisas;
        if (toRemove > totalCurrent) {
            System.out.println("Not enough money in purse!");
            return;
        }
        int remaining = totalCurrent - toRemove;
        this.rupees = remaining / 100;
        this.paisas = remaining % 100;
    }
    public void displayMoney() {
        System.out.println("Money in purse:  Pkr " + rupees + "." + String.format("%02d", paisas));
    }
    public static void main(String[] args) {
        Purse myPurse = new Purse(); 
        myPurse.displayMoney();       
        myPurse.addMoney(5, 75);      
        myPurse.displayMoney();       
        myPurse.addMoney(2, 50);      
        myPurse.displayMoney();       
        myPurse.deleteMoney(3, 25);   
        myPurse.displayMoney();      
        System.out.println("Total in paisas: " + myPurse.convertToPaisas());  
        myPurse.resetToZero();
        myPurse.displayMoney();       
    }
}