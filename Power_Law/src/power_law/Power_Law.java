/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author FATTANI COMPUTERS
 */
public class Power_Law {
    
    int power;
    int current;
    int voltage;
    
    void Calpower(){
        System.out.print("Calculated Power of the System is:  "+(voltage*current)+" Kilowatt  ");
    }
    

    
    public static void main(String[] args) {
        Power_Law Transformer = new Power_Law();
        Transformer.current = 34;
        Transformer.voltage = 110;
        Transformer.power = 0;
        Transformer.Calpower();
        
    }
    
}
