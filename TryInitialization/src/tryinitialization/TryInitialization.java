/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tryinitialization;

/**
 *
 * @author FATTANI COMPUTERS
 */

public class TryInitialization {
    static int[] values = new int[10];
    static{
        System.out.println("Running initialization block.");
        for(int i = 0; i < values.length; i++){
            values[i] = (int)(100.0 * Math.random());
            
        }
        
    }

    //List values in the arry of an object;
    
    
    void listValues(){
        //AlternativeApproach  make this method static
        System.out.println();
        for (int value:values){
            System.out.println(" "+ value);
        }
        System.out.println();
        }
    public static void main(String[] args) {
        TryInitialization example  = new TryInitialization();
        System.out.println("\n FirstObject:");
        example.listValues();
        
        
        example = new TryInitialization();
        System.out.println("\n Second object");
        example.listValues();
        // since main is static that why we have to call it through an object
    }
    
}
