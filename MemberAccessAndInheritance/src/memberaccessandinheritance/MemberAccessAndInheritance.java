/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author FATTANI COMPUTERS
 */
public class MemberAccessAndInheritance {

    // In a class hiearchery , private members remain private to their class.
    // This program contains an error and will not compile.
    
    // Create a SuperClass.
    class A {
         int i;// public by default;
         private int j; // private to A ;
         
         void setij(int x, int y){
             i =x;
             j = y;
             
         }
  
    }
         
         
class  B extends A{
        int total;
        void sum(){
            total = i + j ; // Error J is not Accessable here since J is not Accesssable here.
        }
        
    }
    
    
    class Access{
        public static void main(String args[]){
            B subOb = new B();
            
            subOb.set(11,14);
            
            subOb.setij(10,12);
            
            subOb.sum();
            System.out.println("Total is :"+subOb.total);
                    
        }
    }
      
         
    }
          
   
    
}
