/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicalexampleofinheritance;

/**
 *
 * @author FATTANI COMPUTERS
 */
public class PracticalExampleOfInheritance {

    class Box{
        double width;
        double height;
        double depth;
        
        // Contruct a clone of an object ;
        Box(Box ob){
            width = ob.width;
            height = ob.height;
            depth = ob.depth;
        }
        // Constructer use when no dimensions specified
       Box(double w,double h , double d){
           width = w;
           height = h;
           depth = d;      
        }
       Box(){
           width = -1;
           height = -1;
           depth = -1;
        }
        Box(double len){
           width = height = depth = len;
        }
        // compute and return volume 
        double volume(){
             return width * height * depth;     
         }
    }
    
    // here, Box is extended to include weigth ;
    class BoxWeight extends Box {
        double weight ;// weight of the Box;
        // Constructer for Box Weitght
        BoxWeight(double w , double h , double d , double m){    
            width = w;
            depth = d;
            height = h;
            weight = m;      
        }
        
    }
    class DemoBoxWeight{
        public static void main(String[] args) {
            BoxWeight mybox1 = new BoxWeight(10,20,15,34.3);
            BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
            double vol;
            
            
            vol = mybox1.volume();
            System.out.println("volume of mybox1 is "+ vol);
            System.out.println("volume of mybox1 is "+ mybox1.weight);
            
            vol = mybox2.volume();
            System.out.println("volume of mybox1 is "+ vol);
            System.out.println("volume of mybox1 is "+ mybox2.weight);
            
        }
        
    
   
    }
}
